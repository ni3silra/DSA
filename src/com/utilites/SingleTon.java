package com.utilites;

public class SingleTon {

    public static SingleTon instance;

    private SingleTon(){

    }

    public static SingleTon createInstanse(){
        if(instance == null)
            instance = new SingleTon();
        return instance;
    }

}
/*
* Ioc Containers -  BeanFactory, AppContext
*
* SOLID
*
*
*
* */