package com.company;

public class PlayerCommands {
    private Player player;

    public PlayerCommands(Player player) {
        this.player = player;
    }

    //instead of doing 3 diff ones for each item, create MagicItem that can pass in either
    //a staff, wand or scroll
    public void castSpellCommand(MagicItem magicItem) {
        if (player.isSpellCaster()) {
            magicItem.castSpell();
        }
        //we don't know if they are using a wand, staff or scroll so you make a method for each
        //only do something if player is a spell caster
        // if not a spell caster, it does nothing
//    public void castSpellCommand(Wand wand) {
//        if (player.isSpellCaster()) {
//            wand.castSpell();
//        }
//    }
//
//    public void castSpellCommand(Staff staff) {
//        if (player.isSpellCaster()) {
//            staff.castSpell();
//        }
//    }
//
//    public void castSpellCommand(Scroll scroll) {
//        if (player.isSpellCaster()) {
//            scroll.castSpell();
//        }
    }
}
