package cn.wbnull.springbootconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Spring Boot 启动类
 *
 * @author dukunbiao(null)  2019-04-25
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringBootConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerFeignHystrixApplication.class, args);
    }
}
