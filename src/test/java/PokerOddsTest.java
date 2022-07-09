import me.mpedroni.pokerodds.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PokerOddsTest {
    @Test
    void TestCardNumberCreation() {
        Card card = new Card(CardNumber.ACE, CardSuit.SPADES);
        assertEquals(card.number, CardNumber.ACE);
        assertEquals(card.suit, CardSuit.SPADES);
    }
}
