# Cards Game
This is a simple Java program that creates a deck of cards and displays them.
This project is a simple Java program that simulates a deck of cards. It includes classes to represent individual cards and the deck itself. The deck can be created and displayed using the provided methods.

## Project Structure

The project consists of the following classes:

1. **Card.java**: This class represents a single playing card with a rank and a suit. It includes:
   - Fields for `rank` and `suit`.
   - A constructor to initialize these fields.
   - A `toString` method to return a string representation of the card in the format "Rank of Suit".

2. **Deck.java**: This class represents a deck of playing cards. It includes:
   - An `ArrayList` to store the cards.
   - A constructor to initialize the deck.
   - A `createDeck` method to populate the deck with 52 cards (13 ranks in each of 4 suits).
   - A `displayDeck` method to print out all the cards in the deck.

3. **Main.java**: This class contains the `main` method, which is the entry point of the program. It:
   - Creates an instance of `Deck`.
   - Calls `createDeck` to initialize the deck.
   - Calls `displayDeck` to print the deck to the console.

## How to Run

1. Ensure you have Java installed on your system.
2. Compile the Java files using a Java compiler. For example:
   ```
   javac Card.java Deck.java Main.java
   ```
3. Run the compiled `Main` class:
   ```
   java Main
   ```

## Expected Output

When you run the program, it will display the following sequence in the console:

- A message indicating the creation of the deck.
- A complete list of 52 cards, each printed in the format "Rank of Suit".

This project serves as a simple demonstration of object-oriented programming concepts in Java, such as class design, object instantiation, and method invocation.

