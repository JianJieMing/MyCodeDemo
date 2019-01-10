package com.eshare.uflo.example.filter;

import com.eshare.uflo.example.RequestHolder;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Classname TestFilter
 * @Date 2019/1/9 9:27
 * @Created by jianjieming
 */
public class TestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        RequestHolder.setThreadLocal(request);
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            RequestHolder.remove();
        }
    }

    @Override
    public void destroy() {

    }
}
