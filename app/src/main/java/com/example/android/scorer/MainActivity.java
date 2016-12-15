package com.example.android.scorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int addA = 0;
    int addB = 0;
    int foulA = 0;
    int foulB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayaddA(0);
        displayaddB(0);
        displayfoulA(0);
        displayfoulB(0);
    }
    public void addA (View V){
        addA = addA + 1;
        displayaddA(addA);
    }
    public void addB (View V){
        addB = addB + 1;
        displayaddB(addB);
    }
    public void foulA (View V){
        foulA = foulA + 1;
        displayfoulA(foulA);
    }
    public void foulB (View V){
        foulB = foulB + 1;
        displayfoulB(foulB);
    }
    public void  reset (View V){
        displayaddA(addA=0);
        displayaddB(addB=0);
        displayfoulA(foulA=0);
        displayfoulB(foulB=0);
    }
    public void displayaddA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.A_fraction);
        scoreView.setText(String.valueOf(score));
    }
    public void displayaddB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.B_fraction);
        scoreView.setText(String.valueOf(score));
    }
    public void displayfoulA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.A_foul);
        scoreView.setText(String.valueOf(score));
    }
    public void displayfoulB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.B_foul);
        scoreView.setText(String.valueOf(score));
    }
}
