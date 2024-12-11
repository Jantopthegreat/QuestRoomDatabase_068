package com.example.pertemuan10.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan10.ui.view.mahasiswa.DestinasiInsert
import com.example.pertemuan10.ui.view.mahasiswa.insertMhsView


@Composable
fun PengelolaHalaman(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiInsert.route
    ) {
        composable(route = DestinasiInsert.route)
        {
            insertMhsView(
                onBack = {}, onNavigate = {}
            )
        }
    }
}