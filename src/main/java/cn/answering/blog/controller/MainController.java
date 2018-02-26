package cn.answering.blog.controller;

import cn.answering.blog.domain.Menu;
import cn.answering.blog.service.MenuService;
import cn.answering.blog.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by HP on 2017/9/1.
 */

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public ResponseEntity<Response> getMenus(){
        List<Menu> menus = menuService.findAllMenu();
        System.out.println(menus.size());
        for (Menu menu : menus){
        }
        return ResponseEntity.ok().body(new Response(true,"ok",menus));
    }

    @PostMapping("/addMenu")
    public void saveTitle(@RequestParam("name")String name){
        Menu menu = new Menu(name);
        menuService.saveOrUpdateMenu(menu);
    }

    @GetMapping("/{name}")
    public void add(@PathVariable("name")String name){
        Menu menu = new Menu(name);
        menu.setUrl("http://www.zjp1029.cn");
        menuService.saveOrUpdateMenu(menu);
    }
}
