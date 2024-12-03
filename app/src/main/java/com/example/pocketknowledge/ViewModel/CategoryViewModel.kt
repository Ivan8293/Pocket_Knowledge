//package com.example.pocketknowledge.ViewModel
//
//import AppDatabase
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.pocketknowledge.entities.Category
//import com.example.pocketknowledge.entities.User
//import com.example.pocketknowledge.entities.Fact
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//
//class CategoryViewModel(private val db: AppDatabase) : ViewModel() {
//
//    // Добавление списка категорий
//    fun addCategories(categories: List<Category>) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.categoryDao().insert(categories)
//        }
//    }
//
//    // Обновление категории
//    fun updateCategory(category: Category) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.categoryDao().update(category)
//        }
//    }
//
//    // Удаление категории
//    fun deleteCategory(category: Category) {
//        viewModelScope.launch(Dispatchers.IO) {
//            db.categoryDao().delete(category)
//        }
//    }
//
//    // Получение всех категорий
//    fun getAllCategories(onResult: (List<Category>) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val categories = db.categoryDao().getAllCategories()
//            onResult(categories)
//        }
//    }
//
//    // Получение категории по ID
//    fun getCategoryById(categoryId: Int, onResult: (Category?) -> Unit) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val category = db.categoryDao().getCategoryById(categoryId)
//            onResult(category)
//        }
//    }
//}
