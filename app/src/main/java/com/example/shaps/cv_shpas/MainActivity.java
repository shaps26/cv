package com.example.shaps.cv_shpas;

import android.content.Intent;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    private Button buttonCompetence;
    private Button buttonFormation;
    private Button buttonExperience;
    private ImageButton buttonLnk;
    private ImageButton buttonGit;


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

        buttonLnk = (ImageButton) findViewById(R.id.buttonLnk);
        buttonLnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLnk();
            }
        });

        buttonGit = (ImageButton) findViewById(R.id.buttonGIt);
        buttonGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTOGit();
            }
        });

    }

    public void goToCompetence() {
        Intent CompetenceIntent = new Intent(getApplicationContext(), CompetenceActivity.class);
        startActivity(CompetenceIntent);

    }

    public void goToFormation() {
        Intent FormationIntent = new Intent(getApplicationContext(), FormationActivity.class);
        startActivity(FormationIntent);

    }

    public void goToExperience() {
        Intent ExperienceIntent = new Intent(getApplicationContext(), ExperienceActivity.class);
        startActivity(ExperienceIntent);

    }

    public void goToLnk() {
        Uri uri = Uri.parse("https://www.linkedin.com/in/shapeche-shan-684295a7/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);


    }

    public void goTOGit() {
        Uri uri = Uri.parse("https://www.linkedin.com/in/shapeche-shan-684295a7/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);


    }
}
