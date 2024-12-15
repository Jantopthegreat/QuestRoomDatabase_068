package com.example.pertemuan10.Repository

import com.example.pertemuan10.Data.Dao.MahasiswaDao
import com.example.pertemuan10.Data.Entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs(private val mahasiswaDao: MahasiswaDao) : RepositoryMhs {

    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    override fun getAllMahasiswa(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }

    override fun getMahasiswa(nim: String): Flow<Mahasiswa> {
        return mahasiswaDao.getMahasiswa(nim)
    }



}