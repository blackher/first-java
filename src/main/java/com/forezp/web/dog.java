package com.forezp.web;
import java.util.Date;
import java.util.Hashtable;
import java.util.*;

public class dog extends Animal {
    String name;

    public static int nameStatic = 1;
    public  int nameNotstatic = 1;
    public dog(String name){
        super("动物");
        this.name = name;
        nameStatic++;
        nameNotstatic++;

        double [] intList = {1.9, 2.9, 3.4, 3.5};
        for (double element: intList
             ) {
            System.out.println(element);
        }
        System.out.println(max(1,2));
        System.out.println(max(1.1,33.2));
        List <String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        for(String str :list){
            System.out.println(str);
        }

    }


    public String getName() {
        return name;
    }
    public static int max(int a,int b){
        if(a<b){
            return b;
        }else{
            return a;
        }
    }
    public static double max(double a ,double b){
        if(a<b){
            return b;
        }else{
            return a;
        }
    }
    //public  static <E> void printArray(E[] )
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }


}
class A{
    public static  String  staticA ="A" ;
    //静态语句块修改值
    static{
        staticA ="A1";
    }
    //构造器修改值
    public A (){
        staticA ="A2";
    }
    //静态方法起作用

    public static void toChange(){  staticA ="A3"; }
    public static void toChange2(){  staticA ="A4"; }


}
class B{
    public static final String  staticB ;  // 声明与赋值分离
    static{  staticB ="B"; }

}
