package com.example.myquizzapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.myquizzapp.R;

public class Quiz3Activity extends AppCompatActivity {
    RadioGroup radio_quiZ3;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        radio_quiZ3=findViewById(R.id.radiogroup_quiz3);
        btn_next=findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radio_quiZ3.getCheckedRadioButtonId()==-1){
                    Toast.makeText(Quiz3Activity.this,"click on a choice",Toast.LENGTH_LONG).show();
                }else {
                    int score =getIntent().getIntExtra("score",0);
                    if (radio_quiZ3.getCheckedRadioButtonId()==R.id.radio_qs4_ch2){
                        score ++;
                    }
                    Toast.makeText(Quiz3Activity.this,"score is"+score,Toast.LENGTH_LONG).show();
                }



            }
        });


    }
}
