package com.shoppi.app.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/shoppi/app/repository/HomeDataSource;", "", "getHomeData", "Lcom/shoppi/app/model/HomeData;", "app_debug"})
public abstract interface HomeDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.shoppi.app.model.HomeData getHomeData();
}