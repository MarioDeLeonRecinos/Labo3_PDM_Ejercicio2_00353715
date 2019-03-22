package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.myapplication.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();

    private Button mButton, mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.Button_send);
        mButtonShare = findViewById(R.id.Button_share);
        mButton.setOnClickListener(v->{
            Intent mIntent= new Intent(MainActivity.this,Main2Activity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY,"Hola, NewActivity. Skrtt");
            startActivity(mIntent);
        });
        mButtonShare.setOnClickListener(v->{
            Intent mIntent = new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT,"");
            startActivity(mIntent);
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"on pause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"on Stop");
    }

}
