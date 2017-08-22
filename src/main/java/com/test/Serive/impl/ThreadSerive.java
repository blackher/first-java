package com.test.Serive.impl;
import com.test.entity.Thread;
import com.test.Serive.IThreadSerive;

import com.test.dao.impl.ThreadDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThreadSerive implements IThreadSerive {
    @Autowired
    ThreadDaoImpl threadDao ;

    @Override
    public Thread findThreadById(int id) {
        //System.out.println("threadDaostart");
        System.out.println(threadDao.findout(id));
        //System.out.println("threadDaoend");
        return threadDao.findout(id);
    }
}
