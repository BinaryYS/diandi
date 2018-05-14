package com.ssg.cqu.guava.model;

import com.google.common.primitives.Ints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Comparator;

/**
 * author : yangsong
 * time   : 2018/5/14 23:03
 * e-mail : binaryys@gmail.com
 */
public class User implements Serializable,Comparator<User> {
    private static final Logger LOGGER_FACTORY = LoggerFactory.getLogger(User.class);

    private int id;

    private String name;

    private int age;

    public User() {
    }

    public User(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(User o1, User o2) {
        return Ints.compare(o1.getAge(),o2.getAge());
    }
}
