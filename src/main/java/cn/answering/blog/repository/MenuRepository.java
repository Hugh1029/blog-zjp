package cn.answering.blog.repository;

import cn.answering.blog.domain.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zjp on 2017/9/4.
 * 菜单栏的接口
 */
public interface MenuRepository extends MongoRepository<Menu,String> {

}
