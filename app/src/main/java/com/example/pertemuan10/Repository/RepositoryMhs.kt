package com.example.pertemuan10.Repository

import com.example.pertemuan10.Data.Entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    fun getAllMahasiswa(): Flow<List<Mahasiswa>>

    fun getMahasiswa(nim: String): Flow<Mahasiswa>

    suspend fun  deleteMahasiswa (mahasiswa: Mahasiswa)

    suspend fun updateMahasiswa (mahasiswa: Mahasiswa)

}