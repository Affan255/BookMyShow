package com.BookMyShow.BookMyShow.Models;

import com.BookMyShow.BookMyShow.Models.Constants.PaymentMode;
import com.BookMyShow.BookMyShow.Models.Constants.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private LocalDateTime paymentType;
    private double amount;
    private String referenceId;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @OneToMany
    private List<Transaction> transactionList;
    @ManyToOne
    private Ticket ticket;
}
/*
    Ticket      Payment
        M   <-       1
        1   ->       1

        Payment     Transaction
            1   ->         M
            1              1
 */