package me.mpedroni.pokerodds;

public class Card {
    private CardNumber number;
    public CardSuit suit;
    public Card(CardNumber number, CardSuit suit) {
        this.number = number;
        this.suit = suit;
    }

    public CardNumber getNumber() {
        return number;
    }
}
