package com.itheima.test;

import com.itheima.SpringbootQueryApplication;
import com.itheima.dao.ItemsRepostory;
import com.itheima.domain.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootQueryApplication.class)
public class ItemsTest2 {
    
    @Autowired
    private ItemsRepostory itemsRepostory;
    
    @Test
    public void test2(){
        List<Items> items = itemsRepostory.findAll();
        System.out.println(items);
    }
    
}
