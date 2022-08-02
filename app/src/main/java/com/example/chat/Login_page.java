package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_page extends AppCompatActivity {

    EditText phone,otp;
    Button get_otp,login,signup;
    String sent_otp = "1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        //edit text
        phone = findViewById(R.id.phone_number);
        otp = findViewById(R.id.otp);
        //button
        get_otp = findViewById(R.id.get_otp);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.sign_up);

        get_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (phone.length()!=10)
                {
                    Toast.makeText(Login_page.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Login_page.this,"Otp Sent",Toast.LENGTH_SHORT).show();

                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!otp.getText().toString().equals(sent_otp))
                {
                    Toast.makeText(Login_page.this,"Invalid Otp",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i = new Intent(Login_page.this,Home.class);
                    startActivity(i);
                    finish();
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_page.this,Signup_page.class));
                finish();
            }
        });
    }
}