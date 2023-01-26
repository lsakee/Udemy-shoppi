package com.shoppi.app.ui.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/shoppi/app/ui/category/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "categoryRepository", "Lcom/shoppi/app/repository/category/CategoryRepository;", "(Lcom/shoppi/app/repository/category/CategoryRepository;)V", "_itmes", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/shoppi/app/model/Category;", "_openCategoryEvent", "Lcom/shoppi/app/ui/common/Event;", "items", "Landroidx/lifecycle/LiveData;", "getItems", "()Landroidx/lifecycle/LiveData;", "openCategoryEvent", "getOpenCategoryEvent", "loadCategory", "", "openCategoryDetail", "category", "app_debug"})
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.shoppi.app.repository.category.CategoryRepository categoryRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.shoppi.app.model.Category>> _itmes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.shoppi.app.model.Category>> items = null;
    private final androidx.lifecycle.MutableLiveData<com.shoppi.app.ui.common.Event<com.shoppi.app.model.Category>> _openCategoryEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.shoppi.app.ui.common.Event<com.shoppi.app.model.Category>> openCategoryEvent = null;
    
    public CategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.shoppi.app.repository.category.CategoryRepository categoryRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.shoppi.app.model.Category>> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.shoppi.app.ui.common.Event<com.shoppi.app.model.Category>> getOpenCategoryEvent() {
        return null;
    }
    
    public final void openCategoryDetail(@org.jetbrains.annotations.NotNull()
    com.shoppi.app.model.Category category) {
    }
    
    private final void loadCategory() {
    }
}