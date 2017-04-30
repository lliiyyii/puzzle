package com.example.yi.myapplication;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yi on 2017/4/29.
 */

public class ImageSplitterUtil {

    /**
     * 传入bitmap,piece 切成piece*piece块，返回List<ImagePiece>
     *
     * @param bitmap
     * @param piece
     * @return List<ImagePiece>
     */
    public static List<Puzzle> splitImage(Bitmap bitmap, int piece) {

        List<Puzzle> imagePieces = new ArrayList<Puzzle>();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int pieceWidth = Math.min(width, height) / piece;
        for (int i = 0; i < piece; i++) {
            for (int j = 0; j < piece; j++) {
                Puzzle puzzle = new Puzzle();
                puzzle.setIndex(i * piece + j);
                int x = j * pieceWidth;
                int y = i * pieceWidth;
                puzzle.setBitmap(Bitmap.createBitmap(bitmap, x, y,
                        pieceWidth, pieceWidth));
                imagePieces.add(puzzle);
            }
        }
        return imagePieces;
    }
}