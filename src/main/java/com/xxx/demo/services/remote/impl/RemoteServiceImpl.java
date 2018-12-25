package com.xxx.demo.services.remote.impl;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.finder.request.RequestParameterForCtrl;
import com.xxx.demo.jsonBean.remote.remotemodel.AirCondition;
import com.xxx.demo.jsonBean.remote.request.*;
import com.xxx.demo.services.remote.RemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:车辆操控接口
 * @author:@guo.zj
 */
@Service
public class RemoteServiceImpl implements RemoteService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public JSONObject remotedoor(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
             String vin = data.getData().getVin();
            int action = data.getData().getAction();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)&& action==0) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            } else if("NISSAN0000000000".equals(vin)&& action==1) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);

            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject sunroof(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            int action = data.getData().getAction();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)&& action==0) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            } else if("NISSAN0000000000".equals(vin)&& action==1) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);

            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject airconditionertrun(RequestAirCondition data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            int action = data.getData().getAction();
            AirCondition acparam=new AirCondition();
            acparam= data.getData().getAcparam();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "下发成功");
                logger.info("返回的json:{}", jsonObject);
            } else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject airconditionertemperture(RequestParameterForAirTemperture data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            int temperture = data.getData().getTemperture();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject airspeed(RequestParameterForAirSpeed data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            int speed = data.getData().getSpeed();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject airtiming(RequestParameterForAirTiming data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            long time = data.getData().getTime();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            } else if("NISSAN0000000000".equals(vin)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);

            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject defrost(RequestVin data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject horn(RequestVin data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject runk(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            int action = data.getData().getAction();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)&& action==0) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            } else if("NISSAN0000000000".equals(vin)&& action==1) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);

            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject carpower(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            int action = data.getData().getAction();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ( "NISSAN0000000000".equals(vin)&& action==0) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            } else if("NISSAN0000000000".equals(vin)&& action==1) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);

            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject window(RequestParameterForWindow data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            int action = data.getData().getAction();
            String wsite = data.getData().getWsite();
            Thread.sleep(2000);
            JSONArray jsonArray = new JSONArray();
            if(vin==null||"".equals(vin)) {
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data", "");
            }else if (!wsite.equals("FL")) {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }else if ( "NISSAN0000000000".equals(vin)&& action==0) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);
            } else if("NISSAN0000000000".equals(vin)&& action==1) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "指令下发成功");
                logger.info("返回的json:{}", jsonObject);

            }else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }
}