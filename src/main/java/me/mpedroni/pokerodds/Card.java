package me.mpedroni.pokerodds;

public class Card {
    private CardNumber number;
    public Card(CardNumber number) {
        this.number = number;
    }

    public CardNumber getNumber() {
        return number;
    }
}
