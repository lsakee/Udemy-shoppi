package com.shoppi.app.ui.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shoppi.app.model.Category
import com.shoppi.app.repository.category.CategoryRepository
import kotlinx.coroutines.launch

class CategoryViewModel(
    private val categoryRepository: CategoryRepository
):ViewModel() {

    private val _itmes = MutableLiveData<List<Category>>()
    val items : LiveData<List<Category>> = _itmes

    init {
        loadCategory()
    }
    //ui thread 실행하면 안되게 하자
    private fun loadCategory(){
        viewModelScope.launch {
            val categories = categoryRepository.getCategories()
            _itmes.value = categories
        }
    }
}