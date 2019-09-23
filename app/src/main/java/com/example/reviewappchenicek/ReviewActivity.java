package com.example.reviewappchenicek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReviewActivity extends AppCompatActivity {

    public static final String RATING = "NA";
    public static final String ACTIVITY = "ACTIVITY NA";
    public static final String DESCRIPTION = "DESCRIPTION NA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        Intent intent = getIntent();
        String rating = intent.getStringExtra(RATING);
        String activity = intent.getStringExtra(ACTIVITY);
        String desc = intent.getStringExtra(DESCRIPTION);

        TextView out1 = (TextView) findViewById(R.id.category);
        TextView out2 = (TextView) findViewById(R.id.descrip);
        TextView out3 = (TextView) findViewById(R.id.rating);

        out1.setText(activity);
        out2.setText("Description: " + desc);
        out3.setText(rating + "/5");

    }
}
