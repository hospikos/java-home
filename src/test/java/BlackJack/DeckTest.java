package BlackJack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    private Deck deck;

    @BeforeEach
    public void setUp() {
        deck = new Deck();
    }

    @Test
    void deckInitialization() {
        assertEquals(52, deck.size(), "Deck must contain 52 cards");
    }

    @Test
    void drawCard() {
        Card card = deck.drawCard();
        assertEquals(51, deck.size(), "Deck must contain 51 cards after draw");
    }

    @Test
    void shuffle() {
        List<Card> cardsBeforeShuffle = new ArrayList<>(deck.cards());
        deck.shuffle();
        List<Card> cardsAfterShuffle = new ArrayList<>(deck.cards());
        assertTrue(cardsBeforeShuffle.containsAll(cardsAfterShuffle) && cardsAfterShuffle.containsAll(cardsBeforeShuffle), "The deck before shuffle is different from the deck after shuffle");
        assertFalse(cardsBeforeShuffle.equals(cardsAfterShuffle), "The deck is not shuffled");
    }

    @Test
    public void testSize() {
        assertEquals(52, deck.size());
        deck.drawCard();
        assertEquals(51, deck.size());
        deck.drawCard();
        assertEquals(50, deck.size());
    }

}