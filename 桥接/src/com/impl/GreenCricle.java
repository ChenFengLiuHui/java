package com.impl;

import com.inte.DrawApi;

public class GreenCricle implements DrawApi {

    /*

            绿色圆

    */
    @Override
    public void DrawApi(int radius, int x, int y) {
        System.out.println("这个圆是绿色的："+"半径是："+radius+"x"+x+"y"+y);
    }

    @Override
    public void zfx(int radius, int x, int y) {
        System.out.println("这个正方形是绿色的："+"半径是："+radius+"x"+x+"y"+y);
    }
}
