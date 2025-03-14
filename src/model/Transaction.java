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
}
