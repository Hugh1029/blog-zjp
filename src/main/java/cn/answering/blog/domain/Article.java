package cn.answering.blog.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by HP on 2017/9/1.
 */
public class Article implements Serializable {

    @Id
    private String id;

    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString(){
        return String.format("the article is: title is %s",title);
    }
}
