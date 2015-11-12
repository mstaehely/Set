/**
 * Representation of a single card from a Set deck.
 *
 * @author Matthew Staehely
 * @version Autumn 2015
 */
public class Card{
    private int color, shape, shading, number;

    /**
     * Constructor for a card object. Expects four arguments.
     *
     * @param color the color on the card.
     * @param shape the shapes on the card.
     * @param shading the shading of the card's shapes.
     * @param number the number of shapes present.
     */
    public Card(int color, int shape, int shading, int number){
        setColor(color);
        setShape(shape);
        setShading(shading);
        setNumber(number);
    }

    /**
     * Sets the color of the card being made.
     * @param color the color of the card. 0 = red, 1 = green, 2 = purple.
     */
    private void setColor(int color){
        this.color = color;
    }

    /**
     * Accesses the color of this Card's shape/shapes.
     *
     * @return the color of the shape or shapes on this Card.
     */
    public int getColor(){
        return this.color;
    }

    /**
     * Sets the shape of the card being made.
     *
     * @param shape the shape on the card. 0 = diamond, 1 = squiggle, 2 = oval.
     */
    private void setShape(int shape){
        this.shape = shape;
    }

    /**
     * Accesses this Card's shape.
     * @return this Card's shape.
     */
    public int getShape(){
        return this.shape;
    }

    /**
     * Sets the shading pattern on the card being made.
     *
     * @param shading the shade on the card. 0 = solid, 1 = empty, 2 = striped.
     */
    private void setShading(int shading){
        this.shading = shading;
    }

    /**
     * Accesses the shading of this Card's shapes.
     * @return the shading of this Card's shapes.
     */
    public int getShading(){
        return this.shading;
    }

    /**
     * Sets the number of shapes on the card.
     *
     * @param number the number of shapes on the card. 0 = 1, 1 = 2, 2 = 3.
     */
    private void setNumber(int number){
        this.number = number;
    }

    /**
     * Accesses the number of shapes on this Card.
     * @return the number of shapes on this Card.
     */
    public int getNumber(){
        return this.number;
    }

    public String toString(){
        String string = "";
        switch (this.getColor()){
            case 0: string += "Red, ";
                break;
            case 1: string += "Green, ";
                break;
            case 2: string += "Purple, ";
                break;
        }
        switch (this.getShape()) {
            case 0: string += "Diamond, ";
                break;
            case 1: string += "Squiggle, ";
                break;
            case 2: string += "Oval, ";
                break;
        }
        switch (this.getShading()) {
            case 0: string += "Solid, ";
                break;
            case 1: string += "Empty, ";
                break;
            case 2: string += "Striped, ";
                break;
        }
        switch (this.getNumber()) {
            case 0: string += "One\n";
                break;
            case 1: string += "Two\n";
                break;
            case 2: string += "Three\n";
                break;
        }
        return string;
    }
}

