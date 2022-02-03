/*MainActivity.java*/

package com.example.exercise_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void select(View view)
    {
        boolean checked=((CheckBox)view).isChecked();
        switch (view.getId())
        {
            case R.id.check1:
                if (checked)
                    displaymessage( "Selected TCS");
                else
                    displaymessage("Removed TCS");
                break;
            case R.id.check2:
                if(checked)
                    displaymessage("Selected COGNIZANT");
                else
                    displaymessage("Removed COGNZANT");
                break;
        }
    }
        public void displaymessage(String s)
        {
            Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        }
}