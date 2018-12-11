package com.xxx.demo.services.apns;

import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.remote.RequestParameters;

public interface ApnsService {
    /**
     * IOS推送
     *
     * @param vin车架号
     * @return 经纬度
     */
    JSONObject vehiclestate(RequestParameters request);

}


