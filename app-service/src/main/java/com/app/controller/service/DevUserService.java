﻿package com.app.controller.service;

import com.app.controller.pojo.DevUser;

import java.util.List;
import java.util.Map;

/**
* @Desc: 
* @Author: L
*/
public interface DevUserService {

    /**
     * add
     * @param devUser
     * @return
     */
    int add(DevUser devUser);

    /**
     * delete by id
     * @param id
     * @return
     */
    int deleteDevUserById(Integer id);

    /**
     * update
     * @param devUser
     * @return
     */
    int update(DevUser devUser);

    /**
     * getCount
     * @param map
     * @return
     */
    int getDevUserCount(Map<String, Object> map);

    /**
     * getObjById
     * @param id
     * @return
     */
    DevUser getDevUserById(Integer id);

    /**
     * getObjByMap
     * @param map 
     * @return
     */
    DevUser getDevUserByMap(Map<String, Object> map);

    /**
     * getListByObj
     * @return
     */
    List<DevUser> getDevUserListByObj(DevUser devUser);

    /**
     * getPageByMap
     * @param map
     * @return
     */
    List<DevUser> getDevUserPageByMap(Map<String, Object> map);

}
