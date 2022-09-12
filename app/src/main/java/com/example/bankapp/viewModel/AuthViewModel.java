package com.example.bankapp.viewModel;

import android.util.Log;
import android.widget.EditText;

import androidx.lifecycle.ViewModel;

import com.example.bankapp.Interfaces.Auth;
import com.example.bankapp.Interfaces.AuthRetroInstance;
import com.example.bankapp.models.UserRegister;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AuthViewModel extends ViewModel {

    private static String TAG = AuthViewModel.class.getSimpleName();

    public void Registration(String name, String email, String password){

        Auth auth = AuthRetroInstance.getRetrofitInstance().create(Auth.class);

        Call<UserRegister> call = auth.Registration(name, email, password);
        call.enqueue(new Callback<UserRegister>() {
            @Override
            public void onResponse(Call<UserRegister> call, Response<UserRegister> response) {
                if (response.isSuccessful()){
                    Log.i(TAG, "Registration Successfull");
                }
            }

            @Override
            public void onFailure(Call<UserRegister> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}
