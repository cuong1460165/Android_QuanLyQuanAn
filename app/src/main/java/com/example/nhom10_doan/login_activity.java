package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button dangkyBtn = (Button) findViewById(R.id.dangkyBtn);
        Button dangnhapBtn = (Button) findViewById(R.id.dangnhapBtn);
        final EditText id = (EditText) findViewById(R.id.idTxt);
        final EditText password = (EditText) findViewById(R.id.passwordTxt);
        dangkyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_activity.this, register_activity.class);
                startActivity(intent);
            }
        });
        dangnhapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Toast.makeText(login_activity.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login_activity.this, MainActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(login_activity.this,"Sai id hoặc password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
