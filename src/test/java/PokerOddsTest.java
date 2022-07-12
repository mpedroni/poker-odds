import me.mpedroni.pokerodds.Card;
import me.mpedroni.pokerodds.CardNumber;
import me.mpedroni.pokerodds.CardSuit;
import me.mpedroni.pokerodds.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerOddsTest {
    @Test
    void TestCardCreate() {
        Card card = new Card(CardNumber.ACE, CardSuit.SPADES);
        assertEquals(card.number, CardNumber.ACE);
        assertEquals(card.suit, CardSuit.SPADES);
    }

    @Test
    void TestCardEquality() {
        Card aceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);
        Card anotherAceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);

        assertEquals(aceOfSpades, aceOfSpades);
        assertEquals(aceOfSpades, anotherAceOfSpades);
        assertNotEquals(aceOfSpades, null);
        assertNotEquals(aceOfSpades, new Object());
    }

    @Test
    void TestPlayerCreate() throws Exception {
        Card aceOfDiamonds = new Card(CardNumber.ACE, CardSuit.DIAMONDS);
        Card aceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);
        Player player = new Player(aceOfDiamonds, aceOfSpades);
        assertTrue(player.has(aceOfDiamonds));
        assertTrue(player.has(aceOfSpades));
    }

    @Test
    void TestPlayerCreateWithZeroCards() {
        Player player = new Player();
        assertTrue(player.cards.isEmpty());
    }

    @Test
    void TestPlayerCreateWithMoreThanCardsLimit() {
        Card aceOfDiamonds = new Card(CardNumber.ACE, CardSuit.DIAMONDS);
        Card aceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);
        Card aceOfHearts = new Card(CardNumber.ACE, CardSuit.HEARTS);
        Exception exception = assertThrows(Exception.class, () -> new Player(aceOfDiamonds, aceOfSpades, aceOfHearts));
        assertEquals(exception.getMessage(), "Players can have up to 2 cards");
    }
}
