package service;

import model.InventoryItem;
import repository.InventoryItemRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InventoryServiceImplementation implements InventoryService {
    private final InventoryItemRepository inventoryItemRepository;

    public InventoryServiceImplementation(InventoryItemRepository inventoryItemRepository) {
        this.inventoryItemRepository = inventoryItemRepository;
    }

    @Override
    public List<InventoryItem> getAllItems() {
        return inventoryItemRepository.getAllItems();
    }

    @Override
    public void addItem(String name, String description, int quantity, String unit, String category, boolean borrowable) {
        InventoryItem inventoryItem = new InventoryItem(name, description, quantity, unit, category, borrowable);
    }

    @Override
    public List<InventoryItem> getLowStockItems(int threshold) {
        return inventoryItemRepository.getAllItems().stream()
                .filter(inventoryItem -> inventoryItem.getQuantity() < threshold).collect(Collectors.toList());
    }

    @Override
    public boolean updateItem(InventoryItem updatedItem) {
        Optional<InventoryItem> presentItem= inventoryItemRepository.getItemById(updatedItem.getId());
        if (presentItem.isPresent()) {
             InventoryItem item = presentItem.get();
             item.setName(updatedItem.getName());
             item.setDescription(updatedItem.getDescription());
             item.setQuantity(updatedItem.getQuantity());
             item.setBorrowable(updatedItem.isBorrowable());
             item.setItemCategory(updatedItem.getItemCategory());
             return true;
        }
        return false;
    }
}
