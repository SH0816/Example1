package com.example.example1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private TextView textView;
    private Button change;
    private Button behead;
    private Button btn_look;
    public static final String URL = "https://api.apishop.net/"; //服务器地址
    private  String reslut;
    private String picurl_01; //比如第一个 图片
    private ImageView show_Img;
    int flag=0;
    int a=0,b=0;
    List<PictureBean.ResultBean.PetFamilyListBean> petFamilyListBeans=new ArrayList<PictureBean.ResultBean.PetFamilyListBean>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =  findViewById(R.id.textview);
        show_Img=findViewById(R.id.show_Img);
        change=findViewById(R.id.change);
        change.setOnClickListener(this);
        behead=findViewById(R.id.behead);
        behead.setOnClickListener(this);
        btn_look=findViewById(R.id.btn_look);
        btn_look.setOnClickListener(this);
    }

//    private void sendRequestWithOKHttp() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    OkHttpClient client = new OkHttpClient();
//                    Request request = new Request.Builder()
//                            .url("https://api.apishop.net/common/catFamily/queryCatList?apiKey=FlWigMh9d46e757499a0182103101aeec4f6fc25bf3ce99&page=1&pageSize=30&keyword=1")
//                            .build();
//                    Response response = client.newCall(request).execute();
//                    final String responeseData = response.body().toString();
//                    runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            textView.setText(responeseData);
//                        }
//                    });
//
//                    parseJSONWithSONObject(responeseData);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }

//    private void parseJSONWithSONObject(String jsonData) {
//        try {
//            JSONObject jsonObject = new JSONObject(jsonData);
//            String desc = jsonObject.getString("desc");
//            String status = jsonObject.getString("status");
//            pet.status = status;
//            pet.desc = desc;
//            JSONObject obj1 = jsonObject.getJSONObject("result");
//            Cat.Result result = new Cat.Result();
//            result.Totalcount = obj1.getInt("Totalcount");
//            pet.result = result;
//            List<Cat.PetFamilyList> petFamilyLists = new ArrayList<>();
//            //获取petFamilyList数组
//            JSONArray jArr = obj1.getJSONArray("petFamilyList");
//            for (int i = 0; i < jArr.length(); i++) {
//                JSONObject obj2 = jArr.getJSONObject(i);
//                Cat.PetFamilyList petFamilyList = new Cat.PetFamilyList();
//
//                petFamilyList.petID = obj2.getInt("petID");
//                Log.d(TAG, "parseJSONWithSONObject: " + petFamilyList.petID);
//                petFamilyList.name = obj2.getString("name");
//                Log.d(TAG, "parseJSONWithSONObject: " + petFamilyList.name);
//                petFamilyList.engName = obj2.getString("engName");
//                Log.d(TAG, "parseJSONWithSONObject: " + petFamilyList.engName);
//                petFamilyList.price = obj2.getString("price");
//                Log.d(TAG, "parseJSONWithSONObject: " + petFamilyList.price);
//                petFamilyLists.add(petFamilyList);
//            }
//            result.petFamilyList = petFamilyLists;
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.change:
                a=1;
                requestData();

                break;
            case R.id.behead:
                b=1;
                //Toast.makeText(MainActivity.this,"you clicked the button",Toast.LENGTH_SHORT).show();
                requestData();
                break;
            case R.id.btn_look:
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
                break;

        }



    }
    public void requestData() {
        Log.i(TAG, "requestData: " + "加载数据" );
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)//设置baseUrl
                .addConverterFactory(GsonConverterFactory.create())//设置使用json解析
                .build();
        PictureApi pictureApi=retrofit.create(PictureApi.class);//接口
        Call<PictureBean> call = pictureApi.getcall();//对 发送请求 进行封装
        call.enqueue(new Callback<PictureBean>() {//进行异步请求
            //请求成功时回调
            @Override
            public void onResponse(Call<PictureBean> call, retrofit2.Response<PictureBean> response) {

                reslut=   response.body().toString();

                if(a==1) {
                    try {
                        textView.setText( response.body().getResult().getPetFamilyList().get(flag).getName() );
                        picurl_01 = response.body().getResult().getPetFamilyList().get(flag).getCoverURL();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                final Bitmap bitmap = Glide.with(MainActivity.this).asBitmap().load(picurl_01).submit().get();
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        show_Img.setImageBitmap(bitmap);
                                    }
                                });
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }
                    }).start();
                    flag++;
                    a=0;
                }

               else if(b==1)
                {
                    flag--;
                    try {
                        textView.setText(
                                response.body().getResult().getPetFamilyList().get(flag).getName() );
                        picurl_01 = response.body().getResult().getPetFamilyList().get(flag).getCoverURL();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                final Bitmap bitmap = Glide.with(MainActivity.this).asBitmap().load(picurl_01).submit().get();
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        show_Img.setImageBitmap(bitmap);
                                    }
                                });
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }
                    }).start();
                    b=0;
                }

            }



            //回调
            @Override
            public void onFailure(Call<PictureBean> call, Throwable t) {

            }
        });

    }
}
