package com.dien.songorder.entity;

import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
import java.util.List;

@Entity
public class AppPlaylistAppSong {

    @GeneratedValue
    @Id
    Long id;

    @Column(name = "app_playlist_id")
    Long appPlaylistId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @OrderColumn(name = "song_order")
    @JoinColumn(name = "playlist_id")
    @ListIndexBase(1)
    private List<SongOrder> songOrder;

    public AppPlaylistAppSong(Long appPlaylistId, List<SongOrder> songOrder) {
        this.appPlaylistId = appPlaylistId;
        this.songOrder = songOrder;
    }

    public AppPlaylistAppSong(Long appPlaylistId) {
        this.appPlaylistId = appPlaylistId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "AppPlaylistAppSong{" +
                "id=" + id +
                ", appPlaylistId=" + appPlaylistId +
                ", songOrder=" + songOrder +
                '}';
    }
}
