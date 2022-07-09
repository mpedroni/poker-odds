import me.mpedroni.pokerodds.Card;
import me.mpedroni.pokerodds.CardNumber;
import me.mpedroni.pokerodds.CardSuit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerOddsTest {
    @Test
    void TestCardNumberCreation() {
        Card card = new Card(CardNumber.ACE, CardSuit.SPADES);
        assertEquals(card.getNumber(), CardNumber.ACE);
        assertEquals(card.suit, CardSuit.SPADES);
    }
}
