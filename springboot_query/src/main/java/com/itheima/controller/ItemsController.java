package com.itheima.controller;

import com.itheima.dao.ItemsRepostory;
import com.itheima.domain.Items;
import com.itheima.mapper.ItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemsController {

    @Autowired
    private ItemsMapper itemsMapper;
    private ItemsRepostory itemsRepostory;

    @RequestMapping("/query")
    public List<Items> query(){
        List<Items> items = itemsMapper.queryItemsList();
        return items;
    }

}
