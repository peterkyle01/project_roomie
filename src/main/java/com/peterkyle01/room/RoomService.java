package com.peterkyle01.room;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public Iterable<Room> getRooms() throws IOException {


        return roomRepository.findAll();
    }

    public ResponseEntity<Room> createRoom(
            Room room) {
        if (room.getImage().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        roomRepository.save(room);

        return ResponseEntity.ok().build();

    }

    public ResponseEntity<Room> updateRoom(Integer roomId, Room updatedRoom) {
        Optional<Room> roomOptional = roomRepository.findById(roomId);

        if (roomOptional.isPresent()) {
            Room room = roomOptional.get();

            room.setRoomTitle(updatedRoom.getRoomTitle());
            room.setImage(updatedRoom.getImage());
            room.setAmenities(updatedRoom.getAmenities());
            room.setCapacity(updatedRoom.getCapacity());

            roomRepository.save(room);

            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Room> deleteRoom(Integer roomId) {
        boolean roomOptional = roomRepository.existsById(roomId);

        if (!roomOptional) {
            return ResponseEntity.notFound().build();
        }

        roomRepository.deleteById(roomId);

        return ResponseEntity.ok().build();
    }


    public ResponseEntity<Room> getRoom(Integer roomId) {
        Optional<Room> room = roomRepository.findById(roomId);
        return ResponseEntity.ok(room.orElse(null));
    }
}
