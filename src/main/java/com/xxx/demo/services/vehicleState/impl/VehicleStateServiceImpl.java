package com.xxx.demo.services.vehicleState.impl;


import com.alibaba.fastjson.JSONObject;

import com.xxx.demo.jsonBean.remote.request.RequestVin;
import com.xxx.demo.jsonBean.vehiclestate.VehicleState;
import com.xxx.demo.jsonBean.vehiclestate.request.RequestParameterForVehicleState;
import com.xxx.demo.models.vehiclestate.AirConditionStatus;
import com.xxx.demo.models.vehiclestate.Tirepressure;
import com.xxx.demo.models.vehiclestate.WindowStatus;
import com.xxx.demo.services.vehicleState.VehicleStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * @description:车辆状态接口实现
 * @author:@guo.zj
 */
@Service
public class VehicleStateServiceImpl implements VehicleStateService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public JSONObject vehiclestate(RequestParameterForVehicleState data) {
        JSONObject jsonObject = new JSONObject();
        Float resbatterycap;
        String drivingstatus="";
        String chargingstatus="";
        int trunkstatus=0;
        int doorstatus=0;
        int sunroofstatus=0;
        String requestid="";
        long updatetime;
        Float usablekm;
        Float consumerate;
        Tirepressure tirepressure=new  Tirepressure();
        WindowStatus windowstatus=new WindowStatus();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("NISSAN0000000000".equals(vin)) {
                VehicleState vehicleState=new VehicleState();
                resbatterycap=0.60F;
                drivingstatus="Parking";
                chargingstatus="Charging";
                trunkstatus=0;
                doorstatus=0;
                sunroofstatus=0;
                requestid="123456";
                usablekm=0F;
                consumerate=88.8F;
                updatetime=System.currentTimeMillis()*1000;
                tirepressure.setBL(1.0F);
                tirepressure.setBR(1.0F);
                tirepressure.setFL(1.0F);
                tirepressure.setFR(1.8F);
                tirepressure.setBlstate(0);
                tirepressure.setBrstate(0);
                tirepressure.setFlstate(0);
                tirepressure.setFrstate(1);
                windowstatus.setBL(0);
                windowstatus.setFL(0);
                windowstatus.setFR(0);
                windowstatus.setBR(0);
                vehicleState.setWindowstatus(windowstatus);
                vehicleState.setTirepressure(tirepressure);
                vehicleState.setDrivingstatus(drivingstatus);
                vehicleState.setChargingstatus(chargingstatus);
                vehicleState.setDoorstatus(doorstatus);
                vehicleState.setRequestid(requestid);
                vehicleState.setResbatterycap(resbatterycap);
                vehicleState.setTrunkstatus(trunkstatus);
                vehicleState.setSunroofstatus(sunroofstatus);
                vehicleState.setUpdatetime(updatetime);
                vehicleState.setUsablekm(usablekm);
                vehicleState.setConsumerate(consumerate);
                jsonObject.put("status", 200);
                jsonObject.put("msg", "success");
                jsonObject.put("data",vehicleState);
                logger.info("返回的json:{}", jsonObject);
            } else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                jsonObject.put("data","");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
            jsonObject.put("data","");
        }
        return jsonObject;
    }

    @Override
    public JSONObject airConditionState(RequestVin data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("NISSAN0000000000".equals(vin)) {
                AirConditionStatus airConditionStatus=new AirConditionStatus();
                airConditionStatus.setOnoff(1);
                airConditionStatus.setModel(1);
                airConditionStatus.setInternaltemperture(25F);
                airConditionStatus.setTemperturel(25F);
                airConditionStatus.setTemperturer(19F);
                airConditionStatus.setWindowspeed(5);
                airConditionStatus.setDefrost(0);
                airConditionStatus.setTiming(0);
                jsonObject.put("status", 200);
                jsonObject.put("msg", "success");
                jsonObject.put("data",airConditionStatus);
                logger.info("返回的json:{}", jsonObject);
            } else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                jsonObject.put("data","");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
            jsonObject.put("data","");
        }
        return jsonObject;
    }
}




