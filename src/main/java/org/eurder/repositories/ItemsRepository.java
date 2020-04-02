package org.eurder.repositories;

import org.eurder.domain.Item;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemsRepository {

    public List<Item> listOfAllItems;

    public ItemsRepository() {
        this.listOfAllItems = new ArrayList<>();
    }

    public List<Item> getListOfAllItems() {
        return listOfAllItems;
    }

   /* public Item addNewItem(Item itemToAdd) {
        listOfAllItems.add(itemToAdd);
        return itemToAdd;
    }*/


}