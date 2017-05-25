package com.example.rishabh.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team_a_score ;
    int team_b_score ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team_a_score=0;
        team_b_score=0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
    }

    public void resetBoth(View v) {
        TextView scoreView_a = (TextView) findViewById(R.id.team_a_score);
        scoreView_a.setText(String.valueOf(0));
        TextView scoreView_b = (TextView) findViewById(R.id.team_b_score);
        scoreView_b.setText(String.valueOf(0));
        team_a_score=0;
        team_b_score=0;
    }

    public void addThreePointer_TeamA(View v) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        team_a_score+=3;
        scoreView.setText(String.valueOf(team_a_score));
    }

    public void addTwoPointer_TeamA(View v) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        team_a_score+=2;
        scoreView.setText(String.valueOf(team_a_score));
    }

    public void addOnePointer_TeamA(View v) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        team_a_score+=1;
        scoreView.setText(String.valueOf(team_a_score));
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointer_TeamB(View v) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        team_b_score+=3;
        scoreView.setText(String.valueOf(team_b_score));
    }

    public void addTwoPointer_TeamB(View v) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        team_b_score+=2;
        scoreView.setText(String.valueOf(team_b_score));
    }

    public void addOnePointer_TeamB(View v) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        team_b_score+=1;
        scoreView.setText(String.valueOf(team_b_score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
