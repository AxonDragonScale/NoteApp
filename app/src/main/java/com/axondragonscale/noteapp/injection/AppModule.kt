package com.axondragonscale.noteapp.injection

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.axondragonscale.noteapp.data.repository.NoteRepositoryImpl
import com.axondragonscale.noteapp.data.source.NoteDatabase
import com.axondragonscale.noteapp.domain.repository.NoteRepository
import com.axondragonscale.noteapp.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Ronak Harkhani on 27/11/21
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(@ApplicationContext context: Context): NoteDatabase {
        return Room.databaseBuilder(
            context,
            NoteDatabase::class.java,
            NoteDatabase.NOTE_DATABASE
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(noteDatabase: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(noteDatabase.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(noteRepository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            GetNotesUseCase(noteRepository),
            DeleteNoteUseCase(noteRepository),
            AddNoteUseCase(noteRepository),
            GetNoteUseCase(noteRepository)
        )
    }
}