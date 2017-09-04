package cn.answering.blog.service.impl;

import cn.answering.blog.domain.Title;
import cn.answering.blog.repository.TitleRepository;
import cn.answering.blog.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zjp on 2017/9/4.
 * the class is service of title
 * 实现title的增删改查
 */
@Service
public class TitleServiceImpl implements TitleService{

    @Autowired
    private TitleRepository titleRepository;

    @Override
    public List<Title> findAllTitle() {
        return titleRepository.findAll();
    }

    @Transactional
    @Override
    public Title saveOrUpdateTitle(Title title) {
        return titleRepository.save(title);
    }


    @Transactional
    @Override
    public void deleteTitleById(String id) {
        titleRepository.delete(id);
    }

}
