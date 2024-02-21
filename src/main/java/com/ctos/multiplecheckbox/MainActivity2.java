package com.ctos.multiplecheckbox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1 = findViewById(R.id.tv);
        textView2 = findViewById(R.id.tv1);

        // Retrieve the results passed from MainActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value1 = extras.getString("resultForQ1", "No data for Q1"); // Provide default value
            String value2 = extras.getString("resultForQ2", "No data for Q2"); // Provide default value

            textView1.setText(value1);
            textView2.setText(value2);
        }
    }
}
