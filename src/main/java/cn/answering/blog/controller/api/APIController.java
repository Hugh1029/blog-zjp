package cn.answering.blog.controller.api;

import cn.answering.blog.vo.Response;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zjp on 2017/9/4.
 * 该类为暴露的API类
 */

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/user")
    public Response getUser(@RequestParam(value = "pageIndex",defaultValue = "0")int pageIndex,
                            @RequestParam(value = "pageSize",defaultValue = "10")int pageSize){
        return new Response(true,"","");
    }

    @GetMapping("/getArticle/{tag}")
    public Response getArticle(@PathVariable("tag")String tag,
                               @RequestParam(value = "pageIndex",defaultValue = "0")int pageIndex,
                               @RequestParam(value = "pageSize",defaultValue = "10")int pageSize){
        return new Response(true,"","");
    }
}
