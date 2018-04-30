package com.example.a16031940.demoexplicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int requestCodeForSupermanStats = 1;
    int requestCodeForBatmanStats = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvBatman = findViewById(R.id.TextViewBatman);
        TextView tvSuperman = findViewById(R.id.TextViewSuperman);

        tvSuperman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hero superman = new Hero("Superman",100,60);
                Intent i = new Intent(MainActivity.this,HeroStatsActivity.class);
                i.putExtra("hero",superman);
                startActivityForResult(i,requestCodeForSupermanStats);
            }
        });

        tvBatman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hero batman = new Hero("Batman",32,31);
                Intent i = new Intent(MainActivity.this,HeroStatsActivity.class);
                i.putExtra("hero",batman);
                startActivityForResult(i,requestCodeForBatmanStats);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(resultCode == RESULT_OK){
            if(data != null){
                String like = data.getStringExtra("like");
                String statement = "";
                if(requestCode == requestCodeForSupermanStats){
                    statement = "You " + like + " Superman";
                }
                if(requestCode == requestCodeForBatmanStats){
                    statement = "You " + like + " Batman";
                }
                Toast.makeText(MainActivity.this,"Not working :'(",Toast.LENGTH_LONG).show();
            }
        }

    }



}
