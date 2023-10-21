package com.BookMyShow.BookMyShow.Models;


import com.BookMyShow.BookMyShow.Models.Constants.MovieFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class Movie extends BaseModel{
    private String name;
    private String description;
    private String language;
    @ManyToMany
    private List<Actor> actors;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeatures>movieFeatures;
}
