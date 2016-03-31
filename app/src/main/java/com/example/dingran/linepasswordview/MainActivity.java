package com.example.dingran.linepasswordview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jungly.gridpasswordview.GridPasswordView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridPasswordView gpView = (GridPasswordView) findViewById(R.id.gpv_normal);
        gpView.setPasswordVisibility(true);
    }
}
