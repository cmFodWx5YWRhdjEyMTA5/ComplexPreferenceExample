package com.saad.complexpreferenceexample;

import java.util.ArrayList;

public class DemoModel {
    private String username;

    private String password;

    private boolean isLogin;

    private int version;

    private ArrayList<String> hobbiesList;


    public DemoModel(String username, String password, boolean isLogin, int version, ArrayList<String> hobbiesList) {
        this.username = username;
        this.password = password;
        this.isLogin = isLogin;
        this.version = version;
        this.hobbiesList = hobbiesList;
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

    public boolean isLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
