package com.example.memorynote.framework.di

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(val app: ApplicationModule) {
    @Provides
    fun provideApp() = app
}