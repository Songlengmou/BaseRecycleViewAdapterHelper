package com.syp.library.binder

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.syp.library.util.getItemView
import com.syp.library.viewholder.BaseViewHolder

/**
 * @author Song
 * @Desc 使用布局 ID 快速构建 Binder
 * @param T item 数据类型
 */
abstract class QuickItemBinder<T> : BaseItemBinder<T, BaseViewHolder>() {

    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder =
            BaseViewHolder(parent.getItemView(getLayoutId()))
}

