package com.bookMyShow.Book.My.Show.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    @ManyToOne
    ApplicationUser user;
    @ManyToOne
    Movie movie;
    @ManyToOne
    Hall hall;
    @ManyToOne
    Shows show;

}
