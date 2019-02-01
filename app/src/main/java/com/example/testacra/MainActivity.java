package com.example.testacra;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Context context = this.getApplicationContext();
        setContentView(R.layout.activity_main);
        Log.i(MyApp.TAG, "MainActivity.onCreate()");
        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener((item) -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    int i = 0;
                    Log.i(MyApp.TAG, "Throwing exception in main activity");
                    //noinspection divzero
                    Log.i(MyApp.TAG, "This shouldn't show up" + 3 / i);
                    return true;
                case R.id.navigation_dashboard:
                    Log.i(MyApp.TAG, "Starting Activity2");
                    startActivity(new Intent(context, Activity2.class));
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        });

    }

}
