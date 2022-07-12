import me.mpedroni.pokerodds.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerOddsTest {
    @Test
    void TestCardWithNumberAndSuit() {
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
    void TestPlayerCanHaveUpTwoCards() throws Exception {
        Card aceOfDiamonds = new Card(CardNumber.ACE, CardSuit.DIAMONDS);
        Card aceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);
        Player player = new Player(aceOfDiamonds, aceOfSpades);
        assertTrue(player.has(aceOfDiamonds));
        assertTrue(player.has(aceOfSpades));
    }

    @Test
    void TestPlayerCanHaveNoCards() throws Exception {
        Player player = new Player();
        assertTrue(player.cards.isEmpty());
    }

    @Test
    void TestPlayerCannotHaveMoreThanTwoCards() {
        Card aceOfDiamonds = new Card(CardNumber.ACE, CardSuit.DIAMONDS);
        Card aceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);
        Card aceOfHearts = new Card(CardNumber.ACE, CardSuit.HEARTS);
        Exception exception = assertThrows(Exception.class, () -> new Player(aceOfDiamonds, aceOfSpades, aceOfHearts));
        assertEquals(exception.getMessage(), "Players can have up to 2 cards");
    }

    @Test
    void TestTableCanHaveUpToFiveCards() throws Exception {
        Card aceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);
        Card aceOfHearts = new Card(CardNumber.ACE, CardSuit.HEARTS);
        Card aceOfDiamonds = new Card(CardNumber.ACE, CardSuit.DIAMONDS);
        Card aceOfClubs = new Card(CardNumber.ACE, CardSuit.CLUBS);
        Card kingOfSpades = new Card(CardNumber.KING, CardSuit.SPADES);

        Table table = new Table(aceOfSpades, aceOfHearts, aceOfDiamonds, aceOfClubs, kingOfSpades);

        assertTrue(table.has(aceOfSpades));
        assertTrue(table.has(aceOfHearts));
        assertTrue(table.has(aceOfDiamonds));
        assertTrue(table.has(aceOfClubs));
        assertTrue(table.has(kingOfSpades));
    }

    @Test
    void TestTableCannotHaveMoreThanFiveCards() {
        Card aceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);
        Card aceOfHearts = new Card(CardNumber.ACE, CardSuit.HEARTS);
        Card aceOfDiamonds = new Card(CardNumber.ACE, CardSuit.DIAMONDS);
        Card aceOfClubs = new Card(CardNumber.ACE, CardSuit.CLUBS);
        Card kingOfSpades = new Card(CardNumber.KING, CardSuit.SPADES);
        Card kingOfDiamonds = new Card(CardNumber.KING, CardSuit.DIAMONDS);

        Exception exception = assertThrows(Exception.class, () -> new Table(aceOfSpades, aceOfHearts, aceOfDiamonds, aceOfClubs, kingOfSpades, kingOfDiamonds));
        assertEquals(exception.getMessage(), "Tables can have up to 5 cards");
    }

    @Test
    void TestTableCanHaveZeroCards() throws Exception {
        Table table = new Table();
        assertTrue(table.cards.isEmpty());
    }
}
