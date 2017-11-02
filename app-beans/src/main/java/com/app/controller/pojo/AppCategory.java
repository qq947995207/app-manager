package com.app.controller.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * App类型表 实体类
 */
public class AppCategory implements Serializable {

    private Integer id;
    private String categoryCode;
    private String categoryName;
    private Integer parentId;
    private Integer createdBy;
    private Date creationTime;
    private Integer modifyBy;
    private Date modifyDate;

    public AppCategory() {
    }

    public AppCategory(Integer id, String categoryCode, String categoryName, Integer parentId, Integer createdBy, Date creationTime, Integer modifyBy, Date modifyDate) {
        this.id=id;
        this.categoryCode=categoryCode;
        this.categoryName=categoryName;
        this.parentId=parentId;
        this.createdBy=createdBy;
        this.creationTime=creationTime;
        this.modifyBy=modifyBy;
        this.modifyDate=modifyDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
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
        return "AppCategory{" +
                "id='" + id + '\'' +
                "categoryCode='" + categoryCode + '\'' +
                "categoryName='" + categoryName + '\'' +
                "parentId='" + parentId + '\'' +
                "createdBy='" + createdBy + '\'' +
                "creationTime='" + creationTime + '\'' +
                "modifyBy='" + modifyBy + '\'' +
                "modifyDate='" + modifyDate + '\'' +
                '}';
    }

}
