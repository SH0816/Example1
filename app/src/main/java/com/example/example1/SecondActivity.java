package com.example.example1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SecondActivity extends AppCompatActivity {

   private TextView text_name;
    private TextView text_engName;
    private TextView text_character;
    private TextView text_nation;
    private TextView easyOfDisease;
    private TextView life;
    private TextView des;
    private TextView feature;
    private TextView characterFeature;
    private TextView feedPoints;
    private TextView careKnowledge;


    int petID;
    String apiKey="FlWigMh9d46e757499a0182103101aeec4f6fc25bf3ce99";
    private  String reslut;

    public static final String URL = "https://api.apishop.net/"; //服务器地址
    List<MassageBean.ResultBean> imageURLs=new ArrayList<MassageBean.ResultBean>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        petID=intent.getIntExtra("flag",0);

        text_name =  findViewById(R.id.text_name);
        text_engName =  findViewById(R.id.text_engName);
        text_character =  findViewById(R.id.text_character);
        text_nation =  findViewById(R.id.text_nation);
        easyOfDisease =  findViewById(R.id.easyOfDisease);
        life =  findViewById(R.id.life);
        des =  findViewById(R.id.des);
        feature =  findViewById(R.id.feature);
        characterFeature =  findViewById(R.id.characterFeature);
        feedPoints =  findViewById(R.id.feedPoints);
        careKnowledge =  findViewById(R.id.careKnowledge);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)//设置baseUrl
                .addConverterFactory(GsonConverterFactory.create())//设置使用json解析
                .build();
        MassageApi messageApi=retrofit.create(MassageApi.class);//接口
        Call<MassageBean> call =messageApi.massage(apiKey,petID);//对 发送请求 进行封装
        call.enqueue(new Callback<MassageBean>() {//进行异步请求
            //请求成功时回调
            @Override
            public void onResponse(Call<MassageBean> call,retrofit2.Response<MassageBean> response) {

                reslut=  response.body().toString();
                    try {
                        text_name.setText(response.body().getResult().getName());
                        text_engName.setText(response.body().getResult().getEngName());
                        text_character.setText(response.body().getResult().getCharacter());
                        text_nation.setText(response.body().getResult().getNation());
                        easyOfDisease.setText(response.body().getResult().getEasyOfDisease());
                        life.setText(response.body().getResult().getLife());
                        des.setText(response.body().getResult().getDes());
                        feature.setText(response.body().getResult().getFeature());
                        careKnowledge.setText(response.body().getResult().getCareKnowledge());
                        characterFeature.setText(response.body().getResult().getCharacterFeature());
                        feedPoints.setText(response.body().getResult().getFeedPoints());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            //回调
            @Override
            public void onFailure(Call<MassageBean> call, Throwable t)
            {

            }
        });
    }
}


