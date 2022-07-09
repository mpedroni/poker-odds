import me.mpedroni.pokerodds.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerOddsTest {
    @Test
    void TestCardNumberBounds() throws Exception {
        Card card = new Card("A");

        Throwable exception = assertThrows(Exception.class, () -> new Card("0"));
        assertEquals(card.getNumber(), "A");
    }
}
