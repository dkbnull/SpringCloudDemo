package cn.wbnull.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 服务过滤
 *
 * @author dukunbiao(null)  2019-04-30
 * https://github.com/dkbnull/SpringCloudDemo
 */
@Component
public class GlobalFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest servletRequest = context.getRequest();

        if (servletRequest.getRequestURI().contains("v2/api-docs")) {
            return null;
        }

        Object token = servletRequest.getHeader("token");
        if (token == null) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("error: token is null");
            } catch (IOException e) {
            }
        }

        return null;
    }
}
