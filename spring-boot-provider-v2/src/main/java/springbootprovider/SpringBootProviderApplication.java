package springbootprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Boot 启动类
 *
 * @author dukunbiao(null)  2019-04-12
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringBootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProviderApplication.class, args);
    }
}
