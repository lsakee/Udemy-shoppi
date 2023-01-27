// Generated by data binding compiler. Do not edit!
package com.shoppi.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.shoppi.app.R;
import com.shoppi.app.model.Banner;
import com.shoppi.app.ui.home.HomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemHomeBannerBinding extends ViewDataBinding {
  @NonNull
  public final View bgBannerProductDetail;

  @NonNull
  public final ShapeableImageView ivBannerDetailThumbnail;

  @NonNull
  public final ShapeableImageView ivBannerImage;

  @NonNull
  public final TextView tvBannerBadge;

  @NonNull
  public final TextView tvBannerDetailBrandLabel;

  @NonNull
  public final TextView tvBannerDetailProductDiscountPrice;

  @NonNull
  public final TextView tvBannerDetailProductDiscountRate;

  @NonNull
  public final TextView tvBannerDetailProductLabel;

  @NonNull
  public final TextView tvBannerDetailProductPrice;

  @NonNull
  public final TextView tvBannerTitle;

  @Bindable
  protected HomeViewModel mViewModel;

  @Bindable
  protected Banner mBanner;

  protected ItemHomeBannerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View bgBannerProductDetail, ShapeableImageView ivBannerDetailThumbnail,
      ShapeableImageView ivBannerImage, TextView tvBannerBadge, TextView tvBannerDetailBrandLabel,
      TextView tvBannerDetailProductDiscountPrice, TextView tvBannerDetailProductDiscountRate,
      TextView tvBannerDetailProductLabel, TextView tvBannerDetailProductPrice,
      TextView tvBannerTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bgBannerProductDetail = bgBannerProductDetail;
    this.ivBannerDetailThumbnail = ivBannerDetailThumbnail;
    this.ivBannerImage = ivBannerImage;
    this.tvBannerBadge = tvBannerBadge;
    this.tvBannerDetailBrandLabel = tvBannerDetailBrandLabel;
    this.tvBannerDetailProductDiscountPrice = tvBannerDetailProductDiscountPrice;
    this.tvBannerDetailProductDiscountRate = tvBannerDetailProductDiscountRate;
    this.tvBannerDetailProductLabel = tvBannerDetailProductLabel;
    this.tvBannerDetailProductPrice = tvBannerDetailProductPrice;
    this.tvBannerTitle = tvBannerTitle;
  }

  public abstract void setViewModel(@Nullable HomeViewModel viewModel);

  @Nullable
  public HomeViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setBanner(@Nullable Banner banner);

  @Nullable
  public Banner getBanner() {
    return mBanner;
  }

  @NonNull
  public static ItemHomeBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home_banner, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemHomeBannerBinding>inflateInternal(inflater, R.layout.item_home_banner, root, attachToRoot, component);
  }

  @NonNull
  public static ItemHomeBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home_banner, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemHomeBannerBinding>inflateInternal(inflater, R.layout.item_home_banner, null, false, component);
  }

  public static ItemHomeBannerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemHomeBannerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemHomeBannerBinding)bind(component, view, R.layout.item_home_banner);
  }
}
