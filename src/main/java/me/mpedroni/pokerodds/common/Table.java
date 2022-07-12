package me.mpedroni.pokerodds.common;

public class Table {
    public Hand cards;

    public Table(Hand hand) throws Exception {
        if (hand.length() > 5)
            throw new Exception("Tables can have up to 5 cards");

        this.cards = hand;
    }
}
