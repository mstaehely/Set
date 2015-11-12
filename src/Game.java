import java.util.LinkedList;

/**
 * Plays a game of Set.
 *
 * @author Matthew Staehely
 * @version Autumn 2015
 */
public class Game {
    private Board game_board;
    private Deck game_deck;
    private LinkedList<Set> sets;
    private BoardCheck check;


    public Game(){
        this.game_deck = new Deck();
        this.sets = new LinkedList<Set>();
        this.game_board = new Board(game_deck);
        this.check = new BoardCheck(game_board);
        while(game_deck.size() >= 0 || check.boardCheck()) {
            check.boardCheck();
        }
        sets = game_board.getSet();
        for(int i = 0; i < sets.size(); i++){
            System.out.println(sets.get(i));
        }
    }

    public static void main(String[] args){
        Game game = new Game();
    }
}
