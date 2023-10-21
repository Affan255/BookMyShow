package com.BookMyShow.BookMyShow.Models;

import com.BookMyShow.BookMyShow.Models.Constants.SeatType;
import com.BookMyShow.BookMyShow.Models.Constants.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel{
    private String SeatNumber;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private Status status;

}
