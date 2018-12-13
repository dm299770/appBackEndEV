package com.xxx.demo.jsonBean.remote.request;


import com.xxx.demo.jsonBean.remote.remotemodel.Vehicle;
import com.xxx.demo.jsonBean.remote.remotemodel.VehicleAirSpeed;

/**
 * 请求bean
 * @author leo
 */
public class RequestVin {
    private Vehicle data;


    public Vehicle getData() {
        return data;
    }

    public void setData(Vehicle data) {
        this.data = data;
    }
}
