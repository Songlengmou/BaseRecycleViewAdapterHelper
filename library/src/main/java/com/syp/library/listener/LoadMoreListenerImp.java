package com.syp.library.listener;

import androidx.annotation.Nullable;

/**
 * @author: Song
 * @Desc: LoadMore需要设置的接口。使用java定义，以兼容java写法
 */
public interface LoadMoreListenerImp {
    void setOnLoadMoreListener(@Nullable OnLoadMoreListener listener);
}
