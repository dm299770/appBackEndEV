package com.xxx.demo.controller.vehiclestate;

import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.remote.RequestParameters;
import com.xxx.demo.jsonBean.remote.remoteRequestParmmeter.DeleteDataRequestParameter;
import com.xxx.demo.jsonBean.remote.request.RequestVin;
import com.xxx.demo.jsonBean.vehiclestate.VehicleState;
import com.xxx.demo.jsonBean.vehiclestate.request.RequestParameterForVehicleState;
import com.xxx.demo.services.finder.FinderService;
import com.xxx.demo.services.vehicleState.VehicleStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:车辆状态
 * @author:@guo.zj
 */
@RestController
@RequestMapping({"/vehiclestate"})
public class VehicleStateController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private VehicleStateService vehicleStateService;
    @ResponseBody
    @RequestMapping(value = "VehicleState")
    public Object vehiclestate(@RequestBody RequestParameterForVehicleState data) {
        JSONObject result=null;
        try {
            result = vehicleStateService.vehiclestate(data);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }


    @ResponseBody
    @RequestMapping(value = "airConditionState")
    public Object deletedata(@RequestBody RequestVin data) {
        JSONObject result=null;
        try {
            result = vehicleStateService.airConditionState(data);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

}


