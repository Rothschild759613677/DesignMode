package com.limitless.factory_mode.impl;

import com.limitless.factory_mode.base.Food;

/**
 * Created by Nick on 2018/10/18
 *
 * @author Nick
 */
public class Apple extends Food {
    @Override
    public void eat() {
        System.out.println(" eat an apple");
    }
}
