package com.BookMyShow.BookMyShow.Models;

import com.BookMyShow.BookMyShow.Models.Constants.AuditoriumFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel{
    private String Name;
    private int features;

    @OneToMany
    private List<MovieShow>shows;
    @OneToMany
    private List<Seat>seats;
    @ElementCollection      //when you have List<enum> i.e multiple enum
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeatures>auditoriumFeatures;
}
