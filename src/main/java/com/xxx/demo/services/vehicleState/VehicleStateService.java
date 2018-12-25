package com.xxx.demo.services.vehicleState;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.finder.request.RequestParameterForCtrl;
import com.xxx.demo.jsonBean.remote.RequestParameters;
import com.xxx.demo.jsonBean.remote.remoteRequestParmmeter.DeleteDataRequestParameter;
import com.xxx.demo.jsonBean.remote.request.RequestVin;
import com.xxx.demo.jsonBean.vehiclestate.request.RequestParameterForVehicleState;


/**
 * @description:车辆状态
 * @author:@guo.zj
 */
public interface VehicleStateService {

    /**
     * 车辆状态
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject vehiclestate(RequestParameterForVehicleState request);

    /**
     * 车辆状态
     *
     * @param vin车架号 操作类型
     * @return 空调状态
     */
    JSONObject airConditionState(RequestVin request);

}

