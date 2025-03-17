package edu.uga.cs.koindemo.di

import edu.uga.cs.koindemo.data.api.UserApi
import edu.uga.cs.koindemo.data.repository.UserRepository
import edu.uga.cs.koindemo.ui.viewModel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule =
    module {
        single {
            Retrofit
                .Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UserApi::class.java)
        }

        factory { UserRepository(get()) }

        viewModel { UserViewModel(get()) }
    }