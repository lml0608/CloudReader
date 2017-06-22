package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class HeaderSlideShapeBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_one_item, 8);
        sViewsWithIds.put(R.id.tv_one_day, 9);
        sViewsWithIds.put(R.id.tv_one_city, 10);
    }
    // views
    public final android.widget.ImageView imgItemBg;
    public final android.widget.ImageView ivOnePhoto;
    public final android.widget.LinearLayout llOneItem;
    private final android.widget.RelativeLayout mboundView0;
    public final android.widget.TextView tvOneCasts;
    public final android.widget.TextView tvOneCity;
    public final android.widget.TextView tvOneDay;
    public final android.widget.TextView tvOneDirectors;
    public final android.widget.TextView tvOneGenres;
    public final android.widget.TextView tvOneRatingNumber;
    public final android.widget.TextView tvOneRatingRate;
    // variables
    private com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean mSubjectsBean;
    private com.example.jingbin.cloudreader.bean.MovieDetailBean mMovieDetailBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HeaderSlideShapeBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds);
        this.imgItemBg = (android.widget.ImageView) bindings[1];
        this.imgItemBg.setTag(null);
        this.ivOnePhoto = (android.widget.ImageView) bindings[2];
        this.ivOnePhoto.setTag(null);
        this.llOneItem = (android.widget.LinearLayout) bindings[8];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvOneCasts = (android.widget.TextView) bindings[6];
        this.tvOneCasts.setTag(null);
        this.tvOneCity = (android.widget.TextView) bindings[10];
        this.tvOneDay = (android.widget.TextView) bindings[9];
        this.tvOneDirectors = (android.widget.TextView) bindings[5];
        this.tvOneDirectors.setTag(null);
        this.tvOneGenres = (android.widget.TextView) bindings[7];
        this.tvOneGenres.setTag(null);
        this.tvOneRatingNumber = (android.widget.TextView) bindings[4];
        this.tvOneRatingNumber.setTag(null);
        this.tvOneRatingRate = (android.widget.TextView) bindings[3];
        this.tvOneRatingRate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            case BR.subjectsBean :
                setSubjectsBean((com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean) variable);
                return true;
            case BR.movieDetailBean :
                setMovieDetailBean((com.example.jingbin.cloudreader.bean.MovieDetailBean) variable);
                return true;
        }
        return false;
    }

    public void setSubjectsBean(com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean SubjectsBean) {
        updateRegistration(0, SubjectsBean);
        this.mSubjectsBean = SubjectsBean;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.subjectsBean);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean getSubjectsBean() {
        return mSubjectsBean;
    }
    public void setMovieDetailBean(com.example.jingbin.cloudreader.bean.MovieDetailBean MovieDetailBean) {
        this.mMovieDetailBean = MovieDetailBean;
    }
    public com.example.jingbin.cloudreader.bean.MovieDetailBean getMovieDetailBean() {
        return mMovieDetailBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSubjectsBean((com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean) object, fieldId);
            case 1 :
                return onChangeSubjectsBeanRating((com.example.jingbin.cloudreader.bean.moviechild.RatingBean) object, fieldId);
            case 2 :
                return onChangeMovieDetailBean((com.example.jingbin.cloudreader.bean.MovieDetailBean) object, fieldId);
            case 3 :
                return onChangeSubjectsBeanImages((com.example.jingbin.cloudreader.bean.moviechild.ImagesBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSubjectsBean(com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean SubjectsBean, int fieldId) {
        switch (fieldId) {
            case BR.images: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR.rating: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR.collect_count: {
                synchronized(this) {
                        mDirtyFlags |= 0x10L;
                }
                return true;
            }
            case BR.directors: {
                synchronized(this) {
                        mDirtyFlags |= 0x20L;
                }
                return true;
            }
            case BR.casts: {
                synchronized(this) {
                        mDirtyFlags |= 0x40L;
                }
                return true;
            }
            case BR.genres: {
                synchronized(this) {
                        mDirtyFlags |= 0x80L;
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
    private boolean onChangeSubjectsBeanRating(com.example.jingbin.cloudreader.bean.moviechild.RatingBean SubjectsBeanRating, int fieldId) {
        switch (fieldId) {
            case BR.average: {
                synchronized(this) {
                        mDirtyFlags |= 0x100L;
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
    private boolean onChangeMovieDetailBean(com.example.jingbin.cloudreader.bean.MovieDetailBean MovieDetailBean, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeSubjectsBeanImages(com.example.jingbin.cloudreader.bean.moviechild.ImagesBean SubjectsBeanImages, int fieldId) {
        switch (fieldId) {
            case BR.medium: {
                synchronized(this) {
                        mDirtyFlags |= 0x200L;
                }
                return true;
            }
            case BR.large: {
                synchronized(this) {
                        mDirtyFlags |= 0x400L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
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
        java.lang.String subjectsBeanImagesMedium = null;
        double subjectsBeanRatingAverage = 0.0;
        com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean subjectsBean = mSubjectsBean;
        java.util.List<com.example.jingbin.cloudreader.bean.moviechild.PersonBean> subjectsBeanDirectors = null;
        java.util.List<java.lang.String> subjectsBeanGenres = null;
        java.lang.String stringFormatUtilFormatGenresSubjectsBeanGenres = null;
        com.example.jingbin.cloudreader.bean.moviechild.RatingBean subjectsBeanRating = null;
        java.lang.String stringFormatUtilFormatNameSubjectsBeanDirectors = null;
        java.lang.String stringFormatUtilFormatNameSubjectsBeanCasts = null;
        java.lang.String tvOneRatingRateAndroidStringStringRatingSubjectsBeanRatingAverage = null;
        java.lang.String subjectsBeanCollectCountTvOneRatingNumberAndroidStringStringRatingNum = null;
        java.lang.String subjectsBeanImagesLarge = null;
        com.example.jingbin.cloudreader.bean.moviechild.ImagesBean subjectsBeanImages = null;
        int subjectsBeanCollectCount = 0;
        java.util.List<com.example.jingbin.cloudreader.bean.moviechild.PersonBean> subjectsBeanCasts = null;
        java.lang.String tvOneGenresAndroidStringStringTypeStringFormatUtilFormatGenresSubjectsBeanGenres = null;

        if ((dirtyFlags & 0xffbL) != 0) {


            if ((dirtyFlags & 0x821L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.directors
                        subjectsBeanDirectors = subjectsBean.getDirectors();
                    }


                    // read StringFormatUtil.formatName(subjectsBean.directors)
                    stringFormatUtilFormatNameSubjectsBeanDirectors = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatName(subjectsBeanDirectors);
            }
            if ((dirtyFlags & 0x881L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.genres
                        subjectsBeanGenres = subjectsBean.getGenres();
                    }


                    // read StringFormatUtil.formatGenres(subjectsBean.genres)
                    stringFormatUtilFormatGenresSubjectsBeanGenres = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatGenres(subjectsBeanGenres);


                    // read (@android:string/string_type) + (StringFormatUtil.formatGenres(subjectsBean.genres))
                    tvOneGenresAndroidStringStringTypeStringFormatUtilFormatGenresSubjectsBeanGenres = (tvOneGenres.getResources().getString(R.string.string_type)) + (stringFormatUtilFormatGenresSubjectsBeanGenres);
            }
            if ((dirtyFlags & 0x903L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.rating
                        subjectsBeanRating = subjectsBean.getRating();
                    }
                    updateRegistration(1, subjectsBeanRating);


                    if (subjectsBeanRating != null) {
                        // read subjectsBean.rating.average
                        subjectsBeanRatingAverage = subjectsBeanRating.getAverage();
                    }


                    // read (@android:string/string_rating) + (subjectsBean.rating.average)
                    tvOneRatingRateAndroidStringStringRatingSubjectsBeanRatingAverage = (tvOneRatingRate.getResources().getString(R.string.string_rating)) + (subjectsBeanRatingAverage);
            }
            if ((dirtyFlags & 0xe09L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.images
                        subjectsBeanImages = subjectsBean.getImages();
                    }
                    updateRegistration(3, subjectsBeanImages);

                if ((dirtyFlags & 0xa09L) != 0) {

                        if (subjectsBeanImages != null) {
                            // read subjectsBean.images.medium
                            subjectsBeanImagesMedium = subjectsBeanImages.getMedium();
                        }
                }
                if ((dirtyFlags & 0xc09L) != 0) {

                        if (subjectsBeanImages != null) {
                            // read subjectsBean.images.large
                            subjectsBeanImagesLarge = subjectsBeanImages.getLarge();
                        }
                }
            }
            if ((dirtyFlags & 0x811L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.collect_count
                        subjectsBeanCollectCount = subjectsBean.getCollect_count();
                    }


                    // read (subjectsBean.collect_count) + (@android:string/string_rating_num)
                    subjectsBeanCollectCountTvOneRatingNumberAndroidStringStringRatingNum = (subjectsBeanCollectCount) + (tvOneRatingNumber.getResources().getString(R.string.string_rating_num));
            }
            if ((dirtyFlags & 0x841L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.casts
                        subjectsBeanCasts = subjectsBean.getCasts();
                    }


                    // read StringFormatUtil.formatName(subjectsBean.casts)
                    stringFormatUtilFormatNameSubjectsBeanCasts = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatName(subjectsBeanCasts);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xa09L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showImgBg(this.imgItemBg, subjectsBeanImagesMedium);
        }
        if ((dirtyFlags & 0xc09L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showMovieImg(this.ivOnePhoto, subjectsBeanImagesLarge);
        }
        if ((dirtyFlags & 0x841L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneCasts, stringFormatUtilFormatNameSubjectsBeanCasts);
        }
        if ((dirtyFlags & 0x821L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneDirectors, stringFormatUtilFormatNameSubjectsBeanDirectors);
        }
        if ((dirtyFlags & 0x881L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneGenres, tvOneGenresAndroidStringStringTypeStringFormatUtilFormatGenresSubjectsBeanGenres);
        }
        if ((dirtyFlags & 0x811L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneRatingNumber, subjectsBeanCollectCountTvOneRatingNumberAndroidStringStringRatingNum);
        }
        if ((dirtyFlags & 0x903L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneRatingRate, tvOneRatingRateAndroidStringStringRatingSubjectsBeanRatingAverage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static HeaderSlideShapeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static HeaderSlideShapeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<HeaderSlideShapeBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.header_slide_shape, root, attachToRoot, bindingComponent);
    }
    public static HeaderSlideShapeBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static HeaderSlideShapeBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.header_slide_shape, null, false), bindingComponent);
    }
    public static HeaderSlideShapeBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static HeaderSlideShapeBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/header_slide_shape_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new HeaderSlideShapeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): subjectsBean
        flag 1 (0x2L): subjectsBean.rating
        flag 2 (0x3L): movieDetailBean
        flag 3 (0x4L): subjectsBean.images
        flag 4 (0x5L): subjectsBean.collect_count
        flag 5 (0x6L): subjectsBean.directors
        flag 6 (0x7L): subjectsBean.casts
        flag 7 (0x8L): subjectsBean.genres
        flag 8 (0x9L): subjectsBean.rating.average
        flag 9 (0xaL): subjectsBean.images.medium
        flag 10 (0xbL): subjectsBean.images.large
        flag 11 (0xcL): null
    flag mapping end*/
    //end
}