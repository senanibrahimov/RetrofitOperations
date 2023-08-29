package com.example.retrofitactivity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class kisilercavab(@SerializedName("kisiler")
                        @Expose
                       var kisiler:List<kisiler>,
                        @SerializedName("success")
                        @Expose
                        var sucesss :Int

)
