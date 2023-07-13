package chapterEleven.microFinanceBank;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private String reference;

    public Transaction(String reference, BigDecimal amount) {
        this.reference = reference;
        this.amount = amount;
        createdAt = createdAt;
    }

    private BigDecimal amount;
    private LocalDateTime createdAt;

}
