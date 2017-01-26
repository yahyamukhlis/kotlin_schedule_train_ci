package com.reanstudio.kotlin.scheduletrain.di.module

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

/**
 * Created by yahyamukhlis on 1/25/17.
 */
@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("http://ibacor.com/api/")
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
    }
}
