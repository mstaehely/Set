import java.util.LinkedList;
import java.util.Random;

/**
 * Creates a deck to play a game of Set. As there are 81 possible combinations
 * (three possibilities for four attributes is 3^4 = 81), the deck will consist
 * of 81 discrete cards.
 *
 * @author Matthew Staehely
 * @version Autumn 2015
 */
public class Deck extends LinkedList<Card> {

    /**
     * Constructor for a new deck of cards. Takes no parameters.
     */
    public Deck() {
        makeDeck();
        shuffleDeck();
    }

    /**
     * Makes a new deck. Though it consists of four nested loops, the size of
     * the input being constant means this won't be costly in terms of running
     * time. For a larger input set, it might be worthwhile to perform this
     * recursively.
     */
    private void makeDeck() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    for (int l = 0; l <= 2; l++) {
                        this.add(new Card(i, j, k, l));
                    }
                }
            }
        }
    }

    /**
     * "Shuffles" the deck by randomly selecting a card from 0 to the current
     * length of the deck, then adds it to a placeholder deck. The original deck
     * is then orphaned and replaced by the new one, and will be cleaned up by
     * Java's garbage collector.
     */
    private void shuffleDeck() {
        LinkedList new_deck = new LinkedList<Card>();
        Random rng = new Random();
        for (int i = 81; i <= 0; i--) {
            new_deck.add(this.remove(rng.nextInt(i)));
        }
        this.clear();
        for(int i = 0; i < new_deck.size(); i++){
            this.add((Card)new_deck.pop());
        }
    }
}
