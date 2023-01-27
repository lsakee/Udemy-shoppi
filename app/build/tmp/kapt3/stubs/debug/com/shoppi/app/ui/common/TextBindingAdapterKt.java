package com.shoppi.app.ui.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u000b"}, d2 = {"applyPriceAndStrikeStyle", "", "view", "Landroid/widget/TextView;", "price", "", "strikeThrough", "", "applyPriceDiscountRate", "discountRate", "applyPriceFormat", "app_debug"})
public final class TextBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"priceAmount"})
    public static final void applyPriceFormat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int price) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"priceAmount", "discountRate"})
    public static final void applyPriceDiscountRate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int price, int discountRate) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"priceAmount", "strikeThrough"})
    public static final void applyPriceAndStrikeStyle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int price, boolean strikeThrough) {
    }
}