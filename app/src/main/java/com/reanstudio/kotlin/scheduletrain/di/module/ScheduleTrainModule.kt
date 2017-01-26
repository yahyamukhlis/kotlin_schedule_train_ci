package com.reanstudio.kotlin.scheduletrain.di.module

import com.reanstudio.kotlin.scheduletrain.data.repository.ScheduleTrainApi
import com.reanstudio.kotlin.scheduletrain.data.repository.remote.IbacorApi
import com.reanstudio.kotlin.scheduletrain.data.repository.remote.ScheduleTrainRestApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by yahyamukhlis on 1/25/17.
 */
@Module
class ScheduleTrainModule {

    @Provides
    @Singleton
    fun provideScheduleTicketApi(ibacorApi: IbacorApi): ScheduleTrainApi {
        return ScheduleTrainRestApi(ibacorApi)
    }

    @Provides
    @Singleton
    fun provideIbacorApi(retrofit: Retrofit): IbacorApi {
        return retrofit.create(IbacorApi::class.java)
    }
}