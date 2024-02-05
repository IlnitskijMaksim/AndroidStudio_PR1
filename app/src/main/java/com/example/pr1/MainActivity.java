package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button simpleButton;
    private TextView simpleTextView;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleButton = findViewById(R.id.simpleButton);
        simpleTextView = findViewById(R.id.simpleTextView);
        simpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    simpleTextView.setText("Hello!");
                    i++;
                }
                else if (i == 1){
                    simpleTextView.setText("Stop pressing me!");
                    i++;
                }
                else {
                    simpleTextView.setText("\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21");
                }
            }
        });
    }
}