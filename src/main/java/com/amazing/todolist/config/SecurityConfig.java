package com.amazing.todolist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        // 기본 로그인폼 제거
        // httpSecurity.httpBasic().disable();

        // 이건 무슨 옵션?
        // csrf 가 무엇인지는 추후 검색
        httpSecurity.cors().and();
        httpSecurity.csrf().disable();
    }
}
