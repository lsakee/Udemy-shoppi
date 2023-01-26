package com.shoppi.app.databinding;
import com.shoppi.app.R;
import com.shoppi.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCategoryBindingImpl extends ItemCategoryBinding implements com.shoppi.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.ivCategoryThumbnail.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.tvCategoryBadge.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.shoppi.app.generated.callback.OnClickListener(this, 1);
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
        if (BR.category == variableId) {
            setCategory((com.shoppi.app.model.Category) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.shoppi.app.ui.category.CategoryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCategory(@Nullable com.shoppi.app.model.Category Category) {
        this.mCategory = Category;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.category);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.shoppi.app.ui.category.CategoryViewModel ViewModel) {
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
        boolean categoryUpdated = false;
        com.shoppi.app.model.Category category = mCategory;
        java.lang.String categoryThumbnailImageUrl = null;
        com.shoppi.app.ui.category.CategoryViewModel viewModel = mViewModel;
        java.lang.String categoryLabel = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (category != null) {
                    // read category.updated
                    categoryUpdated = category.getUpdated();
                    // read category.thumbnailImageUrl
                    categoryThumbnailImageUrl = category.getThumbnailImageUrl();
                    // read category.label
                    categoryLabel = category.getLabel();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.shoppi.app.ui.common.ImageBindingAdaptersKt.loadImage(this.ivCategoryThumbnail, categoryThumbnailImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, categoryLabel);
            com.shoppi.app.ui.common.ViewBindingAdaptersKt.updateVisibility(this.tvCategoryBadge, categoryUpdated);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // category
        com.shoppi.app.model.Category category = mCategory;
        // viewModel
        com.shoppi.app.ui.category.CategoryViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.openCategoryDetail(category);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): category
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}