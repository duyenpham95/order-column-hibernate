package com.dien.songorder.rest;

import com.dien.songorder.entity.AppPlaylistAppSong;
import com.dien.songorder.entity.SongOrder;
import com.dien.songorder.repo.AppPlaylistAppSongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class SongOrderController {

    @Autowired
    AppPlaylistAppSongRepository appPlaylistAppSongRepository;

    private String saveOrder() {
        UUID appplayList1 = UUID.randomUUID();
        UUID songId1 = UUID.randomUUID();
        UUID songId2 = UUID.randomUUID();
        UUID songId3 = UUID.randomUUID();

        SongOrder songOrder1 = new SongOrder(1l, songId1);
        SongOrder songOrder2 = new SongOrder(1l, songId2);
        SongOrder songOrder3 = new SongOrder(1l, songId3);

        List<SongOrder> songOrderList1 = Arrays.asList(songOrder1, songOrder2, songOrder3);

        AppPlaylistAppSong ap1 = new AppPlaylistAppSong(1l, songOrderList1);
        ap1 = appPlaylistAppSongRepository.save(ap1);

        return ap1.toString();
    }

    @GetMapping("hello")
    @Transactional
    public String hello() {
        return saveOrder();
    }
}
