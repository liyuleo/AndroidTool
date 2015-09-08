package com.leo.tool;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.android_id_message)).setText(getAndroidId());
        ((TextView) findViewById(R.id.imei_message)).setText(getIMEI());
    }

    public String getAndroidId() {
        return android.provider.Settings.Secure.getString(
                getContentResolver(),
                android.provider.Settings.Secure.ANDROID_ID);

    }

    public String getIMEI() {

        return ((TelephonyManager) getSystemService(
                Context.TELEPHONY_SERVICE)).getDeviceId();

    }

}
