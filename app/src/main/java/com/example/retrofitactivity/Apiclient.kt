package com.example.retrofitactivity

class Apiclient {

    companion object{

        val baseurl="http://kasimadalan.pe.hu/"

        fun getdaointerface():kisilerDao{


            return RetroftClient.getClient(baseurl).create(kisilerDao::class.java)

        }
    }
}