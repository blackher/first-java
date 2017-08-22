package com.test.dao.impl;

import com.test.dao.IThreadDao;
import com.test.entity.Thread;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ThreadDaoImpl implements IThreadDao {
    @Autowired
    private JdbcTemplate jdbcTemplate ;
    @Override
    public int add(Thread thread) {
        return 0;
    }

    @Override
    public List<Thread> findalllist() {
        return null;
    }

    @Override
    public Thread findout(int id) {
        List<Thread> data =  jdbcTemplate.query("select * from thread ",new Object[]{},new BeanPropertyRowMapper(Thread.class));
        System.out.println(data);
        if(data!=null && data.size()>0){
            Thread thread = data.get(0);
            return thread;
        }else{
            return null;
        }
    }
}
