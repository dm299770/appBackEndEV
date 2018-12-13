package com.xxx.demo.controller.remote;

import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.finder.request.RequestParameterForCtrl;
import com.xxx.demo.jsonBean.remote.request.*;
import com.xxx.demo.services.remote.RemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:车控
 * @author:@guo.zj
 */

@RestController
@RequestMapping({"/remotecontrol"})
public class RemoteController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
        private RemoteService remoteService;
    /**
     * @description:车锁
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "doors")
    public Object remotedoor(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.remotedoor(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }


    /**
     * @description:天窗
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "sunroof")
    public Object sunroof(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.sunroof(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }



    /**
     * @description:空调开关
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "airconditionertrun")
    public Object airconditionertrun(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.airconditionertrun(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }


    /**
     * @description:空调温度
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "airtemperture")
    public Object airconditionertemperture(@RequestBody RequestParameterForAirTemperture data) {
        JSONObject result=null;
        try {
            result = remoteService.airconditionertemperture(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }


    /**
     * @description:空调风速
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "airspeed")
    public Object airspeed(@RequestBody RequestParameterForAirSpeed data) {
        JSONObject result=null;
        try {
            result = remoteService.airspeed(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @description:空调定时
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "airtiming")
    public Object airtiming(@RequestBody RequestParameterForAirTiming data) {
        JSONObject result=null;
        try {
            result = remoteService.airtiming(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @description:空调预热
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "defrost ")
    public Object defrost (@RequestBody RequestVin data) {
        JSONObject result=null;
        try {
            result = remoteService.defrost(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @description:闪烁鸣笛
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "horn")
    public Object horn(@RequestBody RequestVin data) {
        JSONObject result=null;
        try {
            result = remoteService.horn(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }



    /**
     * @description:后备箱锁
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "trunk")
    public Object runk(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.remotedoor(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }


    /**
     * @description:启车/熄火
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "carpower")
    public Object carpower(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.remotedoor(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();

        }
        return result;
    }


    /**
     * @description:车窗
     * @author:@guo.zj
     */
    @ResponseBody
    @RequestMapping(value = "window")
    public Object window(@RequestBody RequestParameterForWindow data) {
        JSONObject result=null;
        try {
            result = remoteService.window(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }
}