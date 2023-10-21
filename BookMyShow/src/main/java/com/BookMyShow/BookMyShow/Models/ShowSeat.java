package com.BookMyShow.BookMyShow.Models;


import com.BookMyShow.BookMyShow.Models.Constants.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{

    @ManyToOne
    private Show show;
    private int price;

    @OneToMany
    private Seat seat;

    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
}

/*
showseat    seat
    1       M
    1       1
showseat    show
   1         1
   M          1
 */