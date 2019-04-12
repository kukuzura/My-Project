package battleship.players;

import battleship.field.GameBoard;
import battleship.interfaces.Player;

public class ComputerPlayer implements Player {
    GameBoard myBoard;
    GameBoard enemyBoard;

    public ComputerPlayer() {
        myBoard = new GameBoard();
        enemyBoard = new GameBoard();
    }


    @Override
    public boolean turn() {
        return false;
    }

    public void generateBoards(){
        myBoard.generateMyBoard();
        enemyBoard.generateEnemyBoard();
    }

    public void printBoards(){
        myBoard.print();
        enemyBoard.print();
    }
}
