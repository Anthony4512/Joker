package com.udacity.gradle.Jokes;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.amirely.elite.jokes.JokesProvider;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) {
        new EndpointAsyncTask().execute(new Pair<Context, String>(this, JokesProvider.tellMeAJoke()));
    }
}
