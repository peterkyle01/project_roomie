package com.peterkyle01.room;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(path = "/api/v1/room")
@CrossOrigin
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<Room> createRoom(
            @RequestBody Room room) {
        return roomService.createRoom(room);
    }

    @GetMapping
    public Iterable<Room> getRooms() throws IOException {
        return roomService.getRooms();
    }

    @GetMapping("/{roomId}")
    public ResponseEntity<Room> getRoom(@PathVariable Integer roomId){
        return roomService.getRoom(roomId);
    }


    @PutMapping("/{roomId}")
    public ResponseEntity<Room> updateRoom(@PathVariable Integer roomId, @RequestBody Room updatedRoom) {
        return roomService.updateRoom(roomId, updatedRoom);
    }

    @DeleteMapping("/{roomId}")
    public ResponseEntity<Room> deleteRoom(@PathVariable Integer roomId) {
        return roomService.deleteRoom(roomId);
    }
}
