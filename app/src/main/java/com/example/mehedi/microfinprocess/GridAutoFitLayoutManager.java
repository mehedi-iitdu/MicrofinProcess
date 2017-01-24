package com.example.mehedi.microfinprocess;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;

/**
 * Created by mehedi on 1/24/17.
 */

public class GridAutoFitLayoutManager extends GridLayoutManager
{
    private int mColumnWidth;

    public GridAutoFitLayoutManager(Context context, int columnWidth)
    {
        super(context, 1);
        this.mColumnWidth = columnWidth;
    }

    public GridAutoFitLayoutManager(Context context, int columnWidth, int orientation, boolean reverseLayout)
    {
        super(context, 1, orientation, reverseLayout);
        this.mColumnWidth = columnWidth;
    }

    @Override
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        int width = getWidth();
        int height = getHeight();

        if (mColumnWidth > 0 && width > 0 && height > 0)
        {
            int totalSpace;
            if (getOrientation() == VERTICAL)
            {
                totalSpace = width - getPaddingRight() - getPaddingLeft();

                Log.d("Total Space", String.valueOf(totalSpace));
            }
            else
            {
                totalSpace = height - getPaddingTop() - getPaddingBottom();

                Log.d("Total Space", String.valueOf(totalSpace));
            }

            int spanCount = Math.max(1, totalSpace / mColumnWidth);
            setSpanCount(spanCount);
        }
        super.onLayoutChildren(recycler, state);
    }
}
