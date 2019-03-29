package com.example.springboot_example.config;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @program: springboot_example
 * @description:  web 配置
 * @author: liulei
 * @create: 2019-03-13 16:49
 **/

@Configuration
public class WebConfiguration {

    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    /**
    * @Description: 配置过滤器
    * @Param: []
    * @return: org.springframework.boot.web.servlet.FilterRegistrationBean
    * @Author: Liulei
    * @Date: 2019/3/14
    */
    @Bean
    public FilterRegistrationBean testFilterRegistration(){
        FilterRegistrationBean  registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName","paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);
        return registration;

    }
    /**
    * @Description: 创建过滤器
    * @Param:
    * @return:
    * @Author: Liulei
    * @Date: 2019/3/14
    */
    public class MyFilter implements Filter {
        @Override
        public void destroy() {
            // TODO Auto-generated method stub
        }

        @Override
        public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
                throws IOException, ServletException {
            // TODO Auto-generated method stub
            HttpServletRequest request = (HttpServletRequest) srequest;
            System.out.println("this is MyFilter,url :"+request.getRequestURI());
            filterChain.doFilter(srequest, sresponse);
        }

        @Override
        public void init(FilterConfig arg0) {
            // TODO Auto-generated method stub
        }
    }
}
