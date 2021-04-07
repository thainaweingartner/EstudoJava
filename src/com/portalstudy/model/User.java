package com.portalstudy.model;

import java.util.Objects;

public class User {

    private Long user_id;
    private String user_name;
    private String user_password;
    private  String user_role;

    public User(Long user_id, String user_name, String user_password, String user_role) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_role = user_role;
    }

    public User(String user_name, String user_password, String user_role) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_role = user_role;
    }

    public User(){
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(user_id, user.user_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id);
    }

    @Override
    public String toString() {
        return "User " + user_id +
                ": " + user_name + '\'' +
                ", Password: '" + user_password + '\'' +
                ", Role:'" + user_role;
    }
}

