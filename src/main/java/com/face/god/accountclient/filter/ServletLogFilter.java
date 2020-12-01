package com.face.god.accountclient.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Create by KT104968 on 2020/12/01
 */
@Slf4j
//@Component
@WebFilter(filterName = "servletLogFilter",urlPatterns = "/index")
public class ServletLogFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServletLogFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info(filterConfig.getFilterName().concat(" init=====================>"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        LOGGER.info(httpServletRequest.getPathInfo().concat("<========================"));
        chain.doFilter(httpServletRequest, response);
    }

    @Override
    public void destroy() {
        LOGGER.info("ServletLogFilter destroy=====================>");
    }
}
