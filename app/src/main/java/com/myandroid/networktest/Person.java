package com.myandroid.networktest;

/**
 * Created by Huochai on 2018/11/6.
 */

public class Person {
    String id;
    String name;
    String version;

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setVersion(String version){
        this.version = version;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getVersion(){
        return version;
    }
}
