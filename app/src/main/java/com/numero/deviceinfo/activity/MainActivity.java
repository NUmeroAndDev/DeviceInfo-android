package com.numero.deviceinfo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.numero.deviceinfo.R;
import com.numero.deviceinfo.fragment.DeviceInfoFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction().replace(R.id.container, DeviceInfoFragment.getInstance()).commit();
    }
}
