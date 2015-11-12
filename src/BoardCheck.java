/**
 * Creates a BoardCheck object to see if there are any Sets present
 * on the current game board.
 *
 * @author Matthew Staehely
 * @version Autumn 2015
 */
public class BoardCheck {
    private Board board;

    /**
     * Constructor for a BoardCheck object.
     * @param board the current Board
     */
    public BoardCheck(Board board){
        this.board = board;
    }

    /**
     * Checks the Board for Sets. Since each combination will be a Set
     * regardless of the order of the cards, it is never necessary to re-check
     * cards after they have been checked once. This could also be handled
     * recursively, but with such a small data set the speed won't be affected.
     *
     * @return T if a Set has been found, F otherwise.
     */
    public boolean boardCheck(){
        SetCheck check = new SetCheck();
        for(int i = 0; i < board.boardSize() - 2; i++){
            for(int j = i + 1; j < board.boardSize() - 1; j++){
                for(int k = i + 2; k < board.boardSize(); k++){
                    check = new SetCheck(board.getCard(i), board.getCard(j),
                                         board.getCard(k));
                    if(check.checkForSet()){
                        board.removeCards(i, j, k);
                        board.addCards();
                        return check.checkForSet();
                    }
                }
            }
        }
        return check.checkForSet();
    }
}
