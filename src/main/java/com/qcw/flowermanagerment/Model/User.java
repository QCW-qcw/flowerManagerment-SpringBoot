package com.qcw.flowermanagerment.Model;

public class User {
    private String userid;

    private String password;

    private String master;

    public User(){}

    public User(String userid, String password, String master){
        this.userid = userid;
        this.password = password;
        this.master = master;
    }
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }
}