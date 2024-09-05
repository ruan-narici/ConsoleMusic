package br.com.ruannarici.consolemusic.main;

import br.com.ruannarici.consolemusic.model.Artist;
import br.com.ruannarici.consolemusic.model.ECategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private Scanner reader = new Scanner(System.in);
    private List<Artist> artistList = new ArrayList<>();

    public void run() {
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
                    break;
                }
                case 3: {
                    listArtist();
                    break;
                }
                case 4: {
                    break;
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("WELCOME TO THE *CONSOLE MUSIC*");
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
        artistList.add(artist);
    }

    private void listArtist() {
        this.artistList.forEach(System.out::println);
    }
}
