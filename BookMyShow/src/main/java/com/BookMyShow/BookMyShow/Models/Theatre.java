package com.BookMyShow.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theatre extends BaseModel{
    private String Name;
    private String Address;
    @OneToMany
    private List<Auditorium> auditorium;

}
