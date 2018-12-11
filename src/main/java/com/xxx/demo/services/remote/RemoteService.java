package com.xxx.demo.services.remote;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.finder.request.RequestParameterForCtrl;


/**
 * @description:登录相关的方法
 * @author:@leo.
 */
public interface RemoteService {
    /**
     * 远程车控
     *
     * @param vin车架号 操作类型
     * @return 成功失败
     */
    JSONObject remote(RequestParameterForCtrl request);
}

