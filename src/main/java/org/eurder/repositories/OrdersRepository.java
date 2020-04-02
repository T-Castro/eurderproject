package org.eurder.repositories;

import org.eurder.domain.Orders;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrdersRepository {

    public List<Orders> listOfAllOrders;

    public OrdersRepository(List<Orders> listOfAllOrders) {
        this.listOfAllOrders= listOfAllOrders;
    }
}
