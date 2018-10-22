package com.limitless.factory_mode.impl;

import com.limitless.factory_mode.base.Clothing;

/**
 * Created by Nick on 2018/10/18
 *
 * @author Nick
 */
public class BusinessSuit extends Clothing {
    @Override
    public void put() {
        System.out.println("put the business suit");
    }
}
