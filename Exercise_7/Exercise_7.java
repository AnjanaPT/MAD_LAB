
/*MainActivity.java*/

package com.example.exercise__7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickBtn = findViewById(R.id.btn1);
        TextView viewText = findViewById(R.id.txtv1);
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText("You Have Submitted The Details !!");
            }
        });
    }
}


