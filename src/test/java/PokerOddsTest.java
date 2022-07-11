import me.mpedroni.pokerodds.Card;
import me.mpedroni.pokerodds.CardNumber;
import me.mpedroni.pokerodds.CardSuit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerOddsTest {
    @Test
    void TestCardCreation() {
        Card card = new Card(CardNumber.ACE, CardSuit.SPADES);
        assertEquals(card.number, CardNumber.ACE);
        assertEquals(card.suit, CardSuit.SPADES);
    }
}
