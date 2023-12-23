package com.bookMyShow.Book.My.Show.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    String address;
    @ManyToOne
    ApplicationUser owner;
    @OneToMany(mappedBy = "hall")
    List<Screen> screenList;
    @OneToMany(mappedBy = "hall")
    List<Shows> showsList;
    @OneToMany(mappedBy = "hall")
    List<Ticket>ticketList;


}
