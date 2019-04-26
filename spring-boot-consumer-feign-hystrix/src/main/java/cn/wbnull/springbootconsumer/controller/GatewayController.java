package cn.wbnull.springbootconsumer.controller;

import cn.wbnull.springbootconsumer.feign.GatewayFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    private GatewayFeignClient gatewayFeignClient;

    @PostMapping(value = "/users")
    public Map<String, String> users(@RequestBody Map<String, String> request) throws Exception {
        Thread.sleep(2000);

        return gatewayFeignClient.users(request);
    }
}
