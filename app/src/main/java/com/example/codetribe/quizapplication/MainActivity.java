package com.example.codetribe.quizapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends Activity {
    MagicButton movies, technology, politics;
    int id;
    static  String ids;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        movies = (MagicButton) findViewById(R.id.btnMovies);
        technology = (MagicButton) findViewById(R.id.btnTechnology);
        politics = (MagicButton) findViewById(R.id.btnPolitics);

        politics.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = 1;
                Intent intent = new Intent(MainActivity.this, RandomActivity.class);
                intent.putExtra(ids,id);
                startActivity(intent);
            }
        });

        movies.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = 2;
                Intent intent = new Intent(MainActivity.this, RandomActivity.class);
                intent.putExtra(ids,id);
                startActivity(intent);
            }
        });

        technology.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = 3;
                Intent intent = new Intent(MainActivity.this, RandomActivity.class);
                intent.putExtra(ids,id);
                startActivity(intent);
            }
        });
    }
}


