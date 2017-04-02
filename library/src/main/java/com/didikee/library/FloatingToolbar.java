package com.didikee.library;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by didik on 2017/4/2.
 */

public class FloatingToolbar extends FrameLayout {
    public FloatingToolbar(@NonNull Context context) {
        super(context);
    }

    public FloatingToolbar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FloatingToolbar(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int
            defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
