package me.mpedroni.pokerodds;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hand {
    private final Set<Card> cards;

    public Hand(Card... cards) {
        this.cards = new HashSet<>();
        Collections.addAll(this.cards, cards);
    }

    public boolean has(Card card) {
        return this.cards.contains(card);
    }

    public boolean empty() {
        return cards.isEmpty();
    }
}
