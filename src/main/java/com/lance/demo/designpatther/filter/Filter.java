package com.lance.demo.designpatther.filter;

public interface Filter {
    void doFilter(String value, FilterChain filterChain);
}
