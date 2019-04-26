package cn.wbnull.springbootconsumer.controller;

import cn.wbnull.springbootconsumer.feign.GatewayFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 入口类
 *
 * @author dukunbiao(null)  2019-04-25
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@RestController
@Scope("prototype")
public class GatewayController {

    @Autowired
    private GatewayFeignClient gatewayFeignClient;

    @GetMapping(value = "/gateway")
    public String gateway() throws Exception {
        return gatewayFeignClient.gateway();
    }

    @PostMapping(value = "/user")
    public String user(@RequestParam(value = "name") String name) throws Exception {
        return gatewayFeignClient.user(name);
    }

    @PostMapping(value = "/users")
    public Map<String, String> users(@RequestBody Map<String, String> request) throws Exception {
        return gatewayFeignClient.users(request);
    }
}
