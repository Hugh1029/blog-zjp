package cn.answering.blog.vo.base;

/**
 * Created by zjp on 2017/9/8.
 * 该类为工作经验的基础类
 */
public class Experience {

    private String time;

    private String company;

    private String content;

    public Experience(){}

    public Experience(String time,String company,String content){
        this.time = time;
        this.company = company;
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("this experience time is %s,company is %s,content is %s",time,company,content);
    }
}
