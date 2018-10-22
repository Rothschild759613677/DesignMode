package com.limitless.factory_mode.impl;

import com.limitless.factory_mode.base.Clothing;
import com.limitless.factory_mode.base.Food;
import com.limitless.factory_mode.base.Room;
import com.limitless.factory_mode.base.BaseFactory;

/**
 * Created by Nick on 2018/10/18
 *
 * @author Nick
 */
public class DefaultFactory extends BaseFactory {
    @Override
    public Food createFood() {
        return new Apple();
    }

    @Override
    public Clothing createClothing() {
        return new BusinessSuit();
    }

    @Override
    public Room createRoom() {
        return new Hotel();
    }
}
