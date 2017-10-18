package com.lance.demo.designpatther.filter;

public class RenameFilter implements Filter {
    @Override
    public void doFilter(String value, FilterChain filterChain) {
        value = value + "  " + value;
        filterChain.doFilter(value, filterChain);
    }
}
