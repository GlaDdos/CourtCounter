package com.example.kamil.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textViewTeamA;
    TextView textViewTeamB;

    int teamAPoints;
    int teamBPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAPoints = 0;
        teamBPoints = 0;

        textViewTeamA = (TextView) findViewById(R.id.textViewTeamA);
        textViewTeamB = (TextView) findViewById(R.id.textViewTeamB);
    }

    public void displayTeamA() {
        textViewTeamA.setText("" + teamAPoints);
    }

    public void addPointsTeamA(View view) {
        int point = Integer.parseInt(view.getTag().toString());
        teamAPoints += point;
        displayTeamA();
    }

    public void displayTeamB() {
        textViewTeamB.setText("" + teamBPoints);
    }

    public void addPointsTeamB(View view) {
        int point = Integer.parseInt(view.getTag().toString());
        teamBPoints += point;
        displayTeamB();
    }

    public void resetScores(View view){
        teamAPoints = 0;
        teamBPoints = 0;

        displayTeamA();
        displayTeamB();
    }


}
