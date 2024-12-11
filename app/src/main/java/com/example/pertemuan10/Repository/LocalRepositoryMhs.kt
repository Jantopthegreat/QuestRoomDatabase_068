package com.example.pertemuan10.Repository

import com.example.pertemuan10.Data.Dao.MahasiswaDao
import com.example.pertemuan10.Data.Entity.Mahasiswa

class LocalRepositoryMhs(private val mahasiswaDao: MahasiswaDao) : RepositoryMhs {

    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

}