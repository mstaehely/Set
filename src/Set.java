/**
 * A Set of Cards.
 *
 * @author Matthew Staehely
 * @version Autumn 2015
 */
public class Set{
    private Card card1, card2, card3;

    /**
     * Constructor for class Set, which is a set of three cards.
     *
     * @param card1 the first card in the Set.
     * @param card2 the second card in the Set.
     * @param card3 the third card in the Set.
     */
    public Set(Card card1, Card card2, Card card3){
        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
    }

    /**
     * Returns a String representation of a Set.
     *
     * @return the String representation of a Set.
     */
    public String toString(){
        String string = "";
        string += "Card1: " + card1 + "Card2: " + card2 + "Card3: " + card3;
        return string;
    }
}
