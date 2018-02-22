package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startGame(View view){
        Intent i = new Intent(this,gameInterface.class);
        startActivity(i);
    }

    public void startXGame(View view){
        Intent i = new Intent(this,xGameInterface.class);
        startActivity(i);
    }

    public void start2Player(View view){
        Intent i = new Intent(this,twoPlayerInterface.class);
        startActivity(i);
    }
}
