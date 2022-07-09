import me.mpedroni.pokerodds.Card;
import me.mpedroni.pokerodds.CardNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerOddsTest {
    @Test
    void TestCardNumberBounds() {
        Card card = new Card(CardNumber.ACE);
        assertEquals(card.getNumber(), CardNumber.ACE);
    }
}
