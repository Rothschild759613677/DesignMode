package com.limitless.factory_mode.impl;

import com.limitless.factory_mode.base.Room;

/**
 * Created by Nick on 2018/10/18
 *
 * @author Nick
 */
public class Hotel extends Room {
    @Override
    public void stay() {
        System.out.println(" live the hotel");
    }
}
