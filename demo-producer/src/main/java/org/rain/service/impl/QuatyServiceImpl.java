package org.rain.service.impl;

import org.rain.utils.InfluxdbUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangYu
 * @date 2022/7/14
 */
public class QuatyServiceImpl {

    private InfluxdbUtil influxdb;

    public void testDb(){
        influxdb = InfluxdbUtil.setUp();
        Map<String, String > tags = new HashMap<>();
        Map<String, Object> fields = new HashMap<>();
        tags.put("TAG_NAME", "test");
        fields.put("TAG_VALUE", "t111");
        fields.put("TIMAMPEST", new Date().getTime());
        influxdb.insert(tags, fields);

    }
}
