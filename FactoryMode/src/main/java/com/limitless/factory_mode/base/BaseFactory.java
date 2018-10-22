package com.limitless.factory_mode.base;

/**
 * Created by Nick on 2018/10/18
 *
 * @author Nick
 *
 * 抽象工厂的基类
 */
public abstract class BaseFactory {

    public abstract Food createFood();
    public abstract Clothing createClothing();
    public abstract Room createRoom();


}
