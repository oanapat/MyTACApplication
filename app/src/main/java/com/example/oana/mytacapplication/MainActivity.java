package com.example.oana.mytacapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static int TIMER_REQUEST_CODE = 0;
    public final static int ALARM_REQUEST_CODE = 1;
    public final static int CALENDAR_REQUEST_CODE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTimerClick(View view) {
        Intent intent = new Intent(this, TimerActivity.class);
        startActivityForResult(intent, TIMER_REQUEST_CODE);
    }

    public void onAlarmClick(View view) {
        Intent intent = new Intent(this, AlarmActivity.class);
        startActivityForResult(intent, ALARM_REQUEST_CODE);
    }

    public void onCalendarClick(View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivityForResult(intent, CALENDAR_REQUEST_CODE);
    }
}
