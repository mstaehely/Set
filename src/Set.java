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

    public String toString(){
        String string = "";
        string += "Card1:\n" + card1 + "Card2:\n" + card2 + "Card3:" + card3;
        return string;
    }
}
