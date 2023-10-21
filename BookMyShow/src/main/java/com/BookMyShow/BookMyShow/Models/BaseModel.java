package com.BookMyShow.BookMyShow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id         //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)         //auto generated value
    @Column(name = "id")        //table-> column name
    private int id;


}
