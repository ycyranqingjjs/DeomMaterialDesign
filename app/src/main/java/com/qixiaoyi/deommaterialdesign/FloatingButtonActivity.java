package com.qixiaoyi.deommaterialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class FloatingButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_button);
    }
    public void onbuttonClick(View v){
        Toast.makeText(this, "点击了", Toast.LENGTH_SHORT).show();
    }
}
