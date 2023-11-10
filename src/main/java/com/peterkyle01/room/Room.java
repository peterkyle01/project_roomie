package com.peterkyle01.room;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 1048576)
    private String image;
    private String roomTitle;
    @ElementCollection
    private List<String> amenities;
    private Integer capacity;

    public Room(String image, String roomTitle, List<String> amenities, Integer capacity) {
        this.image = image;
        this.roomTitle = roomTitle;
        this.amenities = amenities;
        this.capacity = capacity;
    }
}
