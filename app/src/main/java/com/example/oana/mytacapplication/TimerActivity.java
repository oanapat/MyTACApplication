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

public class TimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytimer);
    }

    public void onSetTimerClick(View view) {
        // get the alarm settings from the UI
        EditText durationEditText = (EditText) findViewById(R.id.set_duration);
        int duration = Integer.parseInt(durationEditText.getText().toString());

        EditText messageEditText = (EditText) findViewById(R.id.set_message);
        String message = messageEditText.getText().toString();

        // create an implicit intent with extras for a count down timer
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_LENGTH, duration)
                .putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        if(intent.resolveActivity(getPackageManager()) != null) {
            //startActivity(intent);
            startActivityForResult(intent, 0);
        }
        else {
            startActivity(new Intent(this, MainActivity.class));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        int x = 0;
    }
}
