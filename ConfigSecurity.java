package com.teamSense.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by it'sMe on 2018-12-15.
 */
@Configuration
public class ConfigSecurity extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
              //.antMatchers('**/rest/*') //specify endpoint if needed
                .anyRequest()
                .permitAll() // this app doesn't need authentification "permit all()"
                .and()
                .httpBasic();
        // this app doesn't need authentification "permit all()"
        httpSecurity.csrf().disable(); // disable cros origin
    }
}
