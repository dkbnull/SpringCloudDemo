package cn.wbnull.springbootconsumer.config.loadbalancer;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * 自定义负载均衡策略类
 *
 * @author dukunbiao(null)  2019-04-24
 *         https://github.com/dkbnull/SpringCloudDemo
 */
public class GlobalRule implements IRule {

    private ILoadBalancer iLoadBalancer;

    @Override
    public Server choose(Object o) {
        List<Server> servers = iLoadBalancer.getAllServers();
            return servers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.iLoadBalancer = iLoadBalancer;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.iLoadBalancer;
    }
}
