package com.example.ibanezf.interactivestoryapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public class StoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        getActionBar().show();
//        getActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

    }

}
