// Generated by data binding compiler. Do not edit!
package com.shoppi.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.shoppi.app.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCategoryDetailBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar toolbarCategoryDetail;

  protected FragmentCategoryDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Toolbar toolbarCategoryDetail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbarCategoryDetail = toolbarCategoryDetail;
  }

  @NonNull
  public static FragmentCategoryDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_category_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCategoryDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCategoryDetailBinding>inflateInternal(inflater, R.layout.fragment_category_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCategoryDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_category_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCategoryDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCategoryDetailBinding>inflateInternal(inflater, R.layout.fragment_category_detail, null, false, component);
  }

  public static FragmentCategoryDetailBinding bind(@NonNull View view) {
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
  public static FragmentCategoryDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCategoryDetailBinding)bind(component, view, R.layout.fragment_category_detail);
  }
}
