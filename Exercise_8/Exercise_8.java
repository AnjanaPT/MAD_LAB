/*MainActivity.java*/

package com.example.exercise_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plusBtn = (Button) findViewById(R.id.plus);
        Button minusBtn = (Button)findViewById(R.id.minus);
        Button resetBtn = (Button) findViewById(R.id.reset);
        TextView countValue = (TextView) findViewById(R.id.count_value);
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                countValue.setText(count +" ");
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                countValue.setText(count +" ");
            }
        });
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                countValue.setText(count +" ");
            }
        });
    }
}

