package com.necromancer.news.widget.circletreveal;

import android.support.annotation.Nullable;
import android.view.View;

import com.necromancer.news.widget.animation.CRAnimation;


/**
 * Created by zzz40500 on 15/8/27.
 */
public class CircularRevealCompat {

    public View mView;

    public CircularRevealCompat(View view) {
        mView = view;
    }

    @Nullable
    public CRAnimation circularReveal(int centerX, int centerY, float startRadius, float endRadius) {

        if (mView instanceof CircleRevealEnable) {
            return ((CircleRevealEnable) mView).circularReveal(centerX, centerY, startRadius, endRadius);
        }
        return null;
    }

}
