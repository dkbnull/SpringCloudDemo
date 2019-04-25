package cn.wbnull.springbootconsumer.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置类
 *
 * @author dukunbiao(null)  2019-04-25
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@Configuration
@ComponentScanExclude
public class GlobalConfiguration {

    @Bean
    public Contract GlobalContract() {
        return new Contract.Default();
    }
}
