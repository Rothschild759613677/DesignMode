package com.limitless.factory_mode;

import com.limitless.factory_mode.base.Clothing;
import com.limitless.factory_mode.base.Food;
import com.limitless.factory_mode.base.Room;
import com.limitless.factory_mode.base.BaseFactory;
import com.limitless.factory_mode.impl.DefaultFactory;

/**
 * 工厂模式
 */
public class MyClass {

    public static void main(String[] args) {
        BaseFactory factory = new DefaultFactory();

        Food food = factory.createFood();
        Clothing clothing = factory.createClothing();
        Room room = factory.createRoom();


        food.eat();
        clothing.put();
        room.stay();
    }
}
