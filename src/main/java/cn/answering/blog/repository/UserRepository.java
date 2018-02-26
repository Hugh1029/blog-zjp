package cn.answering.blog.repository;

import cn.answering.blog.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by HP on 2017/9/4.
 */
public interface UserRepository extends MongoRepository<User,String> {

    public User findUserByUsername(String username);
}
