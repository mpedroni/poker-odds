package me.mpedroni.pokerodds.common;

public class Player {
    public Hand cards;

    public Player(Hand hand) throws Exception {
        if (hand.length() > 2)
            throw new Exception("Players can have up to 2 cards");

        this.cards = hand;
    }
}
