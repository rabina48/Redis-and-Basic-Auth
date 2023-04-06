//package com.example.student.studentrecord.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//    @Configuration
//    @EnableWebSecurity
//    public class SecurityConfig implements WebSecurityConfigurer<WebSecurity> {
//
//        @Autowired
//        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//            auth.inMemoryAuthentication()
//                    .withUser("user")
//                    .password("password")
//                    .roles("USER");
//        }
//
//        @Override
//        public void init(WebSecurity web) throws Exception {
//            //  web.ignoring().antMatchers("/resources/**");
//            web.ignoring().requestMatchers("/all/**");
//        }
//
//        @Override
//        public void configure(WebSecurity web) throws Exception {
//            web.ignoring().requestMatchers("/all/**");
//        }
//
//    }