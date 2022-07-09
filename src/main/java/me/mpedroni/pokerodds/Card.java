package me.mpedroni.pokerodds;

public class Card {
    private String number;
    public Card(String number) throws Exception {
        if (number != "A")
            throw new Exception("Invalid card number");

        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
