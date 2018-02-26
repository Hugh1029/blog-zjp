package cn.answering.blog.repository;

import cn.answering.blog.domain.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zjp on 2017/9/7.
 * qq:34948062
 * 简历信息的repository接口
 *
 */
public interface ResumeRepository extends MongoRepository<Resume,String>{

    public Resume findResumeByUsername(String username);


}
