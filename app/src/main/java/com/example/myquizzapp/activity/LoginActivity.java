package com.example.myquizzapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myquizzapp.Config;
import com.example.myquizzapp.R;
import com.example.myquizzapp.model.User;

public class LoginActivity extends AppCompatActivity {
    EditText edit_login,edit_password;
    Button btn_signin;
    TextView txt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edit_login=findViewById(R.id.edit_login_login);
        edit_password=findViewById(R.id.edit_password_login);
        btn_signin =findViewById(R.id.btn_signin_login);
        txt_register =findViewById(R.id.txt_register_login);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(edit_login.getText().toString())){
                    Toast.makeText(LoginActivity.this,"Login is empty",Toast.LENGTH_LONG).show();
                }
                else if (TextUtils.isEmpty(edit_password.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "Password is empty", Toast.LENGTH_LONG).show();
                }
               else {
                   /* String login= edit_login.getText().toString();
                    String password= edit_password.getText().toString();
         for (User user: Config.users){
             if (user.getLogin().equals(login)&& user.getPassword().equals(password)){
                 Toast.makeText(LoginActivity.this,"you are connected",Toast.LENGTH_LONG).show();
                 return;

             }
         }
                    Toast.makeText(LoginActivity.this,"You are not registered",Toast.LENGTH_LONG).show(); */

              Intent intent = new Intent(LoginActivity.this,QuizActivity.class);
              startActivity(intent);
            }

        }
        });
       txt_register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
               startActivity(intent);
           }
       });
    }
}
