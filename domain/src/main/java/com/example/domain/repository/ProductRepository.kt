package com.example.domain.repository

import com.example.domain.entity.Product
import io.reactivex.Single

interface ProductRepository {

    fun getProducts(): Single<List<Product>>

}