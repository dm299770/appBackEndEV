package com.xxx.demo.services.vehicleState.impl;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.finder.myCarFinder;
import com.xxx.demo.jsonBean.remote.RequestParameters;
import com.xxx.demo.jsonBean.remote.remoteRequestParmmeter.DeleteDataRequestParameter;
import com.xxx.demo.jsonBean.vehiclestate.VehicleState;
import com.xxx.demo.services.finder.FinderService;
import com.xxx.demo.services.vehicleState.VehicleStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @description:远程寻车接口实现
 * @author:@guo.zj
 */
@Service
public class VehicleStateServiceImpl implements VehicleStateService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    int i=0;
    @Override
    public JSONObject vehiclestate(RequestParameters data) {
        List<Map<String, Double>> Location =new ArrayList<Map<String, Double>>();
        myCarFinder mycarFinder=new myCarFinder();
        JSONObject jsonObject = new JSONObject();
        int endurancemileage=0;
        String endurancemileages="";
        int mileage=0;
        String oilconsumption="";
        String roadhau="";
        String drivingstate="行驶中";
        String fcphk="";
        String tire="";
        try {
            logger.info("请求体:" + data);
            //Finder finder = JSON.parseObject(request, FinderRequestParameter.class).getData();
            String vin = data.getData().getVin();
            String serviceType = data.getData().getType();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("APP".equals(serviceType) && "NISSAN0000000000".equals(vin)) {
                VehicleState vehicleState=new VehicleState();
                if(i==0){
                    endurancemileage=435;
                    endurancemileages="435Km";
                    mileage=800;
                    oilconsumption="62%";
                    roadhau="16990Km";
                    drivingstate="行驶中";
                    fcphk="8.5L";
                    tire = "0";
                    i++;
                }else{
                    endurancemileage=430;
                    endurancemileages="430Km";
                    mileage=800;
                    oilconsumption="61%";
                    roadhau="16995Km";
                    drivingstate="行驶中";
                    fcphk="8.1L";
                    tire = "1";
                    i--;
                }
                NumberFormat numberFormat = NumberFormat.getInstance();
                // 设置精确到小数点后2位
                numberFormat.setMaximumFractionDigits(2);
                String result = numberFormat.format( (float) endurancemileage / (float) mileage * 100);
                double ss=Double.parseDouble(result);
                double aa= Math.round(ss);
                int num = (int)aa;

                vehicleState.setPartmileage(num);
                vehicleState.setEndurancemileage(endurancemileages);
                vehicleState.setDrivingstate(drivingstate);
                vehicleState.setFcphk(fcphk);
                vehicleState.setMileage(mileage);
                vehicleState.setOilconsumption(oilconsumption);
                vehicleState.setRoadhaul(roadhau);
                vehicleState.setTire(tire);
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
    public JSONObject deletedata(DeleteDataRequestParameter data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            String serviceType = data.getData().getType();
            String controlType = data.getData().getControltype();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("APP".equals(serviceType) && "NISSAN0000000000".equals(vin)) {
                VehicleState vehicleState=new VehicleState();
                if("vehicle".equals(controlType)){
                    jsonObject.put("msg", "重置车辆数据成功");
                }else if("person".equals(controlType)){
                    jsonObject.put("msg", "清除人员数据成功");
                }
                jsonObject.put("status", 200);
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