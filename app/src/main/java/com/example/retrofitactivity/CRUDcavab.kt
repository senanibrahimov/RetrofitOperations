package com.example.retrofitactivity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CRUDcavab(@SerializedName("success")
                     @Expose
                     var success:Int,
                     @SerializedName("message")
                     @Expose
                     var message:String

    ) {
}