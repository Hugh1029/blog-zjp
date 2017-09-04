package cn.answering.blog.repository;

import cn.answering.blog.domain.Title;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by HP on 2017/9/4.
 */
public interface TitleRepository extends MongoRepository<Title,String> {

}
