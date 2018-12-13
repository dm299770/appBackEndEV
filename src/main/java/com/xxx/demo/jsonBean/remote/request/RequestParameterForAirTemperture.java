package com.xxx.demo.jsonBean.remote.request;


import com.xxx.demo.jsonBean.remote.remotemodel.VehicleAirTemperture;

/**
 * 请求bean
 * @author leo
 */
public class RequestParameterForAirTemperture {
    private VehicleAirTemperture data;


    public VehicleAirTemperture getData() {
        return data;
    }

    public void setData(VehicleAirTemperture data) {
        this.data = data;
    }
}
