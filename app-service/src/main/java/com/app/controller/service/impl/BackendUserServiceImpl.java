﻿package com.app.controller.service.impl;

import com.app.controller.mapper.BackendUserMapper;
import com.app.controller.pojo.BackendUser;
import com.app.controller.service.BackendUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Desc: 
 * @Author: L
 */
@Service("backendUserService")
public class BackendUserServiceImpl implements BackendUserService {

    @Autowired(required = false)
    private BackendUserMapper backendUserMapper;

    public BackendUserMapper getBackendUserMapper() {
        return backendUserMapper;
    }

    public void setBackendUserMapper(BackendUserMapper backendUserMapper) {
        this.backendUserMapper = backendUserMapper;
    }

    @Override
    public int add(BackendUser backendUser) {
        return backendUserMapper.add(backendUser);
    }

    @Override
    public int deleteBackendUserById(Integer id) {
        return backendUserMapper.deleteBackendUserById(id);
    }

    @Override
    public int update(BackendUser backendUser) {
        return backendUserMapper.update(backendUser);
    }

    @Override
    public int getBackendUserCount(Map<String, Object> map) {
        return backendUserMapper.getBackendUserCount(map);
    }

    @Override
    public BackendUser getBackendUserById(Integer id) {
        return backendUserMapper.getBackendUserById(id);
    }

    @Override
    public List<BackendUser> getBackendUserListByObj(BackendUser backendUser) {
        return backendUserMapper.getBackendUserListByObj(backendUser);
    }

    @Override
    public List<BackendUser> getBackendUserPageByMap(Map<String, Object> map) {
        return backendUserMapper.getBackendUserPageByMap(map);
    }

    @Override
    public BackendUser getBackendUserByMap(Map<String, Object> map) {
        return backendUserMapper.getBackendUserByMap(map);
    }
}
