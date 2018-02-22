package com.example.android.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class twoPlayerInterface extends AppCompatActivity {
    int move=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player_interface);
    }

    int[] values = new int[9];

    public void onClick1(View view) {
        if(move%2==0) {
            setOInScreen(0);
            isWinOrDraw(1);
        }
        else {
            setXInScreen(0);
            isWinOrDraw(1);
        }
        move++;
    }

    public void onClick2(View view) {
        if(move%2==0) {
            setOInScreen(1);
            isWinOrDraw(1);
        }
        else {
            setXInScreen(1);
            isWinOrDraw(1);
        }
        move++;
    }

    public void onClick3(View view) {
        if(move%2==0) {
            setOInScreen(2);
            isWinOrDraw(1);
        }
        else {
            setXInScreen(2);
            isWinOrDraw(1);
        }
        move++;
    }

    public void onClick4(View view) {
        if(move%2==0) {
            setOInScreen(3);
            isWinOrDraw(1);
        }
        else {
            setXInScreen(3);
            isWinOrDraw(1);
        }
        move++;
    }

    public void onClick5(View view) {
        if(move%2==0) {
            setOInScreen(4);
            isWinOrDraw(1);
        }
        else {
            setXInScreen(4);
            isWinOrDraw(1);
        }
        move++;
    }

    public void onClick6(View view) {
        if(move%2==0) {
            setOInScreen(5);
            isWinOrDraw(1);
        }
        else {
            setXInScreen(5);
            isWinOrDraw(1);
        }
        move++;
    }

    public void onClick7(View view) {
        if(move%2==0) {
            setOInScreen(6);
            isWinOrDraw(1);
        }
        else {
            setXInScreen(6);
            isWinOrDraw(1);
        }
        move++;
    }

    public void onClick8(View view) {
        if(move%2==0) {
            setOInScreen(7);
            isWinOrDraw(1);
        }
        else {
            setXInScreen(7);
            isWinOrDraw(1);
        }
        move++;
    }

    public void onClick9(View view) {
        if(move%2==0) {
            setOInScreen(8);
            isWinOrDraw(1);
        }
        else {
            setXInScreen(8);
            isWinOrDraw(1);
        }
        move++;
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
                toast = Toast.makeText(context, "O Won", duration);
            else
                toast = Toast.makeText(context, "X Won", duration);

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

    public void setXInScreen(int a) {
        switch (a) {
            case 0:
                Button p1_button = (Button) findViewById(R.id.label1);
                p1_button.setText("X");
                p1_button.setEnabled(false);
                values[0] = 1;
                break;

            case 1:
                Button p2_button = (Button) findViewById(R.id.label2);
                p2_button.setText("X");
                p2_button.setEnabled(false);
                values[1] = 1;
                break;

            case 2:
                Button p3_button = (Button) findViewById(R.id.label3);
                p3_button.setText("X");
                p3_button.setEnabled(false);
                values[2] = 1;
                break;

            case 3:
                Button p4_button = (Button) findViewById(R.id.label4);
                p4_button.setText("X");
                p4_button.setEnabled(false);
                values[3] = 1;
                break;

            case 4:
                Button p5_button = (Button) findViewById(R.id.label5);
                p5_button.setText("X");
                p5_button.setEnabled(false);
                values[4] = 1;
                break;

            case 5:
                Button p6_button = (Button) findViewById(R.id.label6);
                p6_button.setText("X");
                p6_button.setEnabled(false);
                values[5] = 1;
                break;

            case 6:
                Button p7_button = (Button) findViewById(R.id.label7);
                p7_button.setText("X");
                p7_button.setEnabled(false);
                values[6] = 1;
                break;

            case 7:
                Button p8_button = (Button) findViewById(R.id.label8);
                p8_button.setText("X");
                p8_button.setEnabled(false);
                values[7] = 1;
                break;

            case 8:
                Button p9_button = (Button) findViewById(R.id.label9);
                p9_button.setText("X");
                p9_button.setEnabled(false);
                values[8] = 1;
                break;
            default:
                break;
        }
    }



    public void setOInScreen(int a) {
        switch (a) {
            case 0:
                Button p1_button = (Button) findViewById(R.id.label1);
                p1_button.setText("O");
                p1_button.setEnabled(false);
                values[0] = 2;
                break;

            case 1:
                Button p2_button = (Button) findViewById(R.id.label2);
                p2_button.setText("O");
                p2_button.setEnabled(false);
                values[1] = 2;
                break;

            case 2:
                Button p3_button = (Button) findViewById(R.id.label3);
                p3_button.setText("O");
                p3_button.setEnabled(false);
                values[2] = 2;
                break;

            case 3:
                Button p4_button = (Button) findViewById(R.id.label4);
                p4_button.setText("O");
                p4_button.setEnabled(false);
                values[3] = 2;
                break;

            case 4:
                Button p5_button = (Button) findViewById(R.id.label5);
                p5_button.setText("O");
                p5_button.setEnabled(false);
                values[4] = 2;
                break;

            case 5:
                Button p6_button = (Button) findViewById(R.id.label6);
                p6_button.setText("O");
                p6_button.setEnabled(false);
                values[5] = 2;
                break;

            case 6:
                Button p7_button = (Button) findViewById(R.id.label7);
                p7_button.setText("O");
                p7_button.setEnabled(false);
                values[6] = 2;
                break;

            case 7:
                Button p8_button = (Button) findViewById(R.id.label8);
                p8_button.setText("O");
                p8_button.setEnabled(false);
                values[7] = 2;
                break;

            case 8:
                Button p9_button = (Button) findViewById(R.id.label9);
                p9_button.setText("O");
                p9_button.setEnabled(false);
                values[8] = 2;
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
        Intent i = new Intent(this, twoPlayerInterface.class);
        startActivity(i);
    }
}

