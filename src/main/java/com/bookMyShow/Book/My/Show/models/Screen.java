package com.bookMyShow.Book.My.Show.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String screenName;
    @ManyToOne
    Hall hall;
    int screenCapacity;
    boolean status;
    String type;

}
