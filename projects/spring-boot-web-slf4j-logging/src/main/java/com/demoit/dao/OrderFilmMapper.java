package com.demoit.dao;

import com.demoit.entity.OrderFilm;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderFilmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderFilm record);

    OrderFilm selectByPrimaryKey(Integer id);

    List<OrderFilm> selectAll();

    int updateByPrimaryKey(OrderFilm record);
}