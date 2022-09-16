package com.example.bankapp.authenticate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bankapp.MainActivity;
import com.example.bankapp.R;
import com.example.bankapp.viewModel.AuthViewModel;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mlogin,notRegistered;
    EditText ed1, ed2;
    AuthViewModel authViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mlogin = findViewById(R.id.login);
        mlogin.setOnClickListener(this);
        notRegistered = findViewById(R.id.notRegistered);
        notRegistered.setOnClickListener(this);
        ed1 = findViewById(R.id.email);
        ed2 = findViewById(R.id.password);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                Login();
                break;
            case R.id.notRegistered:
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                finish();
                break;
        }
    }

    public void Login(){
        String email = ed1.getText().toString().trim();
        String password = ed2.getText().toString().trim();

        authViewModel.Login(email,password);

        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }
}