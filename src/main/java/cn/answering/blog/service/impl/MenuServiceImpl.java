package cn.answering.blog.service.impl;

import cn.answering.blog.domain.Menu;
import cn.answering.blog.repository.MenuRepository;
import cn.answering.blog.service.MenuService;
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
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> findAllMenu() {
        return menuRepository.findAll();
    }

    @Transactional
    @Override
    public Menu saveOrUpdateMenu(Menu menu) {
        return menuRepository.save(menu);
    }


    @Transactional
    @Override
    public void deleteMenuById(String id) {
        menuRepository.delete(id);
    }

}
