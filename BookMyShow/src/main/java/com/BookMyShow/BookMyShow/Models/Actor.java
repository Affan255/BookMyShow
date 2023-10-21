package com.BookMyShow.BookMyShow.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Actor extends BaseModel{
    private String Name;
}
