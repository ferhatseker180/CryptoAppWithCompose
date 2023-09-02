package com.ferhatt.cryptoapplication.repository

import com.ferhatt.cryptoapplication.model.Crypto
import com.ferhatt.cryptoapplication.model.CryptoList
import com.ferhatt.cryptoapplication.service.CryptoAPI
import com.ferhatt.cryptoapplication.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api : CryptoAPI
) {

    suspend fun getCryptoList()  : Resource<CryptoList> {
        val response = try {
            api.getCryptoList()
        }catch (e : Exception){
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto() : Resource<Crypto> {
        val response = try {
            api.getCrypto()
        }catch (e : Exception){
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }
}