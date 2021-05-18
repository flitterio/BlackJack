package com.thinkful.blackjack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.play();
    }

    public void play(){
        boolean keepPlaying = true;
        Scanner scanner = new Scanner(System.in);
        while(keepPlaying){
            String menuChoice = getMenuChoice(scanner);
            keepPlaying = menuChoice.equalsIgnoreCase("s");
            if (keepPlaying){
                //play game here
                System.out.println("This is one game play here");
            }
        }
        System.out.println("Thank you for playing!");
    }
    public String getMenuChoice(Scanner scanner){
        String menuChoice = "";
        boolean isValid = false;
        while(!isValid){
            System.out.println("Welcome to Blackjack!\n\nPress s to start a game or e to exit");
            menuChoice = scanner.next();
            isValid = menuChoice.equalsIgnoreCase("s") || menuChoice.equalsIgnoreCase("e");
            if(!isValid){
                System.out.print("Invalid choice!");
            }
        }
        return menuChoice;
    }
}
