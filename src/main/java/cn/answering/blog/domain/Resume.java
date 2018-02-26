package cn.answering.blog.domain;

import cn.answering.blog.vo.base.Experience;
import cn.answering.blog.vo.base.Info;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zjp on 2017/9/7.
 * 简历信息类
 *
 */
public class Resume implements Serializable{

    private String id;

    private String username;

    private String userId;

    private String headImg; //头像图片

    private String sign; //个性签名

    private List<Info> baseInfo;//基础信息

    private List<Experience> experience;//工作经验

    private List<Info> skills;//技巧技能

    private List<String> introduce;//个人介绍

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public List<Info> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(List<Info> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Info> getSkills() {
        return skills;
    }

    public void setSkills(List<Info> skills) {
        this.skills = skills;
    }

    public List<String> getIntroduce() {
        return introduce;
    }

    public void setIntroduce(List<String> introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return String.format("the resume is for %s,name is %s,telephone is %s");
    }
}
