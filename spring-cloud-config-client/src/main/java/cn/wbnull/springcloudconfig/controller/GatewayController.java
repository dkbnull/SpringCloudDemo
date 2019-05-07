package cn.wbnull.springcloudconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入口类
 *
 * @author dukunbiao(null)  2019-05-07
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@RestController
@Scope("prototype")
public class GatewayController {

    @Value("${version}")
    private String version;

    @Value("${profile}")
    private String profile;

    @GetMapping(value = "/gateway")
    public String gateway() throws Exception {
        return "version:" + version + ",profile:" + profile;
    }
}
