package com.example.d27sa.colormatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Target extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
    }
/*Method to switch from target activity to the main activity by generating an Intent
    Flag_activity_clear_top used as the activity being launched is already running in the current task,
     then instead of launching a new instance of that activity, all of the other activities on top of it
      will be closed and this Intent will be delivered to the (now on top) old activity as a new Intent.*/
    public void BacktoMA(View view){
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
