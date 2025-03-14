package model;

import java.time.LocalDate;

public class InventoryItem {
    private static int ID_COUNTER = 0;

    private final int id;
    private String name;
    private String description;
    private int quantity;
    private String serialNumber;
    private String unitOfMeasurement;
    private String itemCategory;
    private boolean borrowable;
    private LocalDate addedDate;

    public InventoryItem(String name, String description,
                         int quantity, String unitOfMeasurement,
                         String itemCategory, boolean borrowable) {
        if (name == null ) {
            throw new IllegalArgumentException("name is null");
        }
        if (name.length() > 100) {
            throw new IllegalArgumentException("name is greater than 100 characters");
        }
        if (description != null &&  description.length() > 255) {
        throw new IllegalArgumentException("description is greater than 255 characters");
        }

        this.id = ID_COUNTER++;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.serialNumber = serialNumber;
        this.unitOfMeasurement = unitOfMeasurement;
        this.itemCategory = itemCategory;
        this.borrowable = borrowable;
        this.addedDate = addedDate;
    }

    //setters and getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public boolean isBorrowable() {
        return borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }
}
