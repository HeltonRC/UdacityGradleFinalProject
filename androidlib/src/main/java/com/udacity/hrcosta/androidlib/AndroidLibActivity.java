package com.udacity.hrcosta.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibActivity extends AppCompatActivity {

    public static final String PARAM_JOKE = "joke";
    private String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidlib);

        joke = getIntent().getStringExtra(PARAM_JOKE);
        TextView tvJoke = this.findViewById(R.id.tvJoke);
        tvJoke.setText(joke);

    }




}
