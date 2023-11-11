package com.peterkyle01.booking;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/booking")
@CrossOrigin
public class BookingController {

    public final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public ResponseEntity<List<Booking>> getBookings() throws IOException{
        return bookingService.getBookings();
    }

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){
        return bookingService.createBooking(booking);
    }


    @DeleteMapping(path = "/{bookingId}")
    public ResponseEntity<Booking> deleteBooking(@PathVariable Integer bookingId){
        return bookingService.deleteBooking(bookingId);
    }
}
