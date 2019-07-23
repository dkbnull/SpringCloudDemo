package cn.wbnull.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Spring Boot 启动类
 *
 * @author dukunbiao(null)  2019-04-30
 * https://github.com/dkbnull/SpringCloudDemo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }
}
