package br.com.ruannarici.consolemusic.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private ECategory category;
    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Music> musicList = new ArrayList<>();

    public Artist() {}

    public Artist(String name, ECategory eCategory) {
        this.name = name;
        this.category = eCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ECategory getCategory() {
        return category;
    }

    public void setCategory(ECategory category) {
        this.category = category;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void addMusic(Music music) {
        music.setArtist(this);
        this.musicList.add(music);
    }
}
