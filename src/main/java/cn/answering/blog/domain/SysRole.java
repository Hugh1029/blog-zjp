package cn.answering.blog.domain;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;

/**
 * Created by zjp on 2017/9/13.
 */
public class SysRole implements GrantedAuthority {

    @Id
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SysRole(){}

    public SysRole(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("this is role,and id is %s,name is %s",id,name);
    }

    @Override
    public String getAuthority() {
        return name;
    }
}
