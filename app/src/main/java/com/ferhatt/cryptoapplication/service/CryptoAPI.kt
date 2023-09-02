package com.ferhatt.cryptoapplication.service

import com.ferhatt.cryptoapplication.model.Crypto
import com.ferhatt.cryptoapplication.model.CryptoList
import retrofit2.http.GET

interface CryptoAPI {

    @GET("cryptolist.json")
    suspend fun getCryptoList(): CryptoList

    @GET("crypto.json")
    suspend fun getCrypto(): Crypto

}