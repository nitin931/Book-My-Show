package com.bookMyShow.Book.My.Show.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    String directorName;
    String actorName;
    String actressName;
    int imdbRating;
    double duration;
    @OneToMany(mappedBy = "movie")
    List<Ticket> ticketList;
    @ManyToOne
    ApplicationUser owner;


}
