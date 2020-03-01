package com.rujira.makebuttonopennewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnOpenActivity;
    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
    }

    private void initInstances() {
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

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
        String text = et1.getText().toString();
        int number = Integer.parseInt(et2.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}
