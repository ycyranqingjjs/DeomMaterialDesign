package com.qixiaoyi.deommaterialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toTloatingbuttonActivity(View view){
        startActivity(new Intent(MainActivity.this,FloatingButtonActivity.class));
    }
    public void toNotifcationsActivity(View view){
        startActivity(new Intent(MainActivity.this,NotifcationsActivityActivity.class));
    }
    public void toToolBarActivity(View view){
        startActivity(new Intent(MainActivity.this,ToolBarActivity.class));
    }
}
