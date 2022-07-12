import me.mpedroni.pokerodds.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerOddsTest {
    Card aceOfSpades;
    Card aceOfDiamonds;
    Card aceOfHearts;
    Card aceOfClubs;
    Card kingOfSpades;
    Card kingOfDiamonds;

    @BeforeEach
    void setUp() {
        aceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);
        aceOfDiamonds = new Card(CardNumber.ACE, CardSuit.DIAMONDS);
        aceOfHearts = new Card(CardNumber.ACE, CardSuit.HEARTS);
        aceOfClubs = new Card(CardNumber.ACE, CardSuit.CLUBS);
        kingOfSpades = new Card(CardNumber.KING, CardSuit.SPADES);
        kingOfDiamonds = new Card(CardNumber.KING, CardSuit.DIAMONDS);
    }

    @AfterEach
    void tearDown() {
        aceOfSpades = null;
        aceOfDiamonds = null;
        aceOfHearts = null;
        aceOfClubs = null;
        kingOfSpades = null;
        kingOfDiamonds = null;
    }


    @Test
    void TestCardEquality() {
        Card anotherAceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);

        assertEquals(aceOfSpades, aceOfSpades);
        assertEquals(aceOfSpades, anotherAceOfSpades);
        assertNotEquals(aceOfSpades, null);
        assertNotEquals(aceOfSpades, new Object());
    }

    @Test
    void TestPlayerCanHaveUpTwoCards() throws Exception {
        Player player = new Player(aceOfDiamonds, aceOfSpades);

        assertTrue(player.cards.has(aceOfDiamonds));
        assertTrue(player.cards.has(aceOfSpades));
    }

    @Test
    void TestPlayerCanHaveNoCards() throws Exception {
        Player player = new Player();
        assertTrue(player.cards.empty());
    }

    @Test
    void TestPlayerCannotHaveMoreThanTwoCards() {
        Exception exception = assertThrows(Exception.class, () -> new Player(aceOfDiamonds, aceOfSpades, aceOfHearts));
        assertEquals(exception.getMessage(), "Players can have up to 2 cards");
    }

    @Test
    void TestTableCanHaveUpToFiveCards() throws Exception {
        Table table = new Table(aceOfSpades, aceOfHearts, aceOfDiamonds, aceOfClubs, kingOfSpades);

        assertTrue(table.cards.has(aceOfSpades));
        assertTrue(table.cards.has(aceOfHearts));
        assertTrue(table.cards.has(aceOfDiamonds));
        assertTrue(table.cards.has(aceOfClubs));
        assertTrue(table.cards.has(kingOfSpades));
    }

    @Test
    void TestTableCannotHaveMoreThanFiveCards() {
        Card aceOfSpades = new Card(CardNumber.ACE, CardSuit.SPADES);
        Card aceOfHearts = new Card(CardNumber.ACE, CardSuit.HEARTS);
        Card aceOfDiamonds = new Card(CardNumber.ACE, CardSuit.DIAMONDS);
        Card aceOfClubs = new Card(CardNumber.ACE, CardSuit.CLUBS);
        Card kingOfSpades = new Card(CardNumber.KING, CardSuit.SPADES);

        Exception exception = assertThrows(Exception.class, () -> new Table(aceOfSpades, aceOfHearts, aceOfDiamonds, aceOfClubs, kingOfSpades, kingOfDiamonds));
        assertEquals(exception.getMessage(), "Tables can have up to 5 cards");
    }

    @Test
    void TestTableCanHaveZeroCards() throws Exception {
        Table table = new Table();
        assertTrue(table.cards.empty());
    }

    @Test
    void TestHandCreateWithPlayerAndDeckCards() {

    }
}
