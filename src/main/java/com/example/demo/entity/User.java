package com.example.demo.entity;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/9 10:12
 */
public class User {
    private Long id;
    private String name;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
