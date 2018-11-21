package com.itheima.dao;

import com.itheima.domain.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemsRepostory extends JpaRepository<Items,Long> {
    public List<Items> findAll();
}
