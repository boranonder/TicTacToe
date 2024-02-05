package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView GameText;
    int ControlNum=2;
    Button GameButton1;
    Button GameButton2;
    Button GameButton3;
    Button GameButton4;
    Button GameButton5;
    Button GameButton6;
    Button GameButton7;
    Button GameButton8;
    Button GameButton9;
    int [][] GameBoard = {{0,1,2},{3,4,5},{6,7,8}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        GameText = (TextView) findViewById(R.id.GameText);
        GameButton1 = (Button) findViewById(R.id.GameButton1);
        GameButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ControlNum%2==0) {
                    GameButton1.setText("X");
                    GameBoard[0][0]=0;
                }
                else {
                    GameButton1.setText("O");
                    GameBoard[0][0]=1;
                }
                GameButtonAct();
            }
        });
        GameButton2 = (Button) findViewById(R.id.GameButton2);
        GameButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ControlNum%2==0) {
                    GameButton2.setText("X");
                    GameBoard[0][1]=0;
                }
                else {
                    GameButton2.setText("O");
                    GameBoard[0][1]=1;
                }
                GameButtonAct();
            }
        });
        GameButton3 = (Button) findViewById(R.id.GameButton3);
        GameButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ControlNum%2==0) {
                    GameButton3.setText("X");
                    GameBoard[0][2]=0;
                }
                else {
                    GameButton3.setText("O");
                    GameBoard[0][2]=1;
                }
                GameButtonAct();
            }
        });
        GameButton4 = (Button) findViewById(R.id.GameButton4);
        GameButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ControlNum%2==0) {
                    GameButton4.setText("X");
                    GameBoard[1][0]=0;
                }
                else {
                    GameButton4.setText("O");
                    GameBoard[1][0]=1;
                }
                GameButtonAct();
            }
        });
        GameButton5 = (Button) findViewById(R.id.GameButton5);
        GameButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ControlNum%2==0) {
                    GameButton5.setText("X");
                    GameBoard[1][1]=0;
                }
                else {
                    GameButton5.setText("O");
                    GameBoard[1][1]=1;
                }
                GameButtonAct();
            }
        });
        GameButton6 = (Button) findViewById(R.id.GameButton6);
        GameButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ControlNum%2==0) {
                    GameButton6.setText("X");
                    GameBoard[1][2]=0;
                }
                else {
                    GameButton6.setText("O");
                    GameBoard[1][2]=1;
                }
                GameButtonAct();
            }
        });
        GameButton7 = (Button) findViewById(R.id.GameButton7);
        GameButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ControlNum%2==0) {
                    GameButton7.setText("X");
                    GameBoard[2][0]=0;
                }
                else {
                    GameButton7.setText("O");
                    GameBoard[2][0]=1;
                }
                GameButtonAct();
            }
        });
        GameButton8 = (Button) findViewById(R.id.GameButton8);
        GameButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ControlNum%2==0) {
                    GameButton8.setText("X");
                    GameBoard[2][1]=0;
                }
                else {
                    GameButton8.setText("O");
                    GameBoard[2][1]=1;
                }
                GameButtonAct();
            }
        });
        GameButton9 = (Button) findViewById(R.id.GameButton9);
        GameButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ControlNum%2==0) {
                    GameButton9.setText("X");
                    GameBoard[2][2]=0;
                }
                else {
                    GameButton9.setText("O");
                    GameBoard[2][2]=1;
                }
                GameButtonAct();
            }
        });
    }
    public void GameButtonAct () {
        if ((GameBoard[0][0] == GameBoard[0][1] && GameBoard[0][1] == GameBoard[0][2]) ||
                (GameBoard[1][0] == GameBoard[1][1] && GameBoard[1][1] == GameBoard[1][2]) ||
                (GameBoard[2][0] == GameBoard[2][1] && GameBoard[2][1] == GameBoard[2][2]) ||
                (GameBoard[0][0] == GameBoard[1][0] && GameBoard[1][0] == GameBoard[2][0]) ||
                (GameBoard[0][1] == GameBoard[1][1] && GameBoard[1][1] == GameBoard[2][1]) ||
                (GameBoard[0][2] == GameBoard[1][2] && GameBoard[1][2] == GameBoard[2][2]) ||
                (GameBoard[0][0] == GameBoard[1][1] && GameBoard[1][1] == GameBoard[2][2]) ||
                (GameBoard[0][2] == GameBoard[1][1] && GameBoard[1][1] == GameBoard[2][0])) {
                GameText.setText("Game Over!");
                Intent intent = new Intent(GameActivity.this,EndGameActivity.class);
                intent.putExtra("ControlNum",ControlNum);
                startActivity(intent);
        }
        else if (ControlNum==10) {
            GameText.setText("Game Over!");
            ControlNum=0; // to check it's a tie game
            Intent intent = new Intent(GameActivity.this,EndGameActivity.class);
            intent.putExtra("ControlNum",ControlNum);
            startActivity(intent);
        }
        else {
            if (ControlNum % 2 == 0) {
                GameText.setText("Player2's turn!");
            } else {
                GameText.setText("Player1' turn!");
            }
            ControlNum += 1;
        }
    }
}