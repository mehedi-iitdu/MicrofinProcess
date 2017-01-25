package com.example.mehedi.microfinprocess.reportList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/**
 * Created by mehedi on 1/25/17.
 */

public class Shape {

    public static Drawable drawCircle (Context context, int width, int height, final int color) {

        ShapeDrawable oval = new ShapeDrawable(new OvalShape());

        oval.setIntrinsicHeight (height);
        oval.setIntrinsicWidth (width);
        oval.getPaint ().setColor (color);
        oval.setShaderFactory(new ShapeDrawable.ShaderFactory() {
            @Override
            public Shader resize(int width, int height) {
                return new LinearGradient(0, 0, width-10, height-10,
                        new int[]{color, Color.GRAY, color},
                        new float[]{0,0.5f,0.5f}, Shader.TileMode.MIRROR);
            }
        });

        return oval;
    }
}
