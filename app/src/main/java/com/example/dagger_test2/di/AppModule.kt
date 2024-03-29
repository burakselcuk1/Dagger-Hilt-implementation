package com.example.dagger_test2.di

import com.example.dagger_test2.network.RetroServiceInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    val baseURL ="https://api.github.com/search/"

    @Singleton
    @Provides
    fun getRetrofitServiceInstance(retrofit: Retrofit): RetroServiceInstance{
        return retrofit.create(RetroServiceInstance::class.java)
    }


    @Singleton
    @Provides
    fun getRetrofitInstance(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}