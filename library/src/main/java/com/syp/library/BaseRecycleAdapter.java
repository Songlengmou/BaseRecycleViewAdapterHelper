package com.syp.library;

import androidx.annotation.Nullable;

import com.syp.library.viewholder.BaseViewHolder;

import java.util.List;

/**
 * @author Song
 * @Desc: Recycle适配器
 */
public class BaseRecycleAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {
    private OnDataToViewListener mOnDataToViewListener;

    public void setOnDataToViewListener(OnDataToViewListener onDataToViewListener) {
        mOnDataToViewListener = onDataToViewListener;
    }

    public BaseRecycleAdapter(int layoutResId, @Nullable List<T> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, T item) {
        if (mOnDataToViewListener != null) {
            mOnDataToViewListener.dataToView(helper, item, getItemPosition(item));
        }
    }

    public interface OnDataToViewListener<T> {
        void dataToView(BaseViewHolder helper, T item, int position);
    }
}
