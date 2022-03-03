package com.company;

public class Main {

    public static void main(String[] args) {
	Player player = new Player(true);
    PlayerCommands playerCommands = new PlayerCommands(player);
    Wand myWand = new Wand();
    playerCommands.castSpellCommand(myWand);


    }
}
