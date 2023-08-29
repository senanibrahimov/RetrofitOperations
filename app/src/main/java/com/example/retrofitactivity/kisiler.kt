package com.example.retrofitactivity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class kisiler(@SerializedName("kisi_id")
                   @Expose
               var kisiid:Int,
                   @SerializedName("kisi_ad")
                   @Expose
                   var kisiad:String,
                   @SerializedName("kisi_tel")
                   @Expose
                   var kisitel:String

 )
