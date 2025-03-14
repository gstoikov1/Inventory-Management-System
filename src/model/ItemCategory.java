package model;

public class ItemCategory {
    private static int ID_COUNTER = 0;
    private int id;
    private String name;
    private String description;

    public ItemCategory(String name, String description) {
        this.id = ID_COUNTER++;
        this.name = name;
        this.description = description;
    }

}
