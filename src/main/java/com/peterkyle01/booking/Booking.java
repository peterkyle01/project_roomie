package com.peterkyle01.booking;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date checkIn;
    private Date checkOut;
    private String fromTime;
    private String toTime;
    private String customerEmail;
    private Integer roomId;

    public Booking(Date checkIn, Date checkOut, String fromTime, String toTime, String customerEmail, Integer roomId) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.customerEmail = customerEmail;
        this.roomId = roomId;
    }

}
