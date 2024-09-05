package br.com.ruannarici.consolemusic.main;

import java.util.Scanner;

public class Main {

    private Scanner reader = new Scanner(System.in);

    public void run() {
        showMenu();
        Integer option = reader.nextInt();
        reader.nextLine();
        switch (option) {
            case 1: {
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
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
    }

}
