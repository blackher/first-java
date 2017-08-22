package com.forezp.web;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public GenericTest(){
        Box<String> listStr = new Box<String>();
        Box<Integer> listInt = new Box<Integer>();
    }

}
class Box<T>{
    private T args;
    public void Box(T args){
        this.args = args;

    }
    public T get(){
       return args;

    }
}