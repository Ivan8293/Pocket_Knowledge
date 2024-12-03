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
//class FactViewModel(private val db: AppDatabase) : ViewModel() {
//
//    // Добавление факта
//    fun addFact(facts: List<Fact>) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.factDao().insert(facts)
//        }
//    }
//
//    // Обновление факта
//    fun updateFact(fact: Fact) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.factDao().update(fact)
//        }
//    }
//
//    // Удаление факта
//    fun deleteFact(fact: Fact) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.factDao().delete(fact)
//        }
//    }
//
//    // Получение всех фактов
//    fun getAllFacts(onResult: (List<Fact>) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val facts = db.factDao().getAllFacts()
//            onResult(facts)
//        }
//    }
//
//    // Получение факта по ID
//    fun getFactById(factId: Int, onResult: (Fact?) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val fact = db.factDao().getFactById(factId)
//            onResult(fact)
//        }
//    }
//
//    // Получение фактов по ID категории
//    fun getFactsByCategoryId(categoryId: Int, onResult: (List<Fact>) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val facts = db.factDao().getFactsByCategoryId(categoryId)
//            onResult(facts)
//        }
//    }
//}
//
//
