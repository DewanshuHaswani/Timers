package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// More frequent way of using Timer

        new CountDownTimer(10000,1000)
        {
          public void onTick(long millisecondsUntilDone){//every second it will be called as per our parameters
              Log.i("seconds left", String.valueOf(millisecondsUntilDone/1000));
          }
          public void onFinish(){
              Log.i("we are done","no more countdown");
          }
        }.start();


        /* METHOD 1 of Timer
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Hey it's us","A second passed by");

                handler.postDelayed(this,1000); // in place of this we can had runnable
            }
        };

        handler.post(run);


 */

    }
}