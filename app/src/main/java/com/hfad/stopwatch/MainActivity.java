package com.hfad.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int seconds =0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickStart(View view){
        running =true;
    }

    public void onClickStop(View view){
        running =false;
    }

    public void onClickReset(View view){
        running=false;
        seconds=0;
    }


private void runTimer(){
        final TextView timeView= (TextView)findViewById(R.id.time_view);
        
}



}