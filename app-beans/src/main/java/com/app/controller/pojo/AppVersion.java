package com.app.controller.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * App版本表 实体类
 */
public class AppVersion implements Serializable {

    private Integer id;
    private Integer appId;
    private String versionNo;
    private String versionInfo;
    private Integer publishStatus;
    private String downloadLink;
    private Double versionSize;
    private Integer createdBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;
    private String apkLocPath;
    private String apkFileName;

    public AppVersion() {
    }

    public AppVersion(Integer id, Integer appId, String versionNo, String versionInfo, Integer publishStatus, String downloadLink, Double versionSize, Integer createdBy, Date creationDate, Integer modifyBy, Date modifyDate, String apkLocPath, String apkFileName) {
        this.id=id;
        this.appId=appId;
        this.versionNo=versionNo;
        this.versionInfo=versionInfo;
        this.publishStatus=publishStatus;
        this.downloadLink=downloadLink;
        this.versionSize=versionSize;
        this.createdBy=createdBy;
        this.creationDate=creationDate;
        this.modifyBy=modifyBy;
        this.modifyDate=modifyDate;
        this.apkLocPath=apkLocPath;
        this.apkFileName=apkFileName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public Double getVersionSize() {
        return versionSize;
    }

    public void setVersionSize(Double versionSize) {
        this.versionSize = versionSize;
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

    public String getApkLocPath() {
        return apkLocPath;
    }

    public void setApkLocPath(String apkLocPath) {
        this.apkLocPath = apkLocPath;
    }

    public String getApkFileName() {
        return apkFileName;
    }

    public void setApkFileName(String apkFileName) {
        this.apkFileName = apkFileName;
    }


    @Override
    public String toString() {
        return "AppVersion{" +
                "id='" + id + '\'' +
                "appId='" + appId + '\'' +
                "versionNo='" + versionNo + '\'' +
                "versionInfo='" + versionInfo + '\'' +
                "publishStatus='" + publishStatus + '\'' +
                "downloadLink='" + downloadLink + '\'' +
                "versionSize='" + versionSize + '\'' +
                "createdBy='" + createdBy + '\'' +
                "creationDate='" + creationDate + '\'' +
                "modifyBy='" + modifyBy + '\'' +
                "modifyDate='" + modifyDate + '\'' +
                "apkLocPath='" + apkLocPath + '\'' +
                "apkFileName='" + apkFileName + '\'' +
                '}';
    }

}
