package com.xxx.demo.services.vehicleState;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.remote.RequestParameters;
import com.xxx.demo.jsonBean.remote.remoteRequestParmmeter.DeleteDataRequestParameter;


/**
 * @description:车辆状态
 * @author:@guo.zj
 */
public interface VehicleStateService {
    /**
     * 车辆状态
     *
     * @param vin车架号
     * @return 车辆状态
     */
    JSONObject vehiclestate(RequestParameters request);


    /**
     * 车辆状态
     *
     * @param vin车架号
     * @return 重置状态
     */
    JSONObject deletedata(DeleteDataRequestParameter request);
}

