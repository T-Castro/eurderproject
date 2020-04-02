package org.eurder.repositories;

import org.eurder.domain.Items;
import org.eurder.domain.Orders;

import java.util.List;

public class ItemsRepository {

    public List<Items> listOfAllItems;

    public ItemsRepository(List<Items> listOfAllProvidedItems) {
        this.listOfAllItems= listOfAllProvidedItems;
    }
}
