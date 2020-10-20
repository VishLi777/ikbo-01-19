package ru.mirea.pract16;

import java.util.Collection;

public class RestaurantOrder extends TablesOrderManager {
    public RestaurantOrder() {}

    public RestaurantOrder(Collection<Item> collection) {
        super(collection);
    }
}
