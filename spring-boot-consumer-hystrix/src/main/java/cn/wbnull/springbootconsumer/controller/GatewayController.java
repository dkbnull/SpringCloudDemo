package cn.wbnull.springbootconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * 入口类
 *
 * @author dukunbiao(null)  2019-04-26
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@RestController
@Scope("prototype")
public class GatewayController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/users")
    @HystrixCommand(fallbackMethod = "usersFallback")
    public Map<String, String> users(@RequestBody Map<String, String> request) throws Exception {
        Thread.sleep(2000);

        ResponseEntity<Map> responseEntity = restTemplate.postForEntity("http://spring-boot-provider/springbootprovider/users", request, Map.class);

        return responseEntity.getBody();
    }

    public Map<String, String> usersFallback(Map<String, String> request) throws Exception {
        request.put("fallback", "spring-boot-consumer-hystrix");

        return request;
    }
}
