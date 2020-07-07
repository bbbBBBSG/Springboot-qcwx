package com.dahai.bean;

public class UserResponse {

    private String userid;

    /**
     * 昵称
     */
    private String username;

    /**
     * 头像
     */
    private String headpic;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }
}
