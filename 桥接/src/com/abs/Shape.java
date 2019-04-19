package com.abs;

import com.inte.DrawApi;

/*一个抽象类，作为桥梁使用*/
public abstract class Shape {
    /*定义一个受保护的数据*/

    protected DrawApi drawApi;
    /*生成构造方法
    *
    * 给接口赋值，存在对个的话进行添加参数
    *
    * */
    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }
    /*
    * 声明一个抽象方法
    *
    * 该方法用来调用DrawApi
    * */
    public abstract void draw();
}
