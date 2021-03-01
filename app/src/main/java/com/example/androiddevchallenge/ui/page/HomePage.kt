package com.example.androiddevchallenge.ui.page

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.data.PuppyDataProvider
import com.example.androiddevchallenge.ui.PuppyItem
import com.example.androiddevchallenge.vm.PuppyViewModel

@Composable
fun HomePage(puppy: PuppyViewModel) = PuppyList(puppy)

@Composable
private fun PuppyList(viewModel: PuppyViewModel) {
    val list = PuppyDataProvider.puppyList

    LazyColumn {
        items(list.size) { index ->
            val puppy = list[index]
            PuppyItem(puppy = list[index]) {
                viewModel.navigateToDetail(puppy)
            }
        }
    }

}
