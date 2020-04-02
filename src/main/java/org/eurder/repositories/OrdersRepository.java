package org.eurder.repositories;

import org.eurder.domain.Orders;

import java.util.ArrayList;
import java.util.List;

public class OrdersRepository {

    public List<Orders> listOfAllOrders;

    public OrdersRepository(List<Orders> listOfAllOrders) {
        this.listOfAllOrders= listOfAllOrders;
    }
}
