package com.tricksmachine.koolcalculator;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button oneButton = (Button)findViewById(R.id.oneButton);
        Button twoButton = (Button)findViewById(R.id.twoButton);
        Button threeButton = (Button)findViewById(R.id.threeButton);
        Button fourButton = (Button)findViewById(R.id.fourButton);
        Button fiveButton = (Button)findViewById(R.id.fiveButton);
        Button sixButton = (Button)findViewById(R.id.sixButton);
        Button sevenButton = (Button)findViewById(R.id.sevenButton);
        Button eightButton = (Button)findViewById(R.id.eightButton);
        Button nineButton = (Button)findViewById(R.id.nineButton);
        Button zeroButton = (Button)findViewById(R.id.zeroButton);

        ImageButton divideButton = (ImageButton)findViewById(R.id.divideButton);
        ImageButton addButton = (ImageButton)findViewById(R.id.addBtn);
        ImageButton substractButton = (ImageButton)findViewById(R.id.substractButton);
        ImageButton multiplyButton = (ImageButton)findViewById(R.id.multiplyButton);
        Button clearButton = (Button)findViewById(R.id.clearButton);

        TextView resultsTextView = (TextView)findViewById(R.id.resultsTextView);


        oneButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });


        twoButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        threeButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        fourButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        fiveButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        sixButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        sevenButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });


        eightButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        nineButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        zeroButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        addButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        divideButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        substractButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        multiplyButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });

        clearButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {

            }
        });



    }
}
