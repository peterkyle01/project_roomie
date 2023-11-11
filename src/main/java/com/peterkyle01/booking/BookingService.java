package com.peterkyle01.booking;

import com.peterkyle01.room.Room;
import com.peterkyle01.room.RoomRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final RoomRepository roomRepository;

    public BookingService(BookingRepository bookingRepository, RoomRepository roomRepository) {
        this.bookingRepository = bookingRepository;
        this.roomRepository = roomRepository;
    }

    public ResponseEntity<List<Booking>> getBookings() {

        List<Booking> allBookings = new ArrayList<Booking>();
        allBookings = bookingRepository.findAll();
        return ResponseEntity.ok(allBookings);
    }

    public ResponseEntity<Booking> createBooking(Booking booking) {

        Optional<Room> room = roomRepository.findById(booking.getRoomId());

        if (room.isPresent()) {
            bookingRepository.save(booking);
        }
        return ResponseEntity.ok(booking);
    }


    public ResponseEntity<Booking> deleteBooking(Integer bookingId) {
        if (bookingId==null) {
            return ResponseEntity.badRequest().build();
        }

        bookingRepository.deleteById(bookingId);

        return ResponseEntity.ok().build();
    }
}
