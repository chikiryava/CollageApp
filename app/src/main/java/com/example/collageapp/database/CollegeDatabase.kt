package com.example.collageapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Student::class, Group::class, Teacher::class],
    version = 1,
    exportSchema = false
)
abstract class CollegeDatabase : RoomDatabase() {

    abstract fun databaseDao():DatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: CollegeDatabase? = null

        fun getDatabase(context: Context): CollegeDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CollegeDatabase::class.java,
                    "college_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
