package com.shoppi.app.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/shoppi/app/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeRepository", "Lcom/shoppi/app/repository/home/HomeRepository;", "(Lcom/shoppi/app/repository/home/HomeRepository;)V", "_openProductEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/shoppi/app/ui/common/Event;", "", "_title", "Lcom/shoppi/app/model/Title;", "_topBanners", "", "Lcom/shoppi/app/model/Banner;", "openProductEvent", "Landroidx/lifecycle/LiveData;", "getOpenProductEvent", "()Landroidx/lifecycle/LiveData;", "title", "getTitle", "topBanner", "getTopBanner", "loadHomeData", "", "openProductDetail", "productId", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.shoppi.app.repository.home.HomeRepository homeRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.shoppi.app.model.Title> _title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.shoppi.app.model.Title> title = null;
    private final androidx.lifecycle.MutableLiveData<com.shoppi.app.ui.common.Event<java.lang.String>> _openProductEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.shoppi.app.ui.common.Event<java.lang.String>> openProductEvent = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.shoppi.app.model.Banner>> _topBanners = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.shoppi.app.model.Banner>> topBanner = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.shoppi.app.repository.home.HomeRepository homeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.shoppi.app.model.Title> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.shoppi.app.ui.common.Event<java.lang.String>> getOpenProductEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.shoppi.app.model.Banner>> getTopBanner() {
        return null;
    }
    
    public final void openProductDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
    }
    
    private final void loadHomeData() {
    }
}