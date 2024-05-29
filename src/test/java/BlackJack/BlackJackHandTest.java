package BlackJack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlackJackHandTest {
    private BlackJackHand hand;

    @BeforeEach
    public void setUp() {
        hand = new BlackJackHand();
    }

    @Test
    void getCards() {
        Card card = new Card(Suit.HEARTS, Rank.FIVE);
        hand.addCard(card);
        assertEquals(1, hand.getCards().size(), "Hand should contain 1 card after adding a single card");
        assertEquals(card, hand.getCards().getFirst(), "Hand should contain 1 card after adding a single card");
    }

    @Test
    public void testGetValueNoAces() {
        hand.addCard(new Card(Suit.HEARTS, Rank.FIVE));
        hand.addCard(new Card(Suit.SPADES, Rank.TEN));
        assertEquals(15, hand.getValue(), "Hand must be equal 15");
    }

    @Test
    public void testGetValueWithAces() {
        hand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        hand.addCard(new Card(Suit.SPADES, Rank.TEN));
        hand.addCard(new Card(Suit.CLUBS, Rank.FIVE));
        assertEquals(16, hand.getValue(), "Hand must be equal 16");
    }

    @Test
    void isBusted() {
        hand.addCard(new Card(Suit.HEARTS, Rank.TEN));
        hand.addCard(new Card(Suit.SPADES, Rank.TEN));
        hand.addCard(new Card(Suit.CLUBS, Rank.FIVE));
        assertTrue(hand.isBusted(), "Hand should be busted");
    }

    @Test
    void isNotBusted() {
        hand.addCard(new Card(Suit.HEARTS, Rank.TEN));
        hand.addCard(new Card(Suit.SPADES, Rank.TEN));
        assertFalse(hand.isBusted(), "Hand should be not busted");
    }

    @Test
    void isBlackJack() {
        hand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        hand.addCard(new Card(Suit.SPADES, Rank.TEN));
        assertTrue(hand.isBlackJack(), "Hand should be a black jack");
    }

    @Test
    void isNotBlackJack() {
        hand.addCard(new Card(Suit.HEARTS, Rank.TEN));
        hand.addCard(new Card(Suit.SPADES, Rank.TEN));
        hand.addCard(new Card(Suit.HEARTS, Rank.EIGHT));
        assertFalse(hand.isBlackJack(), "Hand should be a not black jack");
    }

}