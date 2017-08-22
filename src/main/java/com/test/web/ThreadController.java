package com.test.web;
import com.test.Serive.impl.ThreadSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.test.entity.Thread;
@RestController
@RequestMapping("/thread")
public class ThreadController {
    @Autowired
    ThreadSerive threadSerive ;
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Thread getTheadById(@PathVariable("id") int id){
            System.out.println(id);
            System.out.println("threaddata");
            Thread thread = threadSerive.findThreadById(id);

            System.out.println(thread);
            System.out.println("threaddataend");
            return threadSerive.findThreadById(id);
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public int test(){

        return 0;
    }
}
