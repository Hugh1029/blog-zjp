package cn.answering.blog.repository;

import cn.answering.blog.domain.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zjp on 2017/9/4.
 * the class is Article Repository
 *
 */
public interface ArticleRepository extends MongoRepository<Article,String>{
}
