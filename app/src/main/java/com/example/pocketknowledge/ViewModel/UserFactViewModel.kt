//package com.example.pocketknowledge.ViewModel
//
//import AppDatabase
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.pocketknowledge.entities.User
//import com.example.pocketknowledge.entities.Fact
//import com.example.pocketknowledge.entities.UserFact
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//
//class UserFactViewModel(private val db: AppDatabase) : ViewModel() {
//
//    // Добавление списка пользовательских фактов
//    fun addUserFacts(userFactList: List<UserFact>) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.userFactDao().insert(userFactList)
//        }
//    }
//
//    // Обновление пользовательского факта
//    fun updateUserFact(userFact: UserFact) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.userFactDao().update(userFact)
//        }
//    }
//
//    // Удаление пользовательского факта
//    fun deleteUserFact(userFact: UserFact) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.userFactDao().delete(userFact)
//        }
//    }
//
//    // Получение всех пользовательских фактов
//    fun getAllUserFacts(onResult: (List<UserFact>) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val userFacts = db.userFactDao().getAllUserFacts()
//            onResult(userFacts)
//        }
//    }
//
//    // Получение пользовательского факта по ID
//    fun getUserFactById(userFactId: Int, onResult: (UserFact?) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val userFact = db.userFactDao().getUserFactById(userFactId)
//            onResult(userFact)
//        }
//    }
//
//    // Получение пользовательских фактов по ID пользователя
//    fun getUserFactsByUserId(userId: Int, onResult: (List<UserFact>) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val userFacts = db.userFactDao().getUserFactsByUserId(userId)
//            onResult(userFacts)
//        }
//    }
//
//    // Получение пользовательских фактов по ID факта
//    fun getUserFactsByFactId(factId: Int, onResult: (List<UserFact>) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val userFacts = db.userFactDao().getUserFactsByFactId(factId)
//            onResult(userFacts)
//        }
//    }
//}
