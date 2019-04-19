package com.BridgePattern;

import com.abs.Shape;
import com.inte.DrawApi;

public class Circle extends Shape {
    /*定义属性
    *
    * x,y,半径
    *
    * */
    private int x;
    private int y;
    private int radius;
    /*
    * 传入对象，通过对象调接口，让他们是关联的关系
    *
    * */
    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    /*
    *
    * 可以动态切换
    *
    * */


    @Override
    public void draw(/*传入参数进行动态切换*/) {

        drawApi.DrawApi(radius,x,y);
        /*
        * 添加新的数据
        *
        * */
        drawApi.zfx(radius,x,y);
    }
}
