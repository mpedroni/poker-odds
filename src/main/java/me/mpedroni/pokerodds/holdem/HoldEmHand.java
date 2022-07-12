package me.mpedroni.pokerodds.holdem;

import me.mpedroni.pokerodds.common.Card;
import me.mpedroni.pokerodds.common.Hand;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HoldEmHand implements Hand {
    private final Set<Card> cards;

    public HoldEmHand(Card... cards) {
        this.cards = new HashSet<>();
        Collections.addAll(this.cards, cards);
    }

    public boolean has(Card card) {
        return this.cards.contains(card);
    }

    public boolean empty() {
        return length() == 0;
    }

    @Override
    public int length() {
        return cards.size();
    }
}
