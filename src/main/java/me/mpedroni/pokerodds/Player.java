package me.mpedroni.pokerodds;

public class Player {
    public Hand cards;

    public Player(Card... cards) throws Exception {
        if (cards.length > 2) {
            throw new Exception("Players can have up to 2 cards");
        }
        this.cards = new Hand(cards);
    }
}
