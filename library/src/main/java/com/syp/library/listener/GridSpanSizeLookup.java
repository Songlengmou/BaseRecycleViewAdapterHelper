package com.syp.library.listener;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;

/**
 * @author: Song
 */
public interface GridSpanSizeLookup {
    int getSpanSize(@NonNull GridLayoutManager gridLayoutManager, int viewType, int position);
}
