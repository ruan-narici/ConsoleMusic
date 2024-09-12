package br.com.ruannarici.consolemusic.main;

import br.com.ruannarici.consolemusic.model.Artist;
import br.com.ruannarici.consolemusic.model.ECategory;
import br.com.ruannarici.consolemusic.model.Music;
import br.com.ruannarici.consolemusic.repository.ArtistRepository;

import java.util.Optional;
import java.util.Scanner;

public class Main {


    private Scanner reader = new Scanner(System.in);
    private ArtistRepository artistRepository;

    public Main(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public void run() {
        System.out.println("WELCOME TO THE *CONSOLE MUSIC*");
        Integer option = -1;
        while (option != 0) {
            showMenu();
            option = reader.nextInt();
            reader.nextLine();

            switch (option) {
                case 1: {
                    registerArtist();
                    break;
                }
                case 2: {
                    registerMusic();
                    break;
                }
                case 3: {
                    listArtist();
                    break;
                }
                case 4: {
                    listMusic();
                    break;
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("[MENU]");
        System.out.println("1 - REGISTER NEW ARTIST");
        System.out.println("2 - REGISTER NEW MUSIC");
        System.out.println("3 - LIST ARTISTS");
        System.out.println("4 - LIST MUSICS");
        System.out.println("0 - EXIT");
    }

    private void registerArtist() {
        System.out.println("Type the artist name: ");
        String artistName = reader.nextLine();
        System.out.println("Type an category: [solo], [dupla] or [grupo] ");
        String categoryName = reader.nextLine();

        Artist artist = new Artist(artistName, ECategory.fromString(categoryName));
        this.artistRepository.save(artist);
    }

    private void registerMusic() {
        System.out.println("Type the music name: ");
        String musicName = reader.nextLine();
        System.out.println("Type artist name: ");
        String artistName = reader.nextLine();

        Optional<Artist> artist = this.artistRepository.searchByName(artistName);

        if (artist.isPresent()) {
            Music music = new Music(musicName);
            artist.get().addMusic(music);
            this.artistRepository.save(artist.get());
            return;
        }

        System.out.println("| # _ # | - Artist Not Found!");
    }

    private void listArtist() {
        this.artistRepository.findAll().forEach(System.out::println);
    }

    private void listMusic() {
        this.artistRepository.findAll().stream()
                .flatMap(a -> a.getMusicList().stream()
                        .map(m -> m))
                .forEach(System.out::println);
    }
}
