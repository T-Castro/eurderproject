package org.eurder.domain;

import org.eurder.repositories.ItemsRepository;
import org.springframework.stereotype.Component;

@Component
public class Item {

    private final String nameOfItem;
    private final String descriptionOfItem;
    private final double priceOfItem;
    private final ItemsRepository itemsInStock;

    public Item(String nameOfItem, String descriptionOfItem, double priceOfItem, ItemsRepository itemsLeftInStock) {
        this.nameOfItem = nameOfItem;
        this.descriptionOfItem = descriptionOfItem;
        this.priceOfItem = priceOfItem;
        this.itemsInStock = itemsLeftInStock;
    }


}
