package com.example.a16031940.demoexplicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HeroStatsActivity extends AppCompatActivity {

    TextView tvName,tvStrength, tvTechnicalprowess;
    Button btnLike,btnDislike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_stats);

        Intent i = getIntent();
        Hero hero = (Hero)i.getSerializableExtra("hero");

        tvName = (TextView)findViewById(R.id.TextViewName);
        tvStrength = (TextView)findViewById(R.id.TextViewStrength);
        tvTechnicalprowess = (TextView)findViewById(R.id.TextViewTechnicalProwess);
        btnDislike = (Button)findViewById(R.id.buttonDislike);
        btnLike = (Button)findViewById(R.id.buttonLike);

        tvName.setText("name: " + hero.getName());
        tvStrength.setText("Strength: " + hero.getStrength());
        tvTechnicalprowess.setText("Technical prowess: " + hero.getTechnicalProwess());

        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("like","like");
                setResult(RESULT_OK,i);
                finish();
            }
        });

        btnDislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("like" , "dislike");
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }
}
