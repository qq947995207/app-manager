﻿package com.app.controller.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 开发者用户表 实体类
 */
public class DevUser implements Serializable {

    private Integer id;
    private String devCode;
    private String devName;
    private String devPassword;
    private String devEmail;
    private String devInfo;
    private Integer createdBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;

    public DevUser() {
    }

    public DevUser(Integer id, String devCode, String devName, String devPassword, String devEmail, String devInfo, Integer createdBy, Date creationDate, Integer modifyBy, Date modifyDate) {
        this.id=id;
        this.devCode=devCode;
        this.devName=devName;
        this.devPassword=devPassword;
        this.devEmail=devEmail;
        this.devInfo=devInfo;
        this.createdBy=createdBy;
        this.creationDate=creationDate;
        this.modifyBy=modifyBy;
        this.modifyDate=modifyDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevPassword() {
        return devPassword;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword;
    }

    public String getDevEmail() {
        return devEmail;
    }

    public void setDevEmail(String devEmail) {
        this.devEmail = devEmail;
    }

    public String getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(String devInfo) {
        this.devInfo = devInfo;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }


    @Override
    public String toString() {
        return "DevUser{" +
                "id='" + id + '\'' +
                "devCode='" + devCode + '\'' +
                "devName='" + devName + '\'' +
                "devPassword='" + devPassword + '\'' +
                "devEmail='" + devEmail + '\'' +
                "devInfo='" + devInfo + '\'' +
                "createdBy='" + createdBy + '\'' +
                "creationDate='" + creationDate + '\'' +
                "modifyBy='" + modifyBy + '\'' +
                "modifyDate='" + modifyDate + '\'' +
                '}';
    }
}
