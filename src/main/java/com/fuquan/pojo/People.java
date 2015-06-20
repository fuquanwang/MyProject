package com.fuquan.pojo;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by Fuquan on 6/20/2015.
 */
public class People {

    private String name;
    private int age;
    private List<Map<String, People>> friends;

    public People(String name, int age) {
        this(name, age, null);
    }

    public People(String name, int age, List<Map<String, People>> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public List<Map<String, People>> getFriends() {
        return friends;
    }

    public void setFriends(List<Map<String, People>> friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return MessageFormat.format("name:{} age:{} frineds:{}", name, age, friends);
    }
}
