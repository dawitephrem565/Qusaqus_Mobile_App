package com.filenber.qusaqus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class Splash_Screen extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash__screen);

    Thread thread = new Thread(){

      public void run() {
        try {
          // Thread will sleep for 5 seconds
          sleep(5*1000);

          // After 5 seconds redirect to another intent
          Intent i=new Intent(getBaseContext(),MainActivity.class);
          startActivity(i);

          //Remove activity
          finish();
        } catch (Exception e) {
        }
    };


  };
    thread.start();
}

}

