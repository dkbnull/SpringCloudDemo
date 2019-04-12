package cn.wbnull.springbootconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Spring Boot 启动类
 *
 * @author dukunbiao(null)  2019-04-12
 */
@SpringBootApplication
public class SpringBootConsumerApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerApplication.class, args);
    }
}
