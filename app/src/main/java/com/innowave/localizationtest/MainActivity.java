package com.innowave.localizationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultTV;
    private Button EngBtn;
    private Button MMBtn;
    private Button ChBtn;
    MultilanguageProcesser multilanguageProcesser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multilanguageProcesser = new MultilanguageProcesser(this);
        multilanguageProcesser.loadLanguage();

        resultTV = findViewById(R.id.result);
        resultTV.setText(R.string.text);
        EngBtn = findViewById(R.id.eng_btn);
        MMBtn = findViewById(R.id.mm_btn);
        ChBtn = findViewById(R.id.chinese_btn);
//        EngBtn.setOnClickListener(this);
//        MMBtn.setOnClickListener(this);

        EngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setENGFont();

            }
        });
        MMBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMMFont();
            }
        });
        ChBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setChFont();
            }
        });
    }


    public void setENGFont() {

        multilanguageProcesser.setLanguage("en-rUS");
        recreate();

    }

    public void setMMFont() {

        multilanguageProcesser.setLanguage("my");
        recreate();
    }
public void setChFont(){
    multilanguageProcesser.setLanguage("zh");
    recreate();
}
}
