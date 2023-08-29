package com.example.retrofitactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         //insertdata()
        //updatedate()
        //alldata()
        search()
    }


    fun kisisil(){

        val kdi=Apiclient.getdaointerface()
        kdi.datasil(15281).enqueue(object :Callback<CRUDcavab>{
            override fun onResponse(call: Call<CRUDcavab>?, response: Response<CRUDcavab>?) {

                if (response!=null){
                    Log.e("basari","${response.body().success.toString()}")
                    Log.e("basari","${response.body().message}")

                }
            }

            override fun onFailure(call: Call<CRUDcavab>?, t: Throwable?) {
                TODO("Not yet implemented")
            }


        })
    }


    fun insertdata(){

        val kdi=Apiclient.getdaointerface()

        kdi.insertdata("ribery","454444").enqueue(object :Callback<CRUDcavab>{
            override fun onResponse(call: Call<CRUDcavab>?, response: Response<CRUDcavab>?) {
                if (response!=null){
                    Log.e("sucess","${response.body().success.toString()}")
                    Log.e("message","${response.body().message}")

                }
            }

            override fun onFailure(call: Call<CRUDcavab>?, t: Throwable?) {

                Toast.makeText(this@MainActivity,t?.message,Toast.LENGTH_SHORT)
            }

        })
    }


    fun updatedate(){

        val kdi=Apiclient.getdaointerface()

        kdi.updatedata(15285,"beşiktaş","1903").enqueue(object :Callback<CRUDcavab>{
            override fun onResponse(call: Call<CRUDcavab>?, response: Response<CRUDcavab>?) {
                Log.e("sucess","${response?.body()?.success.toString()}")
                Log.e("message","${response?.body()?.message}")            }

            override fun onFailure(call: Call<CRUDcavab>?, t: Throwable?) {
            }


        })
    }


    fun alldata(){

        val kdi=Apiclient.getdaointerface()
          kdi.alldata().enqueue(object :Callback<kisilercavab>{
              override fun onResponse(call: Call<kisilercavab>?, response: Response<kisilercavab>?) {
                 if (response!=null){

                     val kisilercavab=response.body()
                     var list=kisilercavab.kisiler

                      for(i in list){

                          Log.e("kisi_id","${i.kisiid.toString()}")
                          Log.e("kisi_ad","${i.kisiad}")
                          Log.e("kisitel","${i.kisitel}")

                      }
                     Log.e("message","${kisilercavab.sucesss.toString()}")

                 }
              }

              override fun onFailure(call: Call<kisilercavab>?, t: Throwable?) {

              }

          })
    }

    fun search(){

        val kdi=Apiclient.getdaointerface()

        kdi.search("beşiktaş").enqueue(object :Callback<kisilercavab>{
            override fun onResponse(call: Call<kisilercavab>?, response: Response<kisilercavab>?) {

                if (response!=null){

                    val list=response.body().kisiler

                    for (i in list){
                        Log.e("kisi_id","${i.kisiid.toString()}")
                        Log.e("kisi_ad","${i.kisiad}")
                        Log.e("kisitel","${i.kisitel}")

                    }
                }


            }

            override fun onFailure(call: Call<kisilercavab>?, t: Throwable?) {
                TODO("Not yet implemented")
            }
        })


    }
}