package com.shoppi.app.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/shoppi/app/ui/home/HomeBannerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/shoppi/app/model/Banner;", "Lcom/shoppi/app/ui/home/HomeBannerAdapter$HomeBannerViewHolder;", "viewModel", "Lcom/shoppi/app/ui/home/HomeViewModel;", "(Lcom/shoppi/app/ui/home/HomeViewModel;)V", "binding", "Lcom/shoppi/app/databinding/ItemHomeBannerBinding;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HomeBannerViewHolder", "app_debug"})
public final class HomeBannerAdapter extends androidx.recyclerview.widget.ListAdapter<com.shoppi.app.model.Banner, com.shoppi.app.ui.home.HomeBannerAdapter.HomeBannerViewHolder> {
    private final com.shoppi.app.ui.home.HomeViewModel viewModel = null;
    private com.shoppi.app.databinding.ItemHomeBannerBinding binding;
    
    public HomeBannerAdapter(@org.jetbrains.annotations.NotNull()
    com.shoppi.app.ui.home.HomeViewModel viewModel) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.shoppi.app.ui.home.HomeBannerAdapter.HomeBannerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.shoppi.app.ui.home.HomeBannerAdapter.HomeBannerViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/shoppi/app/ui/home/HomeBannerAdapter$HomeBannerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/shoppi/app/databinding/ItemHomeBannerBinding;", "(Lcom/shoppi/app/ui/home/HomeBannerAdapter;Lcom/shoppi/app/databinding/ItemHomeBannerBinding;)V", "bind", "", "banner", "Lcom/shoppi/app/model/Banner;", "app_debug"})
    public final class HomeBannerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.shoppi.app.databinding.ItemHomeBannerBinding binding = null;
        
        public HomeBannerViewHolder(@org.jetbrains.annotations.NotNull()
        com.shoppi.app.databinding.ItemHomeBannerBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.shoppi.app.model.Banner banner) {
        }
    }
}