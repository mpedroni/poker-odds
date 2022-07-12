package me.mpedroni.pokerodds;

public class HandRankingOdds {
    private final Hand hand;

    public HandRankingOdds(Card... cards) {
        this.hand = new Hand(cards);
    }

    public float pair() {
        return 1;
    }
}
