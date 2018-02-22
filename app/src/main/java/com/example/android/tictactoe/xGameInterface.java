package com.example.android.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class xGameInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_game_interface);
        runAlgorithm();
    }
    int[] values = new int[9];
    int[] nextMove = new int[9];

    public void onClick1(View view) {
        Button p1_button = (Button) findViewById(R.id.label1);
        p1_button.setText("X");
        p1_button.setEnabled(false);
        values[0] = 2;
        isWinOrDraw(1);
        runAlgorithm();
        isWinOrDraw(1);
    }

    public void onClick2(View view) {
        Button p1_button = (Button) findViewById(R.id.label2);
        p1_button.setText("X");
        p1_button.setEnabled(false);
        values[1] = 2;
        isWinOrDraw(1);
        runAlgorithm();
        isWinOrDraw(1);
    }

    public void onClick3(View view) {
        Button p1_button = (Button) findViewById(R.id.label3);
        p1_button.setText("X");
        p1_button.setEnabled(false);
        values[2] = 2;
        isWinOrDraw(1);
        runAlgorithm();
        isWinOrDraw(1);
    }

    public void onClick4(View view) {
        Button p1_button = (Button) findViewById(R.id.label4);
        p1_button.setText("X");
        p1_button.setEnabled(false);
        values[3] = 2;
        isWinOrDraw(1);
        runAlgorithm();
        isWinOrDraw(1);
    }

    public void onClick5(View view) {
        Button p1_button = (Button) findViewById(R.id.label5);
        p1_button.setText("X");
        p1_button.setEnabled(false);
        values[4] = 2;
        isWinOrDraw(1);
        runAlgorithm();
        isWinOrDraw(1);
    }

    public void onClick6(View view) {
        Button p1_button = (Button) findViewById(R.id.label6);
        p1_button.setText("X");
        p1_button.setEnabled(false);
        values[5] = 2;
        isWinOrDraw(1);
        runAlgorithm();
        isWinOrDraw(1);
    }

    public void onClick7(View view) {
        Button p1_button = (Button) findViewById(R.id.label7);
        p1_button.setText("X");
        p1_button.setEnabled(false);
        values[6] = 2;
        isWinOrDraw(1);
        runAlgorithm();
        isWinOrDraw(1);
    }

    public void onClick8(View view) {
        Button p1_button = (Button) findViewById(R.id.label8);
        p1_button.setText("X");
        p1_button.setEnabled(false);
        values[7] = 2;
        isWinOrDraw(1);
        runAlgorithm();
        isWinOrDraw(1);
    }

    public void onClick9(View view) {
        Button p1_button = (Button) findViewById(R.id.label9);
        p1_button.setText("X");
        p1_button.setEnabled(false);
        values[8] = 2;
        isWinOrDraw(1);
        runAlgorithm();
        isWinOrDraw(1);
    }


    public void isWinOrDraw(int status) {
        int a;
        if (values[0] != 0 && values[0] == values[3] && values[3] == values[6])
            a = values[0];
        else if (values[0] != 0 && values[0] == values[1] && values[1] == values[2])
            a = values[0];
        else if (values[0] != 0 && values[0] == values[4] && values[4] == values[8])
            a = values[0];
        else if (values[1] != 0 && values[1] == values[4] && values[4] == values[7])
            a = values[1];
        else if (values[2] != 0 && values[2] == values[5] && values[5] == values[8])
            a = values[2];
        else if (values[2] != 0 && values[2] == values[4] && values[4] == values[6])
            a = values[2];
        else if (values[3] != 0 && values[3] == values[4] && values[4] == values[5])
            a = values[3];
        else if (values[6] != 0 && values[6] == values[7] && values[7] == values[8])
            a = values[6];
        else
            a = 0;
        if (a != 0 && status == 1) {
            Context context = getApplicationContext();
            CharSequence text;
            int duration = Toast.LENGTH_LONG;
            Toast toast;
            if (a == 2)
                toast = Toast.makeText(context, "Human Won", duration);
            else
                toast = Toast.makeText(context, "Phone Won", duration);

            toast.show();

            Button p1_button = (Button) findViewById(R.id.label1);
            p1_button.setEnabled(false);
            Button p2_button = (Button) findViewById(R.id.label2);

            p2_button.setEnabled(false);

            Button p3_button = (Button) findViewById(R.id.label3);
            p3_button.setEnabled(false);

            Button p4_button = (Button) findViewById(R.id.label4);
            p4_button.setEnabled(false);

            Button p5_button = (Button) findViewById(R.id.label5);
            p5_button.setEnabled(false);

            Button p6_button = (Button) findViewById(R.id.label6);
            p6_button.setEnabled(false);

            Button p7_button = (Button) findViewById(R.id.label7);
            p7_button.setEnabled(false);

            Button p8_button = (Button) findViewById(R.id.label8);
            p8_button.setEnabled(false);

            Button p9_button = (Button) findViewById(R.id.label9);
            p9_button.setEnabled(false);
        }
    }

    public int canBeWin() {
        if (nextMove[0] != 0 && nextMove[0] == nextMove[3] && nextMove[3] == nextMove[6])
            return nextMove[0];
        else if (nextMove[0] != 0 && nextMove[0] == nextMove[1] && nextMove[1] == nextMove[2])
            return nextMove[0];
        else if (nextMove[0] != 0 && nextMove[0] == nextMove[4] && nextMove[4] == nextMove[8])
            return nextMove[0];
        else if (nextMove[1] != 0 && nextMove[1] == nextMove[4] && nextMove[4] == nextMove[7])
            return nextMove[1];
        else if (nextMove[2] != 0 && nextMove[2] == nextMove[5] && nextMove[5] == nextMove[8])
            return nextMove[2];
        else if (nextMove[2] != 0 && nextMove[2] == nextMove[4] && nextMove[4] == nextMove[6])
            return nextMove[2];
        else if (nextMove[3] != 0 && nextMove[3] == nextMove[4] && nextMove[4] == nextMove[5])
            return nextMove[3];
        else if (nextMove[6] != 0 && nextMove[6] == nextMove[7] && nextMove[7] == nextMove[8])
            return nextMove[6];
        else
            return 0;
    }

    public void setOInScreen(int a) {
        switch (a) {
            case 0:
                Button p1_button = (Button) findViewById(R.id.label1);
                p1_button.setText("O");
                p1_button.setEnabled(false);
                values[0] = 1;
                break;

            case 1:
                Button p2_button = (Button) findViewById(R.id.label2);
                p2_button.setText("O");
                p2_button.setEnabled(false);
                values[1] = 1;
                break;

            case 2:
                Button p3_button = (Button) findViewById(R.id.label3);
                p3_button.setText("O");
                p3_button.setEnabled(false);
                values[2] = 1;
                break;

            case 3:
                Button p4_button = (Button) findViewById(R.id.label4);
                p4_button.setText("O");
                p4_button.setEnabled(false);
                values[3] = 1;
                break;

            case 4:
                Button p5_button = (Button) findViewById(R.id.label5);
                p5_button.setText("O");
                p5_button.setEnabled(false);
                values[4] = 1;
                break;

            case 5:
                Button p6_button = (Button) findViewById(R.id.label6);
                p6_button.setText("O");
                p6_button.setEnabled(false);
                values[5] = 1;
                break;

            case 6:
                Button p7_button = (Button) findViewById(R.id.label7);
                p7_button.setText("O");
                p7_button.setEnabled(false);
                values[6] = 1;
                break;

            case 7:
                Button p8_button = (Button) findViewById(R.id.label8);
                p8_button.setText("O");
                p8_button.setEnabled(false);
                values[7] = 1;
                break;

            case 8:
                Button p9_button = (Button) findViewById(R.id.label9);
                p9_button.setText("O");
                p9_button.setEnabled(false);
                values[8] = 1;
                break;
            default:
                break;
        }
    }

    public void exitCode(View v) {
        // TODO Auto-generated method stub
        finish();
        System.exit(0);
    }

    public void newGameCode(View view) {
        finish();
        Intent i = new Intent(this, xGameInterface.class);
        startActivity(i);
    }

    public void runAlgorithm() {
        Random rand = new Random();
        int zeros = 0;
        for (int a = 0; a < 9; a++) {
            nextMove[a] = values[a];
            if (values[a] == 0)
                zeros++;
        }
        if (zeros == 0)
            return;
        for (int a = 0; a < 9; a++) {
            if (nextMove[a] == 0) {
                //Winning check
                nextMove[a] = 1;
                if (canBeWin() == 1) //Yes winning
                //code for setting
                { setOInScreen(a);
                    Log.v("Location", "Winning");
                    return;
                } else
                    nextMove[a] = 2;
                if (canBeWin() == 2) //Drawing{
                //code for setting
                {setOInScreen(a);
                    Log.v("Location", "Blocking");
                    return;}
                else
                    nextMove[a] = 0;
            }
        }
        while (true) {
            if (nextMove[4] == 0) {
                setOInScreen(4);
                Log.v("Location", "Center");
                return;
            }
            int rndm = rand.nextInt(9) + 0;
            if (nextMove[rndm] == 0) {
                //code for setting
                setOInScreen(rndm);
                Log.v("Location", "Random");
                return;
            }
        }
    }
}