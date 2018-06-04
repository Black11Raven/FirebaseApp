package com.example.shantanu.firebasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView2);
        textView2 = (TextView) findViewById(R.id.textView3);

        if(getIntent().getExtras()!=null){
            for(String key : getIntent().getExtras().keySet()){
                if(key.equals("title")){
                    textView1.setText(getIntent().getExtras().getString(key));
                }
                else if(key.equals("message")){
                    textView2.setText(getIntent().getExtras().getString(key));
                }
            }
        }
    }
}
