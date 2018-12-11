package com.cqnu.sunxt.telephonebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_layout);
        getSupportActionBar().hide();
        Thread t = new Thread(new Pause());
        t.start();
    }

    public class Pause implements Runnable {
        public void run() {
            try {
                Thread.sleep(1000);
                Intent intent = new Intent();
                intent.setClass(WelcomeActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
            catch(Exception exception) {
                Toast.makeText(WelcomeActivity.this,"启动异常",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
