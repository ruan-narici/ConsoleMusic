package br.com.ruannarici.consolemusic.model;

import java.util.List;

public class Artist {

    private Long id;
    private String name;
    private ECategory category;
    private List<Music> musicList;

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
