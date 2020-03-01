package com.rujira.makebuttonopennewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initInstances();
    }

    private void initInstances() {
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

        Intent intent = getIntent();

        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        tv1.setText(text);
        tv2.setText("" + number);

    }
}
