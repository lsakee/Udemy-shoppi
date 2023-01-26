package com.shoppi.app.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/shoppi/app/network/ApiClient;", "", "getCategories", "", "Lcom/shoppi/app/model/Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategoyDatail", "Lcom/shoppi/app/model/CategoryDetail;", "Companion", "app_debug"})
public abstract interface ApiClient {
    @org.jetbrains.annotations.NotNull()
    public static final com.shoppi.app.network.ApiClient.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "categories.json")
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.shoppi.app.model.Category>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "fashion_female.json")
    public abstract java.lang.Object getCategoyDatail(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shoppi.app.model.CategoryDetail> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/shoppi/app/network/ApiClient$Companion;", "", "()V", "baseUrl", "", "create", "Lcom/shoppi/app/network/ApiClient;", "app_debug"})
    public static final class Companion {
        private static final java.lang.String baseUrl = "https://shoppi-e8c97-default-rtdb.asia-southeast1.firebasedatabase.app/";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shoppi.app.network.ApiClient create() {
            return null;
        }
    }
}