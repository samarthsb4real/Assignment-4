class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Create the Deck of cards:");
        deck.createDeck();
        System.out.println("Display the Deck of cards:");
        System.out.println("Shuffle the Deck of cards:");
        deck.shuffleDeck();

        // Select 3 random cards from the deck
        System.out.println("\nSelect 3 cards from the Deck:");
        deck.selectCards(3);
    }
}