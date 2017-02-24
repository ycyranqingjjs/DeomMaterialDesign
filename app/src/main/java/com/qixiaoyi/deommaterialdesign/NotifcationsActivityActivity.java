package com.qixiaoyi.deommaterialdesign;

import android.app.Notification;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NotifcationsActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifcations_activity);
    }
    public void toNotifaction(View v){
        long[] vibratePattern = new long[] {
                2, 1,
                5, 1
        };
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        Notification build = builder.setContentTitle("Title")
                .setContentText("内容文本")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setColor(Color.parseColor("#4b8a08"))
                .setLargeIcon(BitmapFactory.decodeResource(Resources.getSystem(),R.drawable.ic_avatar3))
                .setVibrate(vibratePattern)
                .setLights(Color.MAGENTA,2,1)
                .build();
        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        managerCompat.notify(0x123,build);//数字随意
    }
}
