package com.rujira.makebuttonopennewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOpenActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
    }

    private void initInstances() {
        btnOpenActivity = (Button) findViewById(R.id.btnOpenActivity);

        btnOpenActivity.setOnClickListener(btnOpenActivityListener);
    }

    View.OnClickListener btnOpenActivityListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view == btnOpenActivity) {
                openSecondActivity();
            }
        }
    };

    private void openSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}
