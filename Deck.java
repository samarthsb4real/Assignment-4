
// Purpose: Deck class for the card game
import java.util.*;

class Deck {
    ArrayList<Card> deck;

    // Constructor
    public Deck() {
        this.deck = new ArrayList<>();
    }

    // Create a deck of 52 cards
    public void createDeck() {
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // For each suit, create a card for each rank
        for (String rank : ranks) {
            for (String suit : suits) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
    }

    // Display the deck
    public void displayDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    // Select 3 random cards from the deck
    public void selectCards(int numCards) {
        shuffleDeck();
        for (int i = 0; i < 3; i++) {
            System.out.println(deck.get(i));
        }
    }
}