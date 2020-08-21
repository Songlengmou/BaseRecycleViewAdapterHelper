package com.syp.library.listener;

import androidx.annotation.Nullable;

/**
 * @author: Song
 * @Desc: UpFetch需要设置的接口。使用java定义，以兼容java写法
 */
public interface UpFetchListenerImp {
    void setOnUpFetchListener(@Nullable OnUpFetchListener listener);
}
