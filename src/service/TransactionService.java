package service;

import model.ClubMember;
import model.InventoryItem;
import model.Transaction;

import java.util.List;

public interface TransactionService {
    /**
     * Records a transaction when an item is borrowed.
     * @param member The club member borrowing the item.
     * @param item The item being borrowed.
     * @param days The number of days the item is borrowed for.
     */
    void borrowItem(ClubMember member, InventoryItem item, int days);

    /**
     * Retrieves all transactions in the system.
     * @return List of all transactions.
     */
    List<Transaction> getAllTransactions();

    /**
     * Marks a borrowed item as returned.
     * @param transactionId The ID of the transaction being completed.
     * @return true if the return was successful, false otherwise.
     */
    boolean returnItem(Integer transactionId);

    /**
     * Retrieves a list of all overdue transactions.
     * @return List of overdue transactions.
     */
    List<Transaction> getOverdueTransactions();
}