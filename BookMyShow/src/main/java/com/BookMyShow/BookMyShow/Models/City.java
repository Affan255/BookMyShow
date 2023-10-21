package com.BookMyShow.BookMyShow.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class City extends BaseModel{
    @Column( name = "City Name")
    private String Name;

    @OneToMany
    private List<Theatre> theatre;
}
