package com.example.pertemuan10.dependenciesinjection

import android.content.Context
import com.example.pertemuan10.Data.Database.krsDatabase
import com.example.pertemuan10.Repository.LocalRepositoryMhs
import com.example.pertemuan10.Repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(krsDatabase.getDatabase(context).mahasiswaDao())
    }

}