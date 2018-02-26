package cn.answering.blog.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by zjp on 2017/9/1.
 *
 * 标题实体类
 */

@Document
public class Menu implements Serializable{


    private static final long serialVersionUID = -5720625180975564362L;


    @Id
    private String id;

    private String name;

    private String url;

    public String getId() {
        return id;
    }

    protected Menu(){}

    public Menu(String name){
        this.name = name;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString(){
        return String.format("the title is: name is %s,id is %s ,url is:%s",name,id,url );
    }
}
