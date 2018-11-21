package com.itheima.test;

import com.itheima.SpringbootQueryApplication;
import com.itheima.domain.Items;
import com.itheima.mapper.ItemsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootQueryApplication.class)
public class ItemsTest {

    @Autowired
    private ItemsMapper itemsMapper;

    @Test
    public void test(){
        List<Items> items = itemsMapper.queryItemsList();
        System.out.println(items);
    }

}
