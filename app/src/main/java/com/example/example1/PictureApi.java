package com.example.example1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PictureApi {//get方法请求
    @GET("common/catFamily/queryCatList?apiKey=FlWigMh9d46e757499a0182103101aeec4f6fc25bf3ce99&page=1&pageSize=30&keyword=1&tdsourcetag=s_pcqq_aiomsg")
    Call<PictureBean> getcall();//请求的Url
}
