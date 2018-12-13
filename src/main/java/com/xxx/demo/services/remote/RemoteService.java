package com.xxx.demo.services.remote;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.finder.request.RequestParameterForCtrl;
import com.xxx.demo.jsonBean.remote.request.*;


/**
 * @description:登录相关的方法
 * @author:@leo.
 */
public interface RemoteService {
    /**
     * 车锁
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject remotedoor(RequestParameterForCtrl request);


    /**
     * 天窗
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject sunroof(RequestParameterForCtrl request);


    /**
     * 车窗
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject window(RequestParameterForWindow request);


    /**
     * 空调开关
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject airconditionertrun(RequestParameterForCtrl request);


    /**
     * 空调温度
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject airconditionertemperture(RequestParameterForAirTemperture request);


    /**
     * 空调风速
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject airspeed(RequestParameterForAirSpeed request);


    /**
     * 空调定时
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject airtiming(RequestParameterForAirTiming request);


    /**
     * 空调预热
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject defrost(RequestVin request);

    /**
     * 闪灯鸣笛
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject horn(RequestVin request);

    /**
     * 后备箱锁
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject runk(RequestParameterForCtrl request);

    /**
     * 后备箱锁
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject carpower(RequestParameterForCtrl request);
}

