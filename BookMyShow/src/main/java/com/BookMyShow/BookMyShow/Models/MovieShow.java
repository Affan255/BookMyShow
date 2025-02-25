package com.BookMyShow.BookMyShow.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class MovieShow extends BaseModel{
    @ManyToOne
    private Auditorium auditorium;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private Movie movie;

    @OneToMany
    private List<ShowSeat> showSeat;

}
