package com.example.example1;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MassageApi {
    @GET("common/catFamily/queryCatInfo")
    Call<MassageBean> massage(@Query("apiKey") String apiKey,@Query("petID") int petID );//请求的Url
}
