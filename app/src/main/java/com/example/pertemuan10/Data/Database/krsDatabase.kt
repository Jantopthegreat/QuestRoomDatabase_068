package com.example.pertemuan10.Data.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pertemuan10.Data.Dao.MahasiswaDao
import com.example.pertemuan10.Data.Entity.Mahasiswa


@Database(entities = [Mahasiswa::class], version =1, exportSchema = false)

abstract class krsDatabase : RoomDatabase() {

    abstract fun mahasiswaDao() : MahasiswaDao

    companion object{
        @Volatile //Memastikan bahwa nilai variable Instance selalu sama disemua
        private var Instance: krsDatabase? = null

        fun getDatabase(context: Context): krsDatabase {
            return (Instance ?: synchronized(this){
              Room.databaseBuilder(
                  context,
                  krsDatabase::class.java, //Class Database
                  "krsDatabase" //Nama Database
              )
                  .build().also { Instance = it }

            })
        }

    }
}