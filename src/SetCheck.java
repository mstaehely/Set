/**
 * Creates an object to determine if a group of three cards comprises a Set.
 * A Set is created when each of the four values (color, shape, shade, number)
 * are the same or different for all of the cards. For example, if all of the
 * cards have the same color, different shapes, different shades, and the same
 * number of shapes, those would represent a set. If two cards have similar
 * properties but a third is different, then there is no set.
 *
 * @author Matthew Staehely
 * @version Autumn 2015
 */
public class SetCheck {
    private Card card1, card2, card3;

    /**
     * Constructor of a SetCheck object. Creates deep copies of each Card to
     * ensure no data is changed or lost.
     *
     * @param card1 the first card to be compared.
     * @param card2 the second card to be compared.
     * @param card3 the third card to be compared.
     */
    public SetCheck(Card card1, Card card2, Card card3){
        this.card1 = new Card(card1.getColor(), card1.getShape(),
                              card1.getShading(), card2.getNumber());
        this.card2 = new Card(card2.getColor(), card2.getShape(),
                              card2.getShading(), card2.getNumber());
        this.card3 = new Card(card3.getColor(), card3.getShape(),
                              card3.getShading(), card3.getNumber());
    }

    public SetCheck(){
        this.card1 = null;
        this.card2 = null;
        this.card3 = null;
    }
    /**
     * Compares the three cards to see if they make a set. The logic is as
     * follows: first is the check for parity; if card one and card two have
     * the same value, then if card three has the same as two, it must also
     * have the same as one. Otherwise, all three must be checked to see if they
     * are different. This could be condensed logically but would not be as easy
     * to read.
     *
     * @return T if the three cards are a set, F otherwise.
     */
    public boolean checkForSet() {
        boolean color_set, shape_set, shading_set, number_set;
        if (card1 == null || card2 == null || card3 == null) {
            return false;
        } else {
            color_set = ((card1.getColor() == card2.getColor() &&
                          card2.getColor() == card3.getColor()) ||
                         (card1.getColor() != card2.getColor() &&
                          card2.getColor() != card3.getColor() &&
                          card1.getColor() != card3.getColor()));
            shape_set = ((card1.getShape() == card2.getShape() &&
                          card2.getShape() == card3.getShape()) ||
                         (card1.getShape() != card2.getShape() &&
                          card2.getShape() != card3.getShape() &&
                          card1.getShape() != card3.getShape()));
            shading_set = ((card1.getShading() == card2.getShading() &&
                            card2.getShading() == card3.getShading()) ||
                           (card1.getShading() != card2.getShading() &&
                            card2.getShading() != card3.getShading() &&
                            card1.getShading() != card3.getShading()));
            number_set = ((card1.getNumber() == card2.getNumber() &&
                           card2.getNumber() == card3.getNumber()) ||
                          (card1.getNumber() != card2.getNumber() &&
                           card2.getNumber() != card3.getNumber() &&
                           card1.getNumber() != card3.getNumber()));

            return color_set && shape_set && shading_set && number_set;
        }
    }
}
