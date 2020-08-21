package com.syp.library.listener;

import androidx.annotation.Nullable;

/**
 * @author: Song
 */
public interface DraggableListenerImp {

    void setOnItemDragListener(@Nullable OnItemDragListener onItemDragListener);

    void setOnItemSwipeListener(@Nullable OnItemSwipeListener onItemSwipeListener);
}
