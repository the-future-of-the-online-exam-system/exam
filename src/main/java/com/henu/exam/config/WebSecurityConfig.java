package com.henu.exam.config;

import com.henu.exam.service.impl.UserPermission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService() {
        return new UserPermission();
    }
    /**
     * 配置忽略的静态文件，不加的话，登录之前页面的css,js不能正常使用，得登录之后才能正常.
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        // 忽略URL
        web.ignoring().antMatchers("/**/*.js", "/api/*.json", "/**/*.css", "/**/*.js", "/**/*.map", "/**/*.html",
                "/**/*.png");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //指定了/和/home不需要任何认证就可以访问，
                .antMatchers("/", "/common/**", "/errorPage").permitAll();

    }
}
