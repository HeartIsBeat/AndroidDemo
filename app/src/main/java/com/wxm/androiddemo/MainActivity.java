package com.wxm.androiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //模拟一个长时间操作,产生ANR
                try {
                    Thread.sleep(8*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Toast toast = Toast.makeText(getApplicationContext(),"点击完成", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
