package com.zjcpx.cms.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * PackageName:com.zjcpx.cms.interceptor
 * PROJECT_NAME:TestSSM
 * ClassName: LoginInterceptor
 * Package: com.zjcpx.cms.interceptor
 *
 * @Author zjcxp.com
 * @Create 2024/4/15 14:48
 * @Version 1.0
 * Description:
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

}
