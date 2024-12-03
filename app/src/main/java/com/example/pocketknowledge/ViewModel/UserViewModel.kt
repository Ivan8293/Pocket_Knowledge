//package com.example.pocketknowledge.ViewModel
//
//import AppDatabase
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.pocketknowledge.entities.User
//import com.example.pocketknowledge.entities.Fact
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//
//class UserViewModel(private val db: AppDatabase) : ViewModel() {
//
//    // Добавление списка пользователей
//    fun addUsers(userList: List<User>) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.userDao().insert(userList)
//        }
//    }
//
//    // Обновление пользователя
//    fun updateUser(user: User) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.userDao().update(user)
//        }
//    }
//
//    // Удаление пользователя
//    fun deleteUser(user: User) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.userDao().delete(user)
//        }
//    }
//
//    // Получение всех пользователей
//    fun getAllUsers(onResult: (List<User>) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val users = db.userDao().getAllUsers()
//            onResult(users)
//        }
//    }
//
//    // Получение пользователя по ID
//    fun getUserById(userId: Int, onResult: (User?) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val user = db.userDao().getUserById(userId)
//            onResult(user)
//        }
//    }
//
//    // Получение пользователя по имени пользователя
//    fun getUserByUsername(username: String, onResult: (User?) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val user = db.userDao().getUserByUsername(username)
//            onResult(user)
//        }
//    }
//}
