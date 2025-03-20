package model;

import java.time.LocalDate;

public class Transaction {
    private static int ID_COUNTER = 0;
    private int id;
    private ClubMember clubMember;
    private InventoryItem inventoryItem;
    private LocalDate borrowedDate;
    private LocalDate returnDate;
    private boolean isReturned;

    public Transaction(ClubMember clubMember, InventoryItem inventoryItem,
                       LocalDate borrowedDate, LocalDate returnDate) {
        id = ID_COUNTER++;
        this.clubMember = clubMember;
        this.inventoryItem = inventoryItem;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
    }

    public static int getIdCounter() {
        return ID_COUNTER;
    }

    public int getId() {
        return id;
    }

    public ClubMember getClubMember() {
        return clubMember;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isReturned() {
        return isReturned;
    }
    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
