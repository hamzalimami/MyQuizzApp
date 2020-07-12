package com.example.myquizzapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myquizzapp.Config;
import com.example.myquizzapp.R;
import com.example.myquizzapp.model.User;

public class RegisterActivity extends AppCompatActivity {
EditText edit_name,edit_email,edit_login,edit_password;
Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edit_name =findViewById(R.id.edit_name_register);
        edit_email =findViewById(R.id.edit_email_register);
        edit_login =findViewById(R.id.edit_login_register);
        edit_password =findViewById(R.id.edit_password_register);
        btn_register =findViewById(R.id.btn_register_register);


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(edit_name.getText().toString())
                        ||TextUtils.isEmpty(edit_email.getText().toString())
                        ||TextUtils.isEmpty(edit_login.getText().toString())
                        ||TextUtils.isEmpty(edit_password.getText().toString()))
                {
                    Toast.makeText(RegisterActivity.this, "please complete all fields", Toast.LENGTH_LONG).show();
                 }
                else {
                    String name = edit_name.getText().toString();
                    String email = edit_email.getText().toString();
                    String login = edit_login.getText().toString();
                    String password = edit_password.getText().toString();

                    for (User user : Config.users) {
                        if (user.getLogin().equals(login)) {
                            Toast.makeText(RegisterActivity.this, "Already have an account", Toast.LENGTH_LONG).show();
                            return;
                        }
                    }

                        User user = new User(name, email, login, password);
                        Config.users.add(user);
                        Toast.makeText(RegisterActivity.this, "account successfully created", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }



            }
        });



    }
}
