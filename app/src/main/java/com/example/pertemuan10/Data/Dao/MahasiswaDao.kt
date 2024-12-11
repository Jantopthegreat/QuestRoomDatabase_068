package com.example.pertemuan10.Data.Dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.pertemuan10.Data.Entity.Mahasiswa


@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )
}