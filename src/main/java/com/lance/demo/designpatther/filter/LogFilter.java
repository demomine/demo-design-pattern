package com.lance.demo.designpatther.filter;

public class LogFilter implements Filter {
    @Override
    public void doFilter(String value, FilterChain filterChain) {
        System.out.println("before value is " + value);
        filterChain.doFilter(value, filterChain);
        System.out.println("after value is " + value);
    }
}
