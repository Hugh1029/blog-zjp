package cn.answering.blog.controller;

import cn.answering.blog.domain.Resume;
import cn.answering.blog.service.ResumeService;
import cn.answering.blog.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zjp on 2017/9/7.
 *
 * 该类为主页个人简历内容抓取
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/get")
    public Response getResumeService(@RequestParam(value = "username",required = false)String username){
        Resume resume = null;
        if (username != null){

        }else {
            resume = resumeService.findResumeById("59b67436796f91164882712a");
        }
        return new Response(true,"ok",resume);
    }


    @GetMapping()
    public void get(){
        Resume resume = new Resume();

        resumeService.saveOrUpdate(resume);
    }

    @PostMapping("/add")
    public Response addResume(){
        return new Response(true,"1","1");
    }

}
