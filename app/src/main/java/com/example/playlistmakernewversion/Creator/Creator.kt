package com.example.playlistmakernewversion.Creator

import android.content.Context
import com.example.playlistmakernewversion.settings.data.SharedPreferencesThemeSettings
import com.example.playlistmakernewversion.settings.data.repository.SettingRepositoryImpl
import com.example.playlistmakernewversion.settings.domain.api.SettingInteractor
import com.example.playlistmakernewversion.settings.domain.api.SettingRepository
import com.example.playlistmakernewversion.settings.domain.impl.SettingInteractorImpl

object Creator {


    private fun getSettingRepository(context: Context): SettingRepository {
        return SettingRepositoryImpl(context, SharedPreferencesThemeSettings(context))
    }



    fun provideSettingInteractor(context: Context): SettingInteractor {
        return SettingInteractorImpl(getSettingRepository(context))
    }



}