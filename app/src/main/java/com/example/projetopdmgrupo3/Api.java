package com.example.projetopdmgrupo3;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://testesandrepinto.outsystemscloud.com/BackofficePDM/rest/PDMAPI/";

    @Headers({
            "Content-type: application/json; charset=utf-8"
    })

    @POST("login")
    Call<JsonObject> login(@Body JsonObject body);

    @GET("Obra")
    Call<JsonObject> getObraById(@Query("Id") int obraId);

}
