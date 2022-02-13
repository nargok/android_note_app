package com.example.memorynote.framework.di

import android.app.Application
import com.example.core.repository.NoteRepository
import com.example.memorynote.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}