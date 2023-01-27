package com.shoppi.app.databinding;
import com.shoppi.app.R;
import com.shoppi.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHomeBannerBindingImpl extends ItemHomeBannerBinding implements com.shoppi.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bg_banner_product_detail, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHomeBannerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ItemHomeBannerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[10]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[4]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            );
        this.ivBannerDetailThumbnail.setTag(null);
        this.ivBannerImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvBannerBadge.setTag(null);
        this.tvBannerDetailBrandLabel.setTag(null);
        this.tvBannerDetailProductDiscountPrice.setTag(null);
        this.tvBannerDetailProductDiscountRate.setTag(null);
        this.tvBannerDetailProductLabel.setTag(null);
        this.tvBannerDetailProductPrice.setTag(null);
        this.tvBannerTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.shoppi.app.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.banner == variableId) {
            setBanner((com.shoppi.app.model.Banner) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.shoppi.app.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBanner(@Nullable com.shoppi.app.model.Banner Banner) {
        this.mBanner = Banner;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.banner);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.shoppi.app.ui.home.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.shoppi.app.model.Banner banner = mBanner;
        java.lang.String tvBannerDetailProductDiscountRateAndroidStringUnitDiscountRateBannerProductDetailDiscountRate = null;
        int bannerProductDetailPrice = 0;
        int bannerProductDetailDiscountRate = 0;
        java.lang.String bannerProductDetailThumbnailImageUrl = null;
        com.shoppi.app.model.BannerBadge bannerBadge = null;
        java.lang.String bannerBadgeLabel = null;
        java.lang.String bannerLabel = null;
        java.lang.String bannerBadgeBackgroundColor = null;
        com.shoppi.app.ui.home.HomeViewModel viewModel = mViewModel;
        java.lang.String bannerBackgroundImageUrl = null;
        java.lang.String bannerProductDetailLabel = null;
        com.shoppi.app.model.Product bannerProductDetail = null;
        java.lang.String bannerProductDetailBrandName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (banner != null) {
                    // read banner.badge
                    bannerBadge = banner.getBadge();
                    // read banner.label
                    bannerLabel = banner.getLabel();
                    // read banner.backgroundImageUrl
                    bannerBackgroundImageUrl = banner.getBackgroundImageUrl();
                    // read banner.productDetail
                    bannerProductDetail = banner.getProductDetail();
                }


                if (bannerBadge != null) {
                    // read banner.badge.label
                    bannerBadgeLabel = bannerBadge.getLabel();
                    // read banner.badge.backgroundColor
                    bannerBadgeBackgroundColor = bannerBadge.getBackgroundColor();
                }
                if (bannerProductDetail != null) {
                    // read banner.productDetail.price
                    bannerProductDetailPrice = bannerProductDetail.getPrice();
                    // read banner.productDetail.discountRate
                    bannerProductDetailDiscountRate = bannerProductDetail.getDiscountRate();
                    // read banner.productDetail.thumbnailImageUrl
                    bannerProductDetailThumbnailImageUrl = bannerProductDetail.getThumbnailImageUrl();
                    // read banner.productDetail.label
                    bannerProductDetailLabel = bannerProductDetail.getLabel();
                    // read banner.productDetail.brandName
                    bannerProductDetailBrandName = bannerProductDetail.getBrandName();
                }


                // read @android:string/unit_discount_rate
                tvBannerDetailProductDiscountRateAndroidStringUnitDiscountRateBannerProductDetailDiscountRate = tvBannerDetailProductDiscountRate.getResources().getString(R.string.unit_discount_rate, bannerProductDetailDiscountRate);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.shoppi.app.ui.common.ImageBindingAdaptersKt.loadImage(this.ivBannerDetailThumbnail, bannerProductDetailThumbnailImageUrl);
            com.shoppi.app.ui.common.ImageBindingAdaptersKt.loadImage(this.ivBannerImage, bannerBackgroundImageUrl);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tvBannerBadge, com.shoppi.app.ui.common.BindingConversionsKt.convertToColorDrawable(bannerBadgeBackgroundColor));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBannerBadge, bannerBadgeLabel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBannerDetailBrandLabel, bannerProductDetailBrandName);
            com.shoppi.app.ui.common.TextBindingAdapterKt.applyPriceDiscountRate(this.tvBannerDetailProductDiscountPrice, bannerProductDetailPrice, bannerProductDetailDiscountRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBannerDetailProductDiscountRate, tvBannerDetailProductDiscountRateAndroidStringUnitDiscountRateBannerProductDetailDiscountRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBannerDetailProductLabel, bannerProductDetailLabel);
            com.shoppi.app.ui.common.TextBindingAdapterKt.applyPriceAndStrikeStyle(this.tvBannerDetailProductPrice, bannerProductDetailPrice, true);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBannerTitle, bannerLabel);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // banner
        com.shoppi.app.model.Banner banner = mBanner;
        // banner.productDetail.productId
        java.lang.String bannerProductDetailProductId = null;
        // banner != null
        boolean bannerJavaLangObjectNull = false;
        // viewModel
        com.shoppi.app.ui.home.HomeViewModel viewModel = mViewModel;
        // banner.productDetail != null
        boolean bannerProductDetailJavaLangObjectNull = false;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;
        // banner.productDetail
        com.shoppi.app.model.Product bannerProductDetail = null;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            bannerJavaLangObjectNull = (banner) != (null);
            if (bannerJavaLangObjectNull) {


                bannerProductDetail = banner.getProductDetail();

                bannerProductDetailJavaLangObjectNull = (bannerProductDetail) != (null);
                if (bannerProductDetailJavaLangObjectNull) {


                    bannerProductDetailProductId = bannerProductDetail.getProductId();

                    viewModel.openProductDetail(bannerProductDetailProductId);
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): banner
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}