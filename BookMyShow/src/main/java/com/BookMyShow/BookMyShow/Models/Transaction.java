package com.BookMyShow.BookMyShow.Models;

import com.BookMyShow.BookMyShow.Models.Constants.StatusTransaction;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Transaction extends BaseModel{
    private int Amount;

    private StatusTransaction transactionStatus;
}
