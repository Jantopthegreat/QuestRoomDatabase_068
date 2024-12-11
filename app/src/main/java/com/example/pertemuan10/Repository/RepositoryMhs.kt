package com.example.pertemuan10.Repository

import com.example.pertemuan10.Data.Entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}