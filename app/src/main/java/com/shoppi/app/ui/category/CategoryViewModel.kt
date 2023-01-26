package com.shoppi.app.ui.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shoppi.app.model.Category
import com.shoppi.app.repository.category.CategoryRepository
import com.shoppi.app.ui.common.Event
import kotlinx.coroutines.launch

class CategoryViewModel(
    private val categoryRepository: CategoryRepository
):ViewModel() {

    private val _itmes = MutableLiveData<List<Category>>()
    val items : LiveData<List<Category>> = _itmes

    private val _openCategoryEvent = MutableLiveData<Event<Category>>()
    val openCategoryEvent: LiveData<Event<Category>> = _openCategoryEvent

    init {
        loadCategory()
    }

    fun openCategoryDetail(category: Category){
        _openCategoryEvent.value = Event(category)
    }
    //ui thread 실행하면 안되게 하자
    private fun loadCategory(){
        viewModelScope.launch {
            val categories = categoryRepository.getCategories()
            _itmes.value = categories
        }
    }
}