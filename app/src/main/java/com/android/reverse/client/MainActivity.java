package com.android.reverse.client;

import android.app.Activity;
import android.os.Bundle;

import com.android.reverse.R;

import java.lang.reflect.InvocationTargetException;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {


        } catch (Exception e) {
            // TODO Auto-generated catch block
            ((InvocationTargetException) e).getTargetException().printStackTrace();
        }
    }


}
