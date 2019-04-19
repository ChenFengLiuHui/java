package com.test;

import com.BridgePattern.Circle;
import com.abs.Shape;
import com.impl.GreenCricle;
import com.impl.RodCricle;
import com.inte.DrawApi;

public class test {

    public static void main(String[] args) {
        /*建立圆的对象*/
        Shape redCircle=new Circle(100,100,10,new RodCricle());
        Shape greenCricle=new Circle(100,100,10,new GreenCricle());

        redCircle.draw();
        greenCricle.draw();


        /*传统的写法*//*
        DrawApi drawApi=new GreenCricle();
        drawApi.zfx(100,100,10);*/


    }

}
