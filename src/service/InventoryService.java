package service;

import model.InventoryItem;

import java.util.List;

public interface InventoryService {
    /**
     * Retrieves all inventory items.
     * @return List of all items in inventory.
     */
    List<InventoryItem> getAllItems();

    /**
     * Adds a new item to the inventory.
     * @param name The name of the item.
     * @param description The item's description.
     * @param quantity The quantity available.
     * @param unit The unit of measurement.
     * @param category The category of the item.
     * @param borrowable Whether the item can be borrowed.
     */
    void addItem(String name, String description, int quantity, String unit, String category, boolean borrowable);

    // add  all operations from the CRUD operation


    // Continue with the business related functions
    /**
     * Retrieves all inventory items that are low in stock.
     * @param threshold The threshold quantity to determine low stock.
     * @return List of inventory items below the threshold.
     */
    List<InventoryItem> getLowStockItems(int threshold);

    /**
     * Updates an existing inventory item.
     * @param updatedItem The updated item details.
     * @return true if update was successful, false otherwise.
     */
    public boolean updateItem(InventoryItem updatedItem);

}