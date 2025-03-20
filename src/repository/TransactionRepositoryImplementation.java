package repository;

import model.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionRepositoryImplementation implements TransactionRepository {
    private final Map<Integer,Transaction> transactionMap = new HashMap<>();

    @Override
    public Transaction getTransaction(int transactionId) {
        return transactionMap.get(transactionId);
    }

    @Override
    public void addTransaction(Transaction t) {
        transactionMap.put(t.getId(),t);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactionMap.values());
    }

    @Override
    public List<Transaction> getOverdueTransactions() {
        return getAllTransactions().stream().filter(t -> !t.isReturned() &&  t.getReturnDate().isBefore(LocalDate.now()))
                .toList();
    }

}
