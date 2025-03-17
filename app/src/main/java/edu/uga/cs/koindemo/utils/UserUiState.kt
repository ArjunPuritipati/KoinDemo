package edu.uga.cs.koindemo.utils

import edu.uga.cs.koindemo.data.model.User

sealed class UserUiState {
    object Loading : UserUiState()
    data class Scuccess(val users: List<User>) : UserUiState()
    data class Error(val message: String) : UserUiState()

}