package com.forezp.Serive.impl;
import com.forezp.entity.Thread;
import com.forezp.Serive.IThreadSerive;

import com.forezp.dao.impl.ThreadDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
