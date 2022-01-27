package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String TAG="MainActivity";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"...onCreate...");
        textView=(TextView) findViewById(R.id.textView3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"...onStart...");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"...onRestart...");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"...onCreate...");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"...onResume...");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"...onStop...");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"...onDestroy...");

    }
    public void clickHandler(View View){
        Date date=new Date();

        textView.setText("Today is "+date.toString());
        Toast.makeText(this,"Current Date and Time is there.",Toast.LENGTH_SHORT).show();
    }
}