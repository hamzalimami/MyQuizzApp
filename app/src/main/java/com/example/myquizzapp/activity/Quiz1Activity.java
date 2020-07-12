package com.example.myquizzapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.myquizzapp.R;

public class Quiz1Activity extends AppCompatActivity {
    RadioGroup radio_quiz1;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        radio_quiz1=findViewById(R.id.radiogroup_quiz1);
        btn_next=findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radio_quiz1.getCheckedRadioButtonId()==-1){
                    Toast.makeText(Quiz1Activity.this,"click on a choice",Toast.LENGTH_LONG).show();


            }else{
                    int score=getIntent().getIntExtra("score",0);

                    Intent intent = new Intent(Quiz1Activity.this,Quiz2Activity.class);
                    if (radio_quiz1.getCheckedRadioButtonId()==R.id.radio_qs2_ch1){
                        score ++;
                    }
                    intent.putExtra("score",score);
                    startActivity(intent);
                }

            }
        });
    }
}
