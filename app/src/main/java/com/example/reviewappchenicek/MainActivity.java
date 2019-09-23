package com.example.reviewappchenicek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arraySpinner = new String[] {
                "Restaurant", "Delivery", "Store", "Event", "Album", "Movie", "Game"
        };
            Spinner categories = (Spinner) findViewById(R.id.categories);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, arraySpinner);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            categories.setAdapter(adapter);
    }

    public void onClick(View v){
        Spinner spinner = (Spinner)findViewById(R.id.categories);
        EditText description = (EditText) findViewById(R.id.description);


        String activity = spinner.getSelectedItem().toString();
        String descript = description.getText().toString();

        Integer num = 0;

        switch(v.getId()) {
            case R.id.rate1:
                num = 1;
                break;
            case R.id.rate2:
                num = 2;
                break;
            case R.id.rate3:
                num = 3;
                break;
            case R.id.rate4:
                num = 4;
                break;
            case R.id.rate5:
                num = 5;
                break;
        }
        String rating = num.toString();

        Intent intent = new Intent(this, ReviewActivity.class);

        intent.putExtra(ReviewActivity.ACTIVITY, activity);
        intent.putExtra(ReviewActivity.DESCRIPTION, descript);
        intent.putExtra(ReviewActivity.RATING, rating);

        startActivity(intent);
    }
}
