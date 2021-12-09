package com.example.myfirstapp;

import android.graphics.Canvas;

import java.lang.reflect.Field;

public class BlockMatrix {

    private Integer fieldRows = 7;
    private Integer maxBlocksPerRow = 10;
    private Block[][] field = new Block[fieldRows][maxBlocksPerRow];

    private String level =  "1000110001" +
                            "1000110001" +
                            "1000111001" +
                            "1000110001" +
                            "1000110001" +
                            "1000110001" +
                            "1000110001";


    public BlockMatrix() {
        //loop set rows
        Integer xOrigin;
        Integer blockHeight = 20;
        Integer blockWidth = 40;

        Integer yOrigin = 10;
        Integer blockGap = (int) Math.ceil(blockWidth * 0.2);

        for (int i = 0; i < fieldRows; ++i) {
            xOrigin = 10;
            yOrigin = 10 + (blockHeight*(i+1)) + (blockGap* i+1);
            //loop set block in rows
            for (int j = 0; j < maxBlocksPerRow; ++j) {
                field[i][j] = new Block(xOrigin, yOrigin, blockHeight, blockWidth, level.charAt((maxBlocksPerRow* i)+j) == '1' ? false : true);
                xOrigin += blockWidth + blockGap;
            }
        }
    }

    public void draw(Canvas canvas) {
        System.out.println("Drawing Matrix");
        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 10; ++j) {
                field[i][j].draw(canvas);
            }
        }
    }

    // switch um block type zu setzen

}

