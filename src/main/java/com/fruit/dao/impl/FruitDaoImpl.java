package com.fruit.dao.impl;

import com.fruit.dao.FruitDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by lveyo on 3/12/15.
 */
public class FruitDaoImpl implements FruitDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getFruitCity(long fruitId) {
        String sql = "select * from fruit where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[] {fruitId}, String.class);
    }
}
