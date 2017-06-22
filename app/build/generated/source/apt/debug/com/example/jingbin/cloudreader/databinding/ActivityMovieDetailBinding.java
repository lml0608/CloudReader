package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ActivityMovieDetailBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(1, 
            new String[] {"header_slide_shape"},
            new int[] {4},
            new int[] {R.layout.header_slide_shape});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nsv_scrollview, 5);
        sViewsWithIds.put(R.id.xrv_cast, 6);
        sViewsWithIds.put(R.id.rl_title_head, 7);
        sViewsWithIds.put(R.id.iv_title_head_bg, 8);
        sViewsWithIds.put(R.id.title_tool_bar, 9);
    }
    // views
    public final com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding include;
    public final android.widget.ImageView ivTitleHeadBg;
    public final android.widget.LinearLayout llHeaderView;
    private final android.widget.FrameLayout mboundView0;
    private final android.widget.TextView mboundView3;
    public final com.example.jingbin.cloudreader.view.MyNestedScrollView nsvScrollview;
    public final android.widget.RelativeLayout rlTitleHead;
    public final android.support.v7.widget.Toolbar titleToolBar;
    public final android.widget.TextView tvOneTitle;
    public final com.example.xrecyclerview.XRecyclerView xrvCast;
    // variables
    private com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean mSubjectsBean;
    private com.example.jingbin.cloudreader.bean.MovieDetailBean mMovieDetailBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMovieDetailBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.include = (com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding) bindings[4];
        setContainedBinding(this.include);
        this.ivTitleHeadBg = (android.widget.ImageView) bindings[8];
        this.llHeaderView = (android.widget.LinearLayout) bindings[1];
        this.llHeaderView.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.nsvScrollview = (com.example.jingbin.cloudreader.view.MyNestedScrollView) bindings[5];
        this.rlTitleHead = (android.widget.RelativeLayout) bindings[7];
        this.titleToolBar = (android.support.v7.widget.Toolbar) bindings[9];
        this.tvOneTitle = (android.widget.TextView) bindings[2];
        this.tvOneTitle.setTag(null);
        this.xrvCast = (com.example.xrecyclerview.XRecyclerView) bindings[6];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        include.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (include.hasPendingBindings()) {
            return true;
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
        this.mSubjectsBean = SubjectsBean;
    }
    public com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean getSubjectsBean() {
        return mSubjectsBean;
    }
    public void setMovieDetailBean(com.example.jingbin.cloudreader.bean.MovieDetailBean MovieDetailBean) {
        updateRegistration(2, MovieDetailBean);
        this.mMovieDetailBean = MovieDetailBean;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.movieDetailBean);
        super.requestRebind();
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
                return onChangeInclude((com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding) object, fieldId);
            case 2 :
                return onChangeMovieDetailBean((com.example.jingbin.cloudreader.bean.MovieDetailBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSubjectsBean(com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean SubjectsBean, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeInclude(com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding Include, int fieldId) {
        switch (fieldId) {
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
            case BR.aka: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR.summary: {
                synchronized(this) {
                        mDirtyFlags |= 0x10L;
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
        java.util.List<java.lang.String> movieDetailBeanAka = null;
        java.lang.String stringFormatUtilFormatGenresMovieDetailBeanAka = null;
        com.example.jingbin.cloudreader.bean.MovieDetailBean movieDetailBean = mMovieDetailBean;
        java.lang.String movieDetailBeanSummary = null;

        if ((dirtyFlags & 0x3cL) != 0) {


            if ((dirtyFlags & 0x2cL) != 0) {

                    if (movieDetailBean != null) {
                        // read movieDetailBean.aka
                        movieDetailBeanAka = movieDetailBean.getAka();
                    }


                    // read StringFormatUtil.formatGenres(movieDetailBean.aka)
                    stringFormatUtilFormatGenresMovieDetailBeanAka = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatGenres(movieDetailBeanAka);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (movieDetailBean != null) {
                        // read movieDetailBean.summary
                        movieDetailBeanSummary = movieDetailBean.getSummary();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, movieDetailBeanSummary);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneTitle, stringFormatUtilFormatGenresMovieDetailBeanAka);
        }
        executeBindingsOn(include);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityMovieDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMovieDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMovieDetailBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_movie_detail, root, attachToRoot, bindingComponent);
    }
    public static ActivityMovieDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMovieDetailBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_movie_detail, null, false), bindingComponent);
    }
    public static ActivityMovieDetailBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMovieDetailBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_movie_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMovieDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): subjectsBean
        flag 1 (0x2L): include
        flag 2 (0x3L): movieDetailBean
        flag 3 (0x4L): movieDetailBean.aka
        flag 4 (0x5L): movieDetailBean.summary
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}