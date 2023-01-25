package com.shoppi.app.ui.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/shoppi/app/ui/category/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "categoryRepository", "Lcom/shoppi/app/repository/category/CategoryRepository;", "(Lcom/shoppi/app/repository/category/CategoryRepository;)V", "_itmes", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/shoppi/app/model/Category;", "items", "Landroidx/lifecycle/LiveData;", "getItems", "()Landroidx/lifecycle/LiveData;", "loadCategory", "", "app_debug"})
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.shoppi.app.repository.category.CategoryRepository categoryRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.shoppi.app.model.Category>> _itmes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.shoppi.app.model.Category>> items = null;
    
    public CategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.shoppi.app.repository.category.CategoryRepository categoryRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.shoppi.app.model.Category>> getItems() {
        return null;
    }
    
    private final void loadCategory() {
    }
}