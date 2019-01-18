package com.example.admin.cgcwebview;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlarmActivity extends AppCompatActivity {

    EditText inputEditText;
    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        inputEditText = findViewById(R.id.editTextInput);
        saveButton = findViewById(R.id.buttonSave);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int time = Integer.parseInt(inputEditText.getText().toString());
               Intent i = new Intent(AlarmActivity.this,MainActivity.class);
                PendingIntent pendingIntent =
                        PendingIntent.getActivity(AlarmActivity.this,123,i,0);

                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

                alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+time*1000,pendingIntent);



            }
        });
    }





}
