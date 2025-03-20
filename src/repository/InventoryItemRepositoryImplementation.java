package repository;

import model.InventoryItem;

import java.util.*;

public class InventoryItemRepositoryImplementation implements InventoryItemRepository {
    private static Map<Integer, InventoryItem> itemTable = new HashMap<>();
    @Override
    public void addItem(InventoryItem item) {
        for (InventoryItem i : itemTable.values()) {
            if (i.getSerialNumber().equals(item.getSerialNumber())) {
                throw new RuntimeException("Inventory Item  with this serial number already exists");
            }
        }
        int id = item.getId();
        if (itemTable.containsKey(id)) {
            throw new RuntimeException("Item already exists");
        }
        itemTable.put(id, item);
    }

    @Override
    public boolean deleteItemById(Integer id) {
          return itemTable.remove(id) != null;
    }

    @Override
    public Optional<InventoryItem> getItemById(Integer id) {
        return Optional.ofNullable(itemTable.get(id));
    }

    @Override
    public List<InventoryItem> getAllItems() {
        return new ArrayList<>(itemTable.values());
    }
}
