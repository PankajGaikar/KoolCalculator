package com.tricksmachine.koolcalculator;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public enum Operation {
        ADD, SUB, DIV, MUL, EQL
    };

    String runningNumber = "";
    String leftValueString = "";
    String rightValueString = "";
    int result = 0;
    Operation currentOperation;
    TextView resultsTextView;

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
        ImageButton equalButton = (ImageButton)findViewById(R.id.equalButton);

        Button clearButton = (Button)findViewById(R.id.clearButton);

        resultsTextView = (TextView)findViewById(R.id.resultsTextView);

        resultsTextView.setText("");

        oneButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(1);
            }
        });


        twoButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(2);
            }
        });

        threeButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(3);
            }
        });

        fourButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(4);
            }
        });

        fiveButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(5);
            }
        });

        sixButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(6);
            }
        });

        sevenButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(7);
            }
        });


        eightButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(8);
            }
        });

        nineButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(9);
            }
        });

        zeroButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                numberPressed(0);
            }
        });

        addButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                performCalculation(Operation.ADD);
            }
        });

        divideButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                performCalculation(Operation.DIV);
            }
        });

        substractButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                performCalculation(Operation.SUB);
            }
        });

        multiplyButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                performCalculation(Operation.MUL);
            }
        });

        equalButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                performCalculation(Operation.EQL);
            }
        });

        clearButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                resultsTextView.setText("0");
                leftValueString = "";
                rightValueString = "";
                result = 0;
                currentOperation = null;
            }
        });
    }

    void numberPressed(int number){
        runningNumber += number;
        resultsTextView.setText(runningNumber);
    }

    void  performCalculation(Operation operation) {

        if (currentOperation != null) {

            if (runningNumber != "") {
                rightValueString = runningNumber;
                runningNumber = "";

                switch (currentOperation) {
                    case ADD:
                        result = Integer.parseInt(leftValueString) + Integer.parseInt(rightValueString);
                        break;
                    case SUB:
                        result = Integer.parseInt(leftValueString) - Integer.parseInt(rightValueString);
                        break;
                    case MUL:
                        result = Integer.parseInt(leftValueString) * Integer.parseInt(rightValueString);
                        break;
                    case DIV:
                        result = Integer.parseInt(leftValueString) / Integer.parseInt(rightValueString);
                        break;
                }

                leftValueString = String.valueOf(result);
                resultsTextView.setText(leftValueString);
            }


        } else {
            leftValueString = runningNumber;
            runningNumber = "";
        }

        currentOperation = operation;
    }

}
