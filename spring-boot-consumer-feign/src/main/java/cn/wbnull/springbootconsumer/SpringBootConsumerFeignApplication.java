package cn.wbnull.springbootconsumer;

import cn.wbnull.springbootconsumer.config.ComponentScanExclude;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Spring Boot 启动类
 *
 * @author dukunbiao(null)  2019-04-25
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = ComponentScanExclude.class)})
public class SpringBootConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerFeignApplication.class, args);
    }
}
