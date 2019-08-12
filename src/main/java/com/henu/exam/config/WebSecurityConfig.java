package com.henu.exam.config;

//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
public class WebSecurityConfig{

//    @Bean
//    UserDetailsService authUserDetailService() {
//        return new AuthUserDetailService();
//    }
//
//    //认证
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.userDetailsService(userDetailsService()).passwordEncoder(new PasswordEncoder() {
//            @Override
//            public boolean matches(CharSequence rawPassword, String encodedPassword) {
//                //匹配
//                return encodedPassword.equals(encode(rawPassword));
//            }
//
//            @Override
//            public String encode(CharSequence rawPassword) {
//                return MD5Util.encode((String) rawPassword);
//            }
//        });
//    }
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        // 忽略URL
//        web.ignoring().antMatchers("/static/**");
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
////        http.authorizeRequests()
////                .antMatchers("/common/**","/").permitAll()
////                .antMatchers("/admin/**").hasAnyRole("SUPERADMIN")
////                .antMatchers("/depart/**").hasAnyRole("DEPARTADMIN")
////                .antMatchers("/user/**").hasAnyRole("USER")
////                .anyRequest().authenticated() //任何请求,登录后可以访问
////                .and()
////                .formLogin()
////                .loginPage("/login")
////                .failureUrl("/login?error")
////                .permitAll() //登录页面用户任意访问
////                .and()
////                .logout().permitAll()
////                .and().headers().frameOptions().disable();
//        http.authorizeRequests()
//                .antMatchers("/**/**","/**","/").permitAll()
//                .and().headers().frameOptions().disable();
//        http.csrf().disable();
//
//    }

}
