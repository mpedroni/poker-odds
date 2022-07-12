package me.mpedroni.pokerodds.common;

public interface Hand {
    boolean has(Card card);

    boolean empty();

    int length();
}
