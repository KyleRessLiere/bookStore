package com.graphqljava.tutorial.bookDetails;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class BasicAuthFilter extends OncePerRequestFilter {

    private static final String AUTH_HEADER = "Authorization";
    private static final String ADMIN_CREDENTIALS = "Basic YWRtaW46YWRtaW4=";  // Base64 encoded "admin:admin"

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws javax.servlet.ServletException, java.io.IOException {
        String authHeader = request.getHeader(AUTH_HEADER);
        if (authHeader != null && ADMIN_CREDENTIALS.equals(authHeader)) {
            request.setAttribute("isAdmin", true);
        }
        filterChain.doFilter(request, response);
    }
}
