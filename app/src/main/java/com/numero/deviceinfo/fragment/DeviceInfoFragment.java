package com.numero.deviceinfo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.support.annotation.Nullable;

import com.numero.deviceinfo.R;
import com.numero.deviceinfo.model.DeviceInfo;

public class DeviceInfoFragment extends PreferenceFragment {

    private DeviceInfo deviceInfo = new DeviceInfo();

    public static Fragment getInstance() {
        return new DeviceInfoFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.device_info_list);

        setupLayout();
    }

    private void setupLayout() {
        PreferenceScreen deviceNameScreen = (PreferenceScreen) findPreference("device_name_screen");
        PreferenceScreen deviceBrandScreen = (PreferenceScreen) findPreference("device_brand_screen");
        PreferenceScreen deviceVersionScreen = (PreferenceScreen) findPreference("device_version_screen");
        PreferenceScreen deviceCodeNameScreen = (PreferenceScreen) findPreference("device_code_name_screen");

        deviceNameScreen.setSummary(deviceInfo.getName());
        deviceBrandScreen.setSummary(deviceInfo.getBrand());
        deviceVersionScreen.setSummary(deviceInfo.getVersion());
        // TODO コードネームに変換
        deviceCodeNameScreen.setSummary(String.valueOf(deviceInfo.getApi()));
    }
}
