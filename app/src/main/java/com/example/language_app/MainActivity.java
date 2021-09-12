package com.example.language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });


        //open's Family Members Activity
        // Find the View that shows the numbers category
        TextView familyMembers = (TextView) findViewById(R.id.family);
        // Set a click listener on that View
        familyMembers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View v) {
                Intent familyMembersIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyMembersIntent);
            }
        });

        //open's colors list Activity
        // Find the View that shows the numbers category
        TextView colours = (TextView) findViewById(R.id.colors);
        // Set a click listener on that View
        colours.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View v) {
                Intent coloursIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(coloursIntent);
            }
        });

        //open's phrases list Activity
        // Find the View that shows the numbers category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this,PhraseActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }



}