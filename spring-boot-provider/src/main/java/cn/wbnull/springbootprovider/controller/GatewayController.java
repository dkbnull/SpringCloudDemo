package cn.wbnull.springbootprovider.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入口类
 *
 * @author dukunbiao(null)  2019-04-12
 */
@RestController
@Scope("prototype")
public class GatewayController {

    @GetMapping(value = "/gateway")
    public String gateway() throws Exception {
        return "hello world,this is spring-boot-provider";
    }
}
