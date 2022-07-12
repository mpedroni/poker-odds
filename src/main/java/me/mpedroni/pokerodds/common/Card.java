package me.mpedroni.pokerodds.common;

public class Card {
    public CardNumber number;
    public CardSuit suit;

    public Card(CardNumber number, CardSuit suit) {
        this.number = number;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;

        Card card = (Card) o;
        return card.number == number && card.suit == suit;
    }

    @Override
    public int hashCode() {
        return number.hashCode() + suit.hashCode();
    }
}
