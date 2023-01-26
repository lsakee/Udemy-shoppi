package com.shoppi.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.shoppi.app.databinding.FragmentCategoryBindingImpl;
import com.shoppi.app.databinding.FragmentCategoryDetailBindingImpl;
import com.shoppi.app.databinding.FragmentHomeBindingImpl;
import com.shoppi.app.databinding.ItemCategoryBindingImpl;
import com.shoppi.app.databinding.ItemCategoryPromotionBindingImpl;
import com.shoppi.app.databinding.ItemHomeBannerBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCATEGORY = 1;

  private static final int LAYOUT_FRAGMENTCATEGORYDETAIL = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_ITEMCATEGORY = 4;

  private static final int LAYOUT_ITEMCATEGORYPROMOTION = 5;

  private static final int LAYOUT_ITEMHOMEBANNER = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shoppi.app.R.layout.fragment_category, LAYOUT_FRAGMENTCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shoppi.app.R.layout.fragment_category_detail, LAYOUT_FRAGMENTCATEGORYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shoppi.app.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shoppi.app.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shoppi.app.R.layout.item_category_promotion, LAYOUT_ITEMCATEGORYPROMOTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shoppi.app.R.layout.item_home_banner, LAYOUT_ITEMHOMEBANNER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCATEGORY: {
          if ("layout/fragment_category_0".equals(tag)) {
            return new FragmentCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_category is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCATEGORYDETAIL: {
          if ("layout/fragment_category_detail_0".equals(tag)) {
            return new FragmentCategoryDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_category_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORY: {
          if ("layout/item_category_0".equals(tag)) {
            return new ItemCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORYPROMOTION: {
          if ("layout/item_category_promotion_0".equals(tag)) {
            return new ItemCategoryPromotionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category_promotion is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOMEBANNER: {
          if ("layout/item_home_banner_0".equals(tag)) {
            return new ItemHomeBannerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home_banner is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "banner");
      sKeys.put(2, "category");
      sKeys.put(3, "product");
      sKeys.put(4, "title");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/fragment_category_0", com.shoppi.app.R.layout.fragment_category);
      sKeys.put("layout/fragment_category_detail_0", com.shoppi.app.R.layout.fragment_category_detail);
      sKeys.put("layout/fragment_home_0", com.shoppi.app.R.layout.fragment_home);
      sKeys.put("layout/item_category_0", com.shoppi.app.R.layout.item_category);
      sKeys.put("layout/item_category_promotion_0", com.shoppi.app.R.layout.item_category_promotion);
      sKeys.put("layout/item_home_banner_0", com.shoppi.app.R.layout.item_home_banner);
    }
  }
}
