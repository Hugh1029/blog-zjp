package cn.answering.blog.vo.base;

/**
 * Created by HP on 2017/9/7.
 * 基础信息类
 */
public class Info {

    private String title;

    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Info(){}

    public Info(String title,String content){
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("the info is : title:%s,content:%s",title,content);
    }
}
