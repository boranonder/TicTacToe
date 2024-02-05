package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndGameActivity extends AppCompatActivity {
    Button RestartButton;
    TextView EndGameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);
        EndGameText = (TextView) findViewById(R.id.EndGameText);
        Intent intent = getIntent();
        RestartButton = (Button) findViewById(R.id.RestartButton);
        RestartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intentRestart = new Intent(EndGameActivity.this, GameActivity.class);
               startActivity(intentRestart);
            }
        });
        int ControlNum = intent.getIntExtra("ControlNum",0);
        if (ControlNum==0) {
            EndGameText.setText("It's a tie game!");
        }
        else if (ControlNum%2==0) {
            EndGameText.setText("Player1 has won the game!");
        }
        else {
            EndGameText.setText("Player2 has won the game!");
        }

    }
}