﻿package com.app.controller.service.impl;

import com.app.controller.mapper.DataDictionaryMapper;
import com.app.controller.service.DataDictionaryService;
import com.app.controller.pojo.DataDictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Desc: 
 * @Author: L
 */
@Service("dataDictionaryService")
public class DataDictionaryServiceImpl implements DataDictionaryService {

    @Autowired(required = false)
    private DataDictionaryMapper dataDictionaryMapper;

    public DataDictionaryMapper getDataDictionaryMapper() {
        return dataDictionaryMapper;
    }

    public void setDataDictionaryMapper(DataDictionaryMapper dataDictionaryMapper) {
        this.dataDictionaryMapper = dataDictionaryMapper;
    }

    @Override
    public int add(DataDictionary dataDictionary) {
        return dataDictionaryMapper.add(dataDictionary);
    }

    @Override
    public int deleteDataDictionaryById(Integer id) {
        return dataDictionaryMapper.deleteDataDictionaryById(id);
    }

    @Override
    public int update(DataDictionary dataDictionary) {
        return dataDictionaryMapper.update(dataDictionary);
    }

    @Override
    public int getDataDictionaryCount(Map<String, Object> map) {
        return dataDictionaryMapper.getDataDictionaryCount(map);
    }

    @Override
    public DataDictionary getDataDictionaryById(Integer id) {
        return dataDictionaryMapper.getDataDictionaryById(id);
    }

    @Override
    public List<DataDictionary> getDataDictionaryListByObj(DataDictionary dataDictionary) {
        return dataDictionaryMapper.getDataDictionaryListByObj(dataDictionary);
    }

    @Override
    public List<DataDictionary> getDataDictionaryPageByMap(Map<String, Object> map) {
        return dataDictionaryMapper.getDataDictionaryPageByMap(map);
    }

    @Override
    public DataDictionary getDataDictionaryByMap(Map<String, Object> map) {
        return dataDictionaryMapper.getDataDictionaryByMap(map);
    }
}
