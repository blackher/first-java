package com.test.dao;

import com.test.entity.Thread;

import java.util.List;

public interface IThreadDao {

    int add(Thread thread);

    Thread findout(int id);

    List<Thread> findalllist();
}
