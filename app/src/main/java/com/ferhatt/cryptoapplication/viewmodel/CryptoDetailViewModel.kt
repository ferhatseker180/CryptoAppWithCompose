package com.ferhatt.cryptoapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.ferhatt.cryptoapplication.model.Crypto
import com.ferhatt.cryptoapplication.repository.CryptoRepository
import com.ferhatt.cryptoapplication.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
) : ViewModel() {

    suspend fun getCrypto(id : String) : Resource<Crypto>{
        return repository.getCrypto(id)
    }

}