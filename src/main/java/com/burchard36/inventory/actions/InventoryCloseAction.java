package com.burchard36.inventory.actions;

import org.bukkit.event.inventory.InventoryCloseEvent;

public class InventoryCloseAction extends InventoryCloseEvent {

    public InventoryCloseAction(InventoryCloseEvent event) {
        super(event.getView());
    }
}
