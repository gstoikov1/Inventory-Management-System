package repository;

import model.InventoryItem;

import java.util.List;
import java.util.Optional;

public interface InventoryItemRepository {
    /**
     * Adds a new inventory item to the repository.
     * @param item The item to be added.
     */
     void addItem(InventoryItem item);
    /**
     * Deletes an inventory item by its ID.
     * @param id The ID of the item to be deleted.
     * @return true if item was successfully deleted, false otherwise.
     */
    public boolean deleteItemById(Integer id);
    /**
     * Retrieves an inventory item by its ID.
     * @param id The ID of the item.
     * @return An Optional containing the item if found.
     */
    Optional<InventoryItem> getItemById(Integer id);

    /**
     * Returns all inventory items in the repository.
     * @return List of all inventory items.
     */
    List<InventoryItem> getAllItems();
}
