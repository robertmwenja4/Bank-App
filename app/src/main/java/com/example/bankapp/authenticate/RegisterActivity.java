package com.example.bankapp.authenticate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bankapp.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mname, memail, mpassword, mconPassword;
    TextView mRegister, mAlready;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mname = findViewById(R.id.name);
        memail = findViewById(R.id.email);
        mpassword = findViewById(R.id.password);
        mconPassword = findViewById(R.id.password_confirmation);
        mRegister = findViewById(R.id.register);
        mRegister.setOnClickListener(this);
        mAlready = findViewById(R.id.alreadyregister);
        mAlready.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.alreadyregister:
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
                break;
            case R.id.register:
                Registration();
                break;
        }
    }

    private void Registration() {
        String name = mname.getText().toString().trim();
        
    }
}