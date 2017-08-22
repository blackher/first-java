package com.forezp.web;

import java.lang.reflect.Method;

class ClassReflect {
  public void method(){

  }
}

public class ClassReflectTest{
  public static void main(String[] args){
    Method[] test = ClassReflect.class.getMethods() ;
    for(Method testv :test){
      System.out.println(testv.getName());
    }
    System.out.println(test);
 }


}