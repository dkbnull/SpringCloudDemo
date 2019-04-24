package cn.wbnull.springbootconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 入口类
 *
 * @author dukunbiao(null)  2019-04-12
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@RestController
@Scope("prototype")
public class GatewayController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/gateway")
    public String gateway() throws Exception {
        return restTemplate.getForObject("http://spring-boot-provider/springbootprovider/gateway", String.class);
    }
}