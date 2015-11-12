import java.util.LinkedList;

/**
 * Creates and maintains the current board of Cards.
 *
 * @author Matthew Staehely
 * @version Autumn 2015
 */
public class Board {
    private static final int CARD_DRAW = 3; // the number of cards to be drawn
    private static final int START_DRAW = 15; // number of cards at start
    private Deck deck;
    private LinkedList<Card> cards_out;
    private LinkedList<Set> sets;

    /**
     * Constructor of class Board. Takes a new deck as input and prepares the
     * board to play.
     *
     * @param deck the Deck of Cards being used for this game.
     */
    public Board(Deck deck){
        this.deck = deck;
        this.cards_out = new LinkedList<Card>();
        this.sets = new LinkedList<Set>();
        gameStart();
    }

    /**
     * Primes the board by drawing the first fifteen cards.
     */
    private void gameStart(){
        for(int i = 1; i <= START_DRAW; i++){
            cards_out.add(deck.pop());
        }
    }

    /**
     * Accesses the current state of the Board. Returns a deep copy of the
     * Board's state to preserve data. Only the Board should modify the
     * Board's state.
     *
     * @return a LinkedList representing the Board's current state.
     */
    public LinkedList<Card> showBoard(){
        LinkedList<Card> board_copy = new LinkedList<Card>();
        for(int i = 0; i < this.deck.size(); i++){
            Card copy = deck.get(i);
            board_copy.addLast(new Card(copy.getColor(), copy.getShape(),
                               copy.getShading(), copy.getNumber()));
        }
        return board_copy;
    }

    /**
     * Tells the Board that three cards need to be added to the playing
     * field, either because a Set has been found, or no Sets exist on
     * the board. If no cards are left in the Deck, no cards will be
     * drawn.
     */
    public void addCards() {
        if (this.deck.size() > 2) {
            for (int i = 0; i < CARD_DRAW; i++) {
                cards_out.add(deck.pop());
            }
        }
    }

    /**
     * Tells the Board to remove three Cards, as a Set has been found.
     * The index of each Card must be decremented because the data structure
     * will remove the Card and then left shift all remaining Cards. Cards
     * are then added back to the Board.
     *
     * @param card1 the first Card to be removed
     * @param card2 the second Card to be removed.
     * @param card3 the third Card to be removed.
     */
    public void removeCards(int card1, int card2, int card3){
        sets.add(new Set(cards_out.remove(card1), cards_out.remove(card2 - 1),
                          cards_out.remove(card3 -2)));
        addCards();
    }

    public LinkedList<Set> getSet(){
        return this.sets;
    }

    /**
     * Reveals the number of cards left on the board.
     *
     * @return the number of cards left on the board.
     */
    public int boardSize(){
        return this.cards_out.size();
    }

    /**
     * Passes a copy of a Card being examined.
     *
     * @return a deep copy of a card being examined.
     */
    public Card getCard(int i) {
        Card card_copy = new Card(cards_out.get(i).getColor(),
                cards_out.get(i).getShape(),
                cards_out.get(i).getShading(),
                cards_out.get(i).getNumber());
        return card_copy;
    }
}