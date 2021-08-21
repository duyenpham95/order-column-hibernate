package com.dien.songorder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class SongOrder {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "playlist_id")
    private Long appPlaylistId;

    @Column(name = "song_id")
    private UUID songId;

    @Column(name = "song_order")
    private Long songOrder;

    public SongOrder(Long appPlaylistId, UUID songId) {
        this.appPlaylistId = appPlaylistId;
        this.songId = songId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSongOrder() {
        return songOrder;
    }

    public void setSongOrder(Long songOrder) {
        this.songOrder = songOrder;
    }

    @Override
    public String toString() {
        return "SongOrder{" +
                "appPlaylistId=" + appPlaylistId +
                ", songId=" + songId +
                ", songOrder=" + songOrder +
                '}';
    }
}
