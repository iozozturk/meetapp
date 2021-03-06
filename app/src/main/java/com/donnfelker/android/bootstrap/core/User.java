package com.donnfelker.android.bootstrap.core;

import android.support.v7.appcompat.R;
import android.text.TextUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {

    private static final long serialVersionUID = -7495897652017488896L;

    protected String firstName;
    protected String lastName;
    protected String username;
    protected String phone;
    protected String objectId;
    protected String sessionToken;
    protected String gravatarId;
    protected String avatarUrl;


    protected String email;
    protected String isMale;
    protected String ismsc;
    protected String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getIsphd() {
        return isphd;
    }

    public void setIsphd(String isphd) {
        this.isphd = isphd;
    }

    public String getIsmsc() {
        return ismsc;
    }

    public void setIsmsc(String ismsc) {
        this.ismsc = ismsc;
    }

    protected String isphd;

    protected double distance;
    protected Map<String, Integer> technical;

    public String getIsMale() {
        return isMale;
    }

    public void setIsMale(String isMale) {
        this.isMale = isMale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public User() {
        technical = new HashMap<String, Integer>();
        technical.put(Constants.IMeetapp.C, 0);
        technical.put(Constants.IMeetapp.JAVA, 0);
        technical.put(Constants.IMeetapp.CPLUSPLUS, 0);
        technical.put(Constants.IMeetapp.EXPERIENCE, 0);
        technical.put(Constants.IMeetapp.MATLAB, 0);
        technical.put(Constants.IMeetapp.CSS, 0);
        technical.put(Constants.IMeetapp.HTML,0);
        technical.put(Constants.IMeetapp.CUDA, 0);
        technical.put(Constants.IMeetapp.ENGLISH, 0);
        technical.put(Constants.IMeetapp.XML,0);
        technical.put(Constants.IMeetapp.PYTHON, 0);
        technical.put(Constants.IMeetapp.JS,0);
        technical.put(Constants.IMeetapp.SCHOOL_GRADE, 0);
    }


    public Map<String, Integer> getTechnical() {
        return technical;
    }

    public void setTechnical(Map technical) {
        this.technical = technical;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(final String objectId) {
        this.objectId = objectId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public String getAvatarUrl() {
        if (TextUtils.isEmpty(avatarUrl)) {
            String gravatarId = getGravatarId();
            if (TextUtils.isEmpty(gravatarId))
                gravatarId = GravatarUtils.getHash(getUsername());
            avatarUrl = getAvatarUrl(gravatarId);
        }
        return avatarUrl;
    }

    private String getAvatarUrl(String id) {
        if (!TextUtils.isEmpty(id))
            return "https://secure.gravatar.com/avatar/" + id + "?d=404";
        else
            return null;
    }
}
