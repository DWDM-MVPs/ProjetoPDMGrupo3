package com.example.projetopdmgrupo3;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {

    String BASE_URL = "https://testesandrepinto.outsystemscloud.com/BackofficePDM/rest/PDMAPI/";

    @Headers({
            "Content-type: application/json; charset=utf-8"
    })

    @POST("login")
    Call<JsonObject> login(@Body JsonObject body);

}
