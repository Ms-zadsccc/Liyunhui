package com.example.liyunhui.model;

import java.io.Serializable;

public class Login implements Serializable{
    private int id;
    private String admin;
    private String password;
    private String callphone;

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin( String admin ) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public String getCallphone() {
        return callphone;
    }

    public void setCallphone( String callphone ) {
        this.callphone = callphone;
    }
}
