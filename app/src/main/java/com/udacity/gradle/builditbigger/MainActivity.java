package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.udacity.hrcosta.androidlib.AndroidLibActivity;
import com.udacity.hrcosta.libjokes.MyJokesClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        String joke = MyJokesClass.getJoke();
        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        //TODO in step 3, the joke will be passed as an intent extra to the Android Library.

        Intent myIntent = new Intent(this, AndroidLibActivity.class);
        myIntent.putExtra(AndroidLibActivity.PARAM_JOKE, joke);

        startActivity(myIntent);

    }


    public void launchLibraryActivity(View view) {

    }

}
