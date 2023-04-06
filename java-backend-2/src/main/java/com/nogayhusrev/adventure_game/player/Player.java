package com.nogayhusrev.adventure_game.player;


import com.nogayhusrev.adventure_game.characters.Archer;
import com.nogayhusrev.adventure_game.characters.GameChar;
import com.nogayhusrev.adventure_game.characters.Knight;
import com.nogayhusrev.adventure_game.characters.Samurai;
import com.nogayhusrev.adventure_game.location.*;

import java.util.Scanner;

public class Player {
    public boolean noLocPickedYet = true;
    public boolean isExit = false;
    private String playerName;
    private GameChar character;
    private Location location;
    private Scanner scan = new Scanner(System.in);

    public Player(String playerName) {
        setPlayerName(playerName);

    }

    public void pickChar() {


        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Characters:");
        System.out.println("--------------------------------------------------------------");
        for (GameChar character : charList) {
            System.out.println("Character " + character.getId() + ": " + character.getCharName() + " | " +
                    " Health" + ": " + character.getHealth() + " | " +
                    " Damage" + ": " + character.getDamage() + " | " +
                    " Money" + ": " + character.getMoney());

        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Please pick a character (write the number):");


        boolean isCharPicked;
        do {
            switch (scan.next()) {
                case "1":
                    isCharPicked = true;
                    character = new Samurai();
                    break;
                case "2":
                    isCharPicked = true;
                    character = new Archer();
                    break;
                case "3":
                    isCharPicked = true;
                    character = new Knight();
                    break;
                default:
                    System.out.println("You typed an invalid value! Please type the number of the characters");
                    isCharPicked = false;
                    break;
            }

        } while (!isCharPicked);

    }


    public void pickLocation() {


        while (noLocPickedYet || location.onLocation()) {


            printInfo();

            System.out.println("Locations:");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1 - Safe House - There are no enemies in Safe House and you can restored your health. When you've collected all the items, bring them here.");
            System.out.println("2 - Store - You can buy a weapon or armor in Store.");
            System.out.println("3 - Cave - You can find food in the cave. But be careful there are zombies.");
            System.out.println("4 - Forest - You can find wood in the forest. But be careful there are vampires.");
            System.out.println("5 - River - You can find water in the river. But be careful there are bears.");
            System.out.println("6 - Mine - You can win an award in here randomly(Weapon, armor, money or nothing). But careful there are snakes.");
            System.out.println("0 - Quit the game");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Please pick a location to move: ");


            String locChosen = scan.next();
            switch (locChosen) {
                case "0":
                    isExit = true;
                    break;
                case "2":
                    location = new Store(this);
                    break;
                case "3":
                    location = new Cave(this);
                    break;
                case "4":
                    location = new Forest(this);
                    break;
                case "5":
                    location = new River(this);
                    break;
                case "6":
                    location = new Mine(this);
                    break;
                default:
                    location = new SafeHouse(this);
                    break;

            }


            noLocPickedYet = false;
            if (isExit == true) {
                System.out.println("See you later, adventurer. The adventure is not over...");
                break;
            }


            if (this.getCharacter().getInventory().getAwards().size() == this.getLocation().getHowManyBattleLoc()) {
                System.out.println("CONGRATULATIONS you collect all awards in every locations.");
                System.out.println("We are waiting for you again for new adventures :)");
                break;
            }

        }


        if (location != null && (this.getCharacter().getInventory().getAwards().size() != this.getLocation().getHowManyBattleLoc())) {
            System.out.println("YOU DIED! GAME OVER!!!");
        }


    }

    public void printHowManyCollectInfo() {
        System.out.println("--------------------");
        System.out.println("Collected items: " + this.getCharacter().getInventory().getAwards().size() + "/" + this.getLocation().getHowManyBattleLoc());
        System.out.println("--------------------");
    }

    public void printInfo() {
        System.out.println("");
        System.out.println("************************************************************************************************");
        System.out.println("| " + character.getCharName() +
                " | Health:" + " " + character.getHealth() +
                " | Weapon: " + character.getInventory().getWeapon().getName() +
                " | Damage:" + " " + character.getTotalDamage() +
                " | Armor:" + " " + character.getInventory().getArmor().getName() +
                " | Blocking:" + " " + character.getTotalBlocking() +
                " | Money:" + " " + character.getMoney() + " |");
        System.out.println("************************************************************************************************");
        System.out.println("");
    }

    public GameChar getCharacter() {
        return character;
    }


    public Location getLocation() {
        return location;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


}

