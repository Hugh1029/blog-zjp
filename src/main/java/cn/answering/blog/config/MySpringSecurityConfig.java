package cn.answering.blog.config;

import cn.answering.blog.service.custom.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by zjp on 2017/9/13.
 *
 * 该类用于spring security的配置
 */
@Configuration
public class MySpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomService customService;

    /**
     *
     * 密码加密
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(customService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    /**
     * 用户认证，用于设定怎么设定用户的认证
     * 需要一套用户数据源
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customService);
        auth.authenticationProvider(authenticationProvider());
    }


    /**
     * 请求授权
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }


    /**
     *
     * 请求授权
     * 这里完成所有的拦截请求
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests()
               .antMatchers("/main/**","/resume/**").permitAll()
               .anyRequest().authenticated() //其余需要登录访问
        .and()
               .formLogin()
               .loginPage("/login")
               .defaultSuccessUrl("/index")
               .failureUrl("/errorLogin")
               .permitAll()
               .and()
               .logout()
               .permitAll();
    }
}
