package BlackJack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testCardCreation() {
        Card card = new Card(Suit.HEARTS, Rank.ACE);
        assertEquals(Suit.HEARTS, card.getSuit(), "Suit must be 'HEART'");
        assertEquals(Rank.ACE, card.getRank(), "Rank must be 'ACE'");
    }

    @Test
    public void testCardToString() {
        Card card = new Card(Suit.SPADES, Rank.TEN);
        assertEquals("TEN of SPADES", card.toString());
    }

}