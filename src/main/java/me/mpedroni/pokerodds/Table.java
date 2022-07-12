package me.mpedroni.pokerodds;

public class Table {
    public Hand cards;

    public Table(Card... cards) throws Exception {
        if (cards.length > 5)
            throw new Exception("Tables can have up to 5 cards");

        this.cards = new Hand(cards);
    }
}
