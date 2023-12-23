package com.bookMyShow.Book.My.Show.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Shows {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    @ManyToOne
    Hall hall;
    @ManyToOne
    Movie movie;
    @ManyToOne
    Screen screen;
    int availableTickets;
    Date startTime;
    Date endTime;
    int ticketPrice;
    @OneToMany(mappedBy = "show")
    List<Ticket>ticketList;

}
