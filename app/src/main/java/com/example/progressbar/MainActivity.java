package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb,pb2;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pb=(ProgressBar)findViewById(R.id.progressBar);
        pb2=(ProgressBar)findViewById(R.id.progressBar2);

        pb2.setVisibility(View.INVISIBLE);
    }

    public void fun1(View v){
        pb.incrementProgressBy(10);
        pb2.setVisibility(View.VISIBLE);
    }


}