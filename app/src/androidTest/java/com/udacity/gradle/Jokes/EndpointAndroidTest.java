package com.udacity.gradle.Jokes;

import android.content.Context;
import android.os.AsyncTask;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import com.amirely.elite.jokes.JokesProvider;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointAndroidTest {
    private Context context;

    @Before
    public void setup() {
        context = InstrumentationRegistry.getContext();
    }

    @Test
    public void testVerifyResponse() throws ExecutionException, InterruptedException {
        AsyncTask<Pair<Context, String>, Void, String> task = new EndpointAsyncTask().execute(new Pair<>(context, JokesProvider.tellMeAJoke()));
        String joke = task.get();
        assertTrue(joke.length() > 0);
    }
}
