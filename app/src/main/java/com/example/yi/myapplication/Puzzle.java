package com.example.yi.myapplication;

import android.graphics.Bitmap;

/**
 * Created by yi on 2017/4/30.
 */

public class Puzzle {

    //原来是第几块
    private int index;
    //当前图片显示
    private Bitmap bitmap;

    public Puzzle() {
    }

    public Puzzle(int index, Bitmap bitmap) {
        this.index = index;
        this.bitmap = bitmap;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public String toString() {
        return "ImagePiece [index=" + index + ", bitmap=" + bitmap + "]";
    }
}
