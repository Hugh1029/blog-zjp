package cn.answering.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Created by zjp on 2017/9/28.
 * qq: 34948062
 * github: https:www.github.com/zjp1029
 */


@RequestMapping
@RestController
public class LoginController {


    public String login(HttpServletRequest request, HttpServletResponse response){
        return "login";
    }

}
