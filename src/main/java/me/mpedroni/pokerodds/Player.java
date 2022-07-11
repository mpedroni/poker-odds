package me.mpedroni.pokerodds;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Player {
    public Set<Card> cards;

    public Player(Card... cards) throws Exception {
        if (cards.length > 2) {
            throw new Exception("Players can have up to 2 cards");
        }
        this.cards = new HashSet<>();
        Collections.addAll(this.cards, cards);
        System.out.println(this.cards);
    }

    public boolean has(Card card) {
        return cards.contains(card);
    }
}
