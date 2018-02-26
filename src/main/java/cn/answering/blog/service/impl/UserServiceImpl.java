package cn.answering.blog.service.impl;

import cn.answering.blog.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by zjp on 2017/9/4.
 */
public class UserServiceImpl implements UserService,UserDetailsService{

    /**
     * 该方法重写来自UserDetailsService，用于验证用户身份
     * @param s
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
