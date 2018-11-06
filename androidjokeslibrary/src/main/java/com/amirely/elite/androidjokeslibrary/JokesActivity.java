package com.amirely.elite.androidjokeslibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        displayJoke();
    }

    private void displayJoke() {
        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        TextView joke_tv = findViewById(R.id.joke_tv);
        joke_tv.setText(joke);
    }

}
