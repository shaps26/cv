package com.example.shaps.cv_shpas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonCompetence;
    private Button buttonFormation;
    private Button buttonExperience;
    private Button buttonLnk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCompetence = (Button) findViewById(R.id.buttonCompetence);
        buttonCompetence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCompetence();
            }
        });

        buttonFormation = (Button) findViewById(R.id.buttonFormation);
        buttonFormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFormation();
            }
        });

        buttonExperience = (Button) findViewById(R.id.buttonExperience);
        buttonExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToExperience();
            }
        });

    }

    public void goToCompetence(){
        Intent CompetenceIntent = new Intent(getApplicationContext(), CompetenceActivity.class);
        startActivity(CompetenceIntent);

    }

    public void goToFormation(){
        Intent FormationIntent = new Intent(getApplicationContext(), FormationActivity.class);
        startActivity(FormationIntent);

    }

    public void goToExperience(){
        Intent ExperienceIntent = new Intent(getApplicationContext(), ExperienceActivity.class);
        startActivity(ExperienceIntent);

    }
}
