package com.example.nhom10_doan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register_activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText mk = (EditText) findViewById(R.id.mk);
        final EditText nmk = (EditText) findViewById(R.id.nmk);
        Button dangkyBtn = (Button) findViewById(R.id.dkbtn);
        dangkyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().equals(""))
                {
                    Toast.makeText(register_activity.this,"Vui lòng nhập tên đăng ký",Toast.LENGTH_SHORT).show();
                }
                else
                if (mk.getText().toString().equals(""))
                {
                    Toast.makeText(register_activity.this,"Vui lòng nhập mật khẩu",Toast.LENGTH_SHORT).show();
                }
                else
                if (nmk.getText().toString().equals(""))
                {
                    Toast.makeText(register_activity.this,"Vui lòng nhập mật khẩu xác nhận",Toast.LENGTH_SHORT).show();
                }
                if (!mk.getText().toString().equals("")&& !nmk.getText().toString().equals("")&& !name.getText().toString().equals(""))
                {
                    if (!mk.getText().toString().equals(nmk.getText().toString()))
                    {
                        Toast.makeText(register_activity.this,"Vui lòng nhập mật khẩu và mật khẩu xác nhận giống nhau",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(register_activity.this,"Đăng ký thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(register_activity.this, login_activity.class);
                        startActivity(intent);
                    }
                }
                Button refesh = (Button) findViewById(R.id.refesh);
                refesh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        name.setText("");
                        mk.setText("");
                        nmk.setText("");
                    }
                });
            }
        });
    }
}
