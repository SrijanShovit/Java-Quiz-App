package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  String[] questions= {"Java was introduced in 1823?" ,"Java was created in python?" ,
    "Java has abstract classes?" , "Java supports interface?"};
    private  boolean[] answers = {false,false,true,true};
    private int score = 0;
    Button yes;
    Button no;
    int index=0;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question  = findViewById(R.id.question);
        question.setText(questions[index]);      //to display 1st question instead of default one in xml

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If array not going out of bounds
                if (index <= questions.length - 1) {

                    if (answers[index] == true) {         //if my ans is same as given ans(true) then score else negative
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If array not going out of bounds
                if (index <= questions.length - 1) {

                    if (answers[index] == false) {         //if my ans is same as given ans(false) then score else negative
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}