package com.example.bankapp.Interfaces;

import com.example.bankapp.models.UserRegister;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Auth {
    @POST("api/login")
    Call<UserRegister> login(
            @Query("email") String uname,
            @Query("password") String upass
    );
    @FormUrlEncoded
    @POST("api/register")
    Call<UserRegister> Registration(
            @Field("name") String muser,
            @Field("email") String memail,
            @Field("password") String mpass
    );
}
