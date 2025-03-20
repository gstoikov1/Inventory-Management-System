package repository;

import model.Transaction;

import java.util.List;

public interface TransactionRepository {
    Transaction getTransaction(int transactionId);
    void addTransaction(Transaction t);
    List<Transaction> getAllTransactions();
    List<Transaction> getOverdueTransactions();

}
