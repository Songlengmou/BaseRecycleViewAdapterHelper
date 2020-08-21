package com.syp.library.diff;

import androidx.annotation.NonNull;

/**
 * @param <T>
 * @author Song
 * @Desc:使用java接口定义方法
 */
public interface DifferImp<T> {
    void addListListener(@NonNull ListChangeListener<T> listChangeListener);
}
