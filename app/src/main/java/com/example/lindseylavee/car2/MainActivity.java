package com.example.lindseylavee.car2;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.graphics.Color;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.util.Log;
import android.widget.RadioButton;
public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    boolean check = false;
    Button PowerButton;
    Button pause;
    Button Stop;
    Button Fastforward;
    Button repeat;
    boolean AM = true;
    double fm;
    int am;
    SeekBar station;
    TextView display;
    RadioButton AMButton;
    RadioButton FMButton;

    RadioButton Pre1;
    RadioButton Pre2;
    RadioButton Pre3;
    RadioButton Pre4;
    RadioButton Pre5;
    RadioButton Pre6;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PowerButton = (Button) findViewById(R.id.PowerButton);
        pause = (Button) findViewById(R.id.pause);
        Stop = (Button) findViewById(R.id.Stop);
        Fastforward = (Button) findViewById(R.id.Fastforward);
        repeat = (Button) findViewById(R.id.repeat);
        station = (SeekBar) findViewById(R.id.station);
        am = station.getProgress();
        station.setOnSeekBarChangeListener(this);
        display = (TextView) findViewById(R.id.display);
        AMButton = (RadioButton) findViewById(R.id.AMButton);
        FMButton = (RadioButton) findViewById(R.id.FMButton);
        Pre1 = (RadioButton) findViewById(R.id.pre1);
        Pre2 = (RadioButton) findViewById(R.id.pre2);
        Pre3 = (RadioButton) findViewById(R.id.pre3);
        Pre4 = (RadioButton) findViewById(R.id.pre4);
        Pre5 = (RadioButton) findViewById(R.id.pre5);
        Pre6 = (RadioButton) findViewById(R.id.pre6);

        PowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked(v);


            }
        });

        AMButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                isClicked(v);
            }
        });

        FMButton.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                isClicked(v);
            }
        });




        }


    public void isClicked(View v) {

        if(v.equals(AMButton)) {
            station.setMax(117);
            AM = true;
            return;

        }
        if(v.equals(FMButton)){
            station.setMax(99);
            AM= false;
            return;
        }


        if(v.equals(Pre1)) {
            display.setText(550+"AM");
        }
        if(v.equals(Pre2)) {
            display.setText(600+"AM");
        }
        if(v.equals(Pre3)) {
            display.setText(650+"AM");
        }
        if(v.equals(Pre4)) {
            display.setText(700+"AM");
        }
        if(v.equals(Pre5)) {
            display.setText(750+"AM");
        }
        if(v.equals(Pre6)) {
            display.setText(800+"AM");
        }



        if (check == true) {

            pause.setBackgroundColor(Color.BLACK);
            Stop.setBackgroundColor(Color.BLACK);
            Fastforward.setBackgroundColor(Color.BLACK);
            repeat.setBackgroundColor(Color.BLACK);
            check = false;

        }
        else {

            pause.setBackgroundColor(Color.GREEN);
            Stop.setBackgroundColor(Color.GREEN);
            Fastforward.setBackgroundColor(Color.GREEN);
            repeat.setBackgroundColor(Color.GREEN);
            check = true;



        }


    }

    public void onProgressChanged(SeekBar seekBar, int am, boolean name) {

        //if (am button is pressed)
        am = station.getProgress();


        if(AM) {
            int d = (am*10)+530;

            display.setText(d+"AM");

        }

        if(!AM) {
            double d = (am*.2)+88.1;

            display.setText(d+"FM");

        }


    }

    public void onStartTrackingTouch (SeekBar seekbar) {


    }

    public void onStopTrackingTouch(SeekBar seekbar) {

    }


    }

