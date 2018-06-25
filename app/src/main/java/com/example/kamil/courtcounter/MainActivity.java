package com.example.kamil.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textViewTeamA;
    int teamAPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAPoints = 0;
        textViewTeamA = (TextView) findViewById(R.id.textViewTeamA);
    }

    public void displayTeamA(int points) {
        textViewTeamA.setText("" + points);
    }

    public void addPointsTeamA(View view) {
        int point = Integer.parseInt(view.getTag().toString());
        teamAPoints += point;
        displayTeamA(teamAPoints);
    }


}
