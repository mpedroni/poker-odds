package me.mpedroni.pokerodds;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Table {
    public Set<Card> cards;

    public Table(Card... cards) throws Exception {
        if (cards.length > 5)
            throw new Exception("Tables can have up to 5 cards");

        this.cards = new HashSet<>();
        Collections.addAll(this.cards, cards);
    }

    public boolean has(Card card) {
        return this.cards.contains(card);
    }
}
