package com.itheima.mapper;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemsMapper {
    public List<Items> queryItemsList();
}
