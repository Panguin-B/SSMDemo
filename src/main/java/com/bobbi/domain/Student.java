package com.bobbi.domain;

import java.io.Serializable;

/**
 * Created by bobbi on 18/3/16.
 */
public class Student implements Serializable {

    private int id;
    private String username, password, address;

    public Student() {
    }

    public Student(String username, String password, String address) {

        this.username = username;
        this.password = password;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
