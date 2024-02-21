package com.ctos.multiplecheckbox;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize CheckBoxes
        cb1 = findViewById(R.id.checkedTextView);
        cb2 = findViewById(R.id.checkedTextView2);
        cb3 = findViewById(R.id.checkedTextView3);
        cb4 = findViewById(R.id.checkedTextView4);
        cb5 = findViewById(R.id.checkedTextView5);
        cb6 = findViewById(R.id.checkedTextView6);
        cb7 = findViewById(R.id.checkedTextView7);
        cb8 = findViewById(R.id.checkedTextView8);

        // Initialize Button
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                String resultForQ1;
                String resultForQ2;

                // Evaluate answers for Q1
                if (cb1.isChecked()) {
                    resultForQ1 = "Right Answer for Q1.";
                } else {
                    resultForQ1 = "Wrong Answer for Q1.";
                }

                // Evaluate answers for Q2
                if (cb5.isChecked() && cb6.isChecked()) {
                    resultForQ2 = "Right Answer for Q2.";
                } else {
                    resultForQ2 = "Wrong Answer for Q2.";
                }

                // Pass results to MainActivity2
                intent.putExtra("resultForQ1", resultForQ1);
                intent.putExtra("resultForQ2", resultForQ2);

                startActivity(intent);
            }
        });
    }
}
