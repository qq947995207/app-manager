﻿package com.app.controller.mapper;

import com.app.controller.pojo.AppInfo;

import java.util.List;
import java.util.Map;

/**
 * @Desc: 
 * @Author: L
 */
public interface AppInfoMapper {

    /**
     * add
     * @param appInfo
     * @return
     */
    int add(AppInfo appInfo);

    /**
     * delete by id
     * @param id
     * @return
     */
    int deleteAppInfoById(Integer id);

    /**
     * update
     * @param appInfo
     * @return
     */
    int update(AppInfo appInfo);

    /**
     * getCount
     * @param map
     * @return
     */
    int getAppInfoCount(Map<String, Object> map);

    /**
     * getObjById
     * @param id
     * @return
     */
    AppInfo getAppInfoById(Integer id);

    /**
     * getObjByMap
     * @param map 
     * @return
     */
    AppInfo getAppInfoByMap(Map<String, Object> map);

    /**
     * getListByObj
     * @param appInfo
     * @return
     */
    List<AppInfo> getAppInfoListByObj(AppInfo appInfo);

    /**
     * getPageByMap
     * @param map
     * @return
     */
    List<AppInfo> getAppInfoPageByMap(Map<String, Object> map);

}
