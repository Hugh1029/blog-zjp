package cn.answering.blog.service;

import cn.answering.blog.domain.Menu;

import java.util.List;

/**
 * Created by HP on 2017/9/4.
 */
public interface MenuService {

    public List<Menu> findAllMenu();

    public Menu saveOrUpdateMenu(Menu menu);

    public void deleteMenuById(String id);


}
