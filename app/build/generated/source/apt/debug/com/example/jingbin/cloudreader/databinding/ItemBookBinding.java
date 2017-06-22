package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ItemBookBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.ImageView ivTopPhoto;
    public final android.widget.LinearLayout llItemTop;
    public final android.widget.TextView tvName;
    public final android.widget.TextView tvRate;
    // variables
    private com.example.jingbin.cloudreader.bean.book.BooksBean mBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemBookBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.ivTopPhoto = (android.widget.ImageView) bindings[1];
        this.ivTopPhoto.setTag(null);
        this.llItemTop = (android.widget.LinearLayout) bindings[0];
        this.llItemTop.setTag(null);
        this.tvName = (android.widget.TextView) bindings[2];
        this.tvName.setTag(null);
        this.tvRate = (android.widget.TextView) bindings[3];
        this.tvRate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.bean :
                setBean((com.example.jingbin.cloudreader.bean.book.BooksBean) variable);
                return true;
        }
        return false;
    }

    public void setBean(com.example.jingbin.cloudreader.bean.book.BooksBean Bean) {
        updateRegistration(2, Bean);
        this.mBean = Bean;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.bean);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.bean.book.BooksBean getBean() {
        return mBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBeanRating((com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean) object, fieldId);
            case 1 :
                return onChangeBeanImages((com.example.jingbin.cloudreader.bean.moviechild.ImagesBean) object, fieldId);
            case 2 :
                return onChangeBean((com.example.jingbin.cloudreader.bean.book.BooksBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBeanRating(com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean BeanRating, int fieldId) {
        switch (fieldId) {
            case BR.average: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeBeanImages(com.example.jingbin.cloudreader.bean.moviechild.ImagesBean BeanImages, int fieldId) {
        switch (fieldId) {
            case BR.large: {
                synchronized(this) {
                        mDirtyFlags |= 0x10L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeBean(com.example.jingbin.cloudreader.bean.book.BooksBean Bean, int fieldId) {
        switch (fieldId) {
            case BR.images: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR.title: {
                synchronized(this) {
                        mDirtyFlags |= 0x20L;
                }
                return true;
            }
            case BR.rating: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
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
        com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean beanRating = null;
        java.lang.String tvRateAndroidStringStringRatingBeanRatingAverage = null;
        java.lang.String beanTitle = null;
        java.lang.String beanImagesLarge = null;
        com.example.jingbin.cloudreader.bean.moviechild.ImagesBean beanImages = null;
        java.lang.String beanRatingAverage = null;
        com.example.jingbin.cloudreader.bean.book.BooksBean bean = mBean;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x4dL) != 0) {

                    if (bean != null) {
                        // read bean.rating
                        beanRating = bean.getRating();
                    }
                    updateRegistration(0, beanRating);


                    if (beanRating != null) {
                        // read bean.rating.average
                        beanRatingAverage = beanRating.getAverage();
                    }


                    // read (@android:string/string_rating) + (bean.rating.average)
                    tvRateAndroidStringStringRatingBeanRatingAverage = (tvRate.getResources().getString(R.string.string_rating)) + (beanRatingAverage);
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (bean != null) {
                        // read bean.title
                        beanTitle = bean.getTitle();
                    }
            }
            if ((dirtyFlags & 0x56L) != 0) {

                    if (bean != null) {
                        // read bean.images
                        beanImages = bean.getImages();
                    }
                    updateRegistration(1, beanImages);


                    if (beanImages != null) {
                        // read bean.images.large
                        beanImagesLarge = beanImages.getLarge();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x56L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showBookImg(this.ivTopPhoto, beanImagesLarge);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, beanTitle);
        }
        if ((dirtyFlags & 0x4dL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvRate, tvRateAndroidStringStringRatingBeanRatingAverage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ItemBookBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemBookBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemBookBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.item_book, root, attachToRoot, bindingComponent);
    }
    public static ItemBookBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemBookBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.item_book, null, false), bindingComponent);
    }
    public static ItemBookBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemBookBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_book_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemBookBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bean.rating
        flag 1 (0x2L): bean.images
        flag 2 (0x3L): bean
        flag 3 (0x4L): bean.rating.average
        flag 4 (0x5L): bean.images.large
        flag 5 (0x6L): bean.title
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}