package com.bookMyShow.Book.My.Show.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    @Column(unique = true)
    String email;
    @Column(unique = true)
    long phoneNumber;
    String password;
    String type; // movieOwners, HallOwners and RegularOwners
    int age;
    @OneToMany(mappedBy = "user")
    List<Ticket> ticketList;


}
