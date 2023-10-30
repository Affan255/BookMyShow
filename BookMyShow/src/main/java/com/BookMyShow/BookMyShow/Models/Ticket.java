package com.BookMyShow.BookMyShow.Models;


import com.BookMyShow.BookMyShow.Models.Constants.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity              //class should be treated as a Table in a Database
public class Ticket extends BaseModel{
       @ManyToOne
       private MovieShow show;

       @ManyToMany
       private List<ShowSeat> showSeat;

       private double ticketAmount;

       @Enumerated(EnumType.STRING)
       private TicketStatus ticketStatus;

       private LocalDateTime timeOfBooking;
}
/*
ticket show
1    ->   1
M    <-   1

ticket ShowSeat
1      M
M      1

 2 Way Mapping -> when you have user inside Ticket  & Ticket inside user
 1 way Mapping -> when you have just user -> inside ticket

 */