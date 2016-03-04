package com.example.oana.mytacapplication;

/**
 * Created by Oana on 2/15/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AlarmActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityalarm);
    }

    public void onSetAlarmClick(View view) {
        EditText hourText = (EditText)findViewById(R.id.set_hour);
        int hour = Integer.parseInt(hourText.getText().toString());

        EditText minutesText = (EditText)findViewById(R.id.set_minutes);
        int minutes = Integer.parseInt(minutesText.getText().toString());

        EditText messageAlarm = (EditText)findViewById(R.id.set_alarm_message);
        String message = messageAlarm.getText().toString();

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                .putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        int x = 1;
    }
}