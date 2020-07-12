package com.example.myquizzapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.myquizzapp.Config;
import com.example.myquizzapp.R;
import com.example.myquizzapp.model.Quizz;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
    RadioGroup radio_quiz;
    Button btn_next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        radio_quiz=findViewById(R.id.radiogroup_quiz);
        btn_next=findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radio_quiz.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(QuizActivity.this, "click on a choice", Toast.LENGTH_LONG).show();
                } else {
                    int score = getIntent().getIntExtra("score",0);
                    Intent intent=new Intent(QuizActivity.this,Quiz1Activity.class);
                    if (radio_quiz.getCheckedRadioButtonId() == R.id.radio_qs1_ch2) {
                        score++;

                    }
                    intent.putExtra("score",score);
                    startActivity(intent);


                }

            }
        });
    }
}
















