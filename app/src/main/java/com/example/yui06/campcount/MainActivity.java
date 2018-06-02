package com.example.yui06.campcount;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    int number;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(TextView)findViewById(R.id.textView);
        text.setText("0");
        text.setTextColor(Color.BLACK);

        if (number>10){
            text.setTextColor(Color.rgb(255,0,0));
        }

    }

    public void plus(View v){
        number=number+1;
        text.setText(String.valueOf(number));

        color(number);

    }

    public void minus(View v){
        number=number-1;
        text.setText(String.valueOf(number));

        color(number);
    }

    public void clear(View v){
        number=0;
        text.setText("0");
        text.setTextColor(Color.BLACK);

        color(number);
    }


    public void color(int number){
        if (number>=10){
            text.setTextColor(Color.rgb(255,0,0));
        }
    }




}
