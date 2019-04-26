package cn.wbnull.springbootconsumer.fallback;

import cn.wbnull.springbootconsumer.feign.GatewayFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 熔断处理类
 *
 * @author dukunbiao(null)  2019-04-26
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@Component
public class GatewayFallbackFactory implements FallbackFactory<GatewayFeignClient> {

    @Override
    public GatewayFeignClient create(Throwable throwable) {
        return (request) -> {
            request.put("fallback", "spring-boot-consumer-feign-hystrix by GatewayFallbackFactory");
            request.put("throwable", throwable.toString());

            return request;
        };
    }
}
