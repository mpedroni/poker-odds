package me.mpedroni.pokerodds.holdem;

import me.mpedroni.pokerodds.common.Hand;

public class HandRankingOdds {
    private final Hand hand;

    public HandRankingOdds(Hand hand) {
        this.hand = hand;
    }

    public float pair() {
        return 1;
    }
}
