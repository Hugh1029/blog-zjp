package cn.answering.blog.service;

import cn.answering.blog.domain.Title;

import java.util.List;

/**
 * Created by HP on 2017/9/4.
 */
public interface TitleService {

    public List<Title> findAllTitle();

    public Title saveOrUpdateTitle(Title title);

    public void deleteTitleById(String id);


}
