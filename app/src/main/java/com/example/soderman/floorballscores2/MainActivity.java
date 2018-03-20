package com.example.soderman.floorballscores2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*First variables to keep the points starting with Oilers followed by Eräviikingit*/
    private int oilersW = 0;
    private int oilersL1 = 0;
    private int oilersL2 = 0;

    private int viikingitW = 0;
    private int viikingitL1 = 0;
    private int viikingitL2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*2 functions for displaying the scores for each team*/
    public void displayForOilers() {
        TextView scoreView = (TextView) findViewById(R.id.oilers_W);
        scoreView.setText(String.valueOf(oilersW));

        scoreView = (TextView) findViewById(R.id.oilers_L1);
        scoreView.setText(String.valueOf(oilersL1));

        scoreView = (TextView) findViewById(R.id.oilers_L2);
        scoreView.setText(String.valueOf(oilersL2));
    }


    public void displayForViikingit() {
        TextView scoreView = (TextView) findViewById(R.id.viikingit_W);
        scoreView.setText(String.valueOf(viikingitW));

        scoreView = (TextView) findViewById(R.id.viikingit_L1);
        scoreView.setText(String.valueOf(viikingitL1));

        scoreView = (TextView) findViewById(R.id.viikingit_L2);
        scoreView.setText(String.valueOf(viikingitL2));
    }

    public void displayScores() {
        TextView scoreView = (TextView) findViewById(R.id.oilers_score);
        scoreView.setText(String.valueOf((oilersW * 2) + oilersL1));

        scoreView = (TextView) findViewById(R.id.viikingit_score);
        scoreView.setText(String.valueOf((viikingitW * 2) + viikingitL1));
    }

    public void increaseOilersW(View view) {
        oilersW += 1;
        displayForOilers();
        displayScores();
    }

    public void increaseOilersL1(View view) {
        oilersL1 += 1;
        displayForOilers();
        displayScores();
    }

    public void increaseOilersL2(View view) {
        oilersL2 += 1;
        displayForOilers();
        displayScores();
    }

    public void decreaseOilersW(View view) {
        if (oilersW > 0) {
            oilersW -= 1;
            displayForOilers();
            displayScores();
        }
    }

    public void decreaseOilersL1(View view) {
        if (oilersL1 > 0) {
            oilersL1 -= 1;
            displayForOilers();
            displayScores();
        }

    }

    public void decreaseOilersL2(View view) {
        if (oilersL2 > 0) {
            oilersL2 -= 1;
            displayForOilers();
            displayScores();
        }
    }

    public void increaseViikingitW(View view) {
        viikingitW += 1;
        displayForViikingit();
        displayScores();
    }

    public void increaseViikingitL1(View view) {
        viikingitL1 += 1;
        displayForViikingit();
        displayScores();
    }

    public void resetScores(View view) {
        viikingitL1 = 0;
        viikingitL2 = 0;
        viikingitW = 0;

        oilersW = 0;
        oilersL1 = 0;
        oilersL2 = 0;

        displayForViikingit();
        displayForOilers();
        displayScores();
    }

    public void increaseViikingitL2(View view) {
        viikingitL2 += 1;
        displayForViikingit();
        displayScores();
    }

    public void decreaseViikingitW(View view) {
        if (viikingitW > 0) {
            viikingitW -= 1;
            displayForViikingit();
            displayScores();
        }

    }

    public void decreaseViikingitL1(View view) {
        if (viikingitL1 > 0) {
            viikingitL1 -= 1;
            displayForViikingit();
            displayScores();
        }
    }

    public void decreaseViikingitL2(View view) {
        if (viikingitL2 > 0) {
            viikingitL2 -= 1;
            displayForViikingit();
            displayScores();
        }
    }
}
