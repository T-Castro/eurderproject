package org.eurder.domain;

import org.eurder.repositories.ItemsRepository;

public class Items {

    private final String nameOfItem;
    private final String descriptionOfItem;
    private final double priceOfItem;
    private final ItemsRepository itemsInStock;

    public Items(String nameOfItem, String descriptionOfItem, double priceOfItem, ItemsRepository itemsLeftInStock) {
        this.nameOfItem = nameOfItem;
        this.descriptionOfItem = descriptionOfItem;
        this.priceOfItem = priceOfItem;
        this.itemsInStock = itemsLeftInStock;
    }


}
