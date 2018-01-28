package com.blogspot.programer27android.sesilogin.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gery on 11/20/17.
 */

public class Data {
    
    @SerializedName("id")
    private String mId;
    @SerializedName("email")
    private String memail;
    @SerializedName("password")
    private String mpassword;
    
    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getemail() {
        return memail;
    }

    public void setemail(String email) {
        memail = email;
    }

    public String getpassword() {
        return mpassword;
    }

    public void setpassword(String password) {
        mpassword = password;
    }

}
