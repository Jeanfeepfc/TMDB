package eu.epfc.tmdb.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    val viewModel : MainViewModel = viewModel()
    viewModel.g
    LazyColumn {
        Text()
    }
}