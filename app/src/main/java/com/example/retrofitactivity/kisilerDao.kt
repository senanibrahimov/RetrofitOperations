package com.example.retrofitactivity

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface kisilerDao {


    @POST("kisiler/delete_kisiler.php")
    @FormUrlEncoded
     fun datasil(@Field("kisi_id") kisiid:Int):Call<CRUDcavab>


     @POST("kisiler/insert_kisiler.php")
     @FormUrlEncoded
     fun insertdata(@Field("kisi_ad") kisi_ad:String,@Field("kisi_tel") kisi_tel:String):Call<CRUDcavab>



     @POST("kisiler/update_kisiler.php")
     @FormUrlEncoded
     fun updatedata(@Field("kisi_id") kisi_id:Int,@Field("kisi_ad") kisi_ad:String,@Field("kisi_tel") kisi_tel:String) :Call<CRUDcavab>

     @GET("kisiler/tum_kisiler.php")
     fun alldata():Call<kisilercavab>


     @POST("kisiler/tum_kisiler_arama.php")
     @FormUrlEncoded
     fun search(@Field("kisi_ad") kisi_ad: String):Call<kisilercavab>

}