package com.forezp.dao;

import com.forezp.entity.Thread;

import java.util.List;

public interface IThreadDao {

    int add(Thread thread);

    Thread findout(int id);

    List<Thread> findalllist();
}
