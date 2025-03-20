package service;

import model.ClubMember;
import model.InventoryItem;
import model.Transaction;
import repository.TransactionRepository;

import java.time.LocalDate;
import java.util.List;

public class TransactionServiceImplementation implements TransactionService {
    TransactionRepository transactionRepository;
    @Override
    public void borrowItem(ClubMember member, InventoryItem item, int days) {
        LocalDate borrowDate = LocalDate.now();
        LocalDate returnDate = borrowDate.plusDays(days);
        Transaction transaction = new Transaction(member,item, borrowDate,returnDate);
        transactionRepository.addTransaction(transaction);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.getAllTransactions();
    }

    @Override
    public boolean returnItem(Integer transactionId) {
        Transaction transaction = transactionRepository.getTransaction(transactionId);
        if (transaction == null || transaction.isReturned()) {
            return false;
        }
        transaction.setReturned(true);
        return true;
    }

    @Override
    public List<Transaction> getOverdueTransactions() {
        return transactionRepository.getOverdueTransactions();
    }
}
