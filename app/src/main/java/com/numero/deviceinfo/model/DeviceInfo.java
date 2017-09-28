package com.numero.deviceinfo.model;

import android.os.Build;

public class DeviceInfo {

    private String name;
    private String brand;
    private int api;
    private String version;
    private String codeName;

    public DeviceInfo() {
        this.name = Build.MODEL;
        this.brand = Build.BRAND;
        this.api = Build.VERSION.SDK_INT;
        this.version = Build.VERSION.RELEASE;
        this.codeName = Build.VERSION.CODENAME;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getApi() {
        return api;
    }

    public String getVersion() {
        return version;
    }

    public String getCodeName() {
        return codeName;
    }
}
