package com.xxx.demo.jsonBean.remote.remotemodel;

/**
 * 空调温度
 * @author guo.zj
 */
public class VehicleAirTemperture {
    private int temperture;
    private String vin;


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }


    public int getTemperture() {
        return temperture;
    }

    public void setTemperture(int temperture) {
        this.temperture = temperture;
    }
}
