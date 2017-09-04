package cn.answering.blog.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by zjp on 2017/9/1.
 *
 * 标题实体类
 */
public class Title implements Serializable{

    private static final long serialVersionUID = -3266928488701846147L;

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

    @Override
    public String toString(){
        return String.format("the title is: name is %s,id is %s ",name,id );
    }
}
