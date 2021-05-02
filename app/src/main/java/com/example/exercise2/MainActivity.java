package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edEmail, edPassword;
    String nama, password;
    TextView daftar;
    String correct_edemail = "admin@mail.com";
    String correct_edpassword = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);
        edEmail=findViewById(R.id.edEmail);
        edPassword=findViewById(R.id.edPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edEmail.getText().toString();

                password = edPassword.getText().toString();

                String email = "admin@gmail.com";

                String pass = "12345";

                if(TextUtils.isEmpty(edEmail.getText().toString()) || TextUtils.isEmpty(edPassword.getText().toString())){
                    Toast.makeText(MainActivity.this,"Email dan Password Salah",Toast.LENGTH_LONG).show();
                }else if(edEmail.getText().toString().equals(correct_edemail)){
                    if(edPassword.getText().toString().equals(correct_edpassword)){
                        Toast.makeText(MainActivity.this,"Login Sukses",Toast.LENGTH_LONG).show();

                    }else{
                        Toast.makeText(MainActivity.this,"Password Salah",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Email Salah",Toast.LENGTH_LONG).show();
                }

                if (nama.equals(email) && password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email anda: " + nama + " dan Password anda: " + password + "", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", nama.trim());

                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), Data.class);
                    i.putExtras(b);

                    startActivity(i);
                } else {Toast t = Toast.makeText(getApplicationContext(),
                        "Login Gagal", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });

        this.daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), pendaftaran.class));
            }
        });
    }
}