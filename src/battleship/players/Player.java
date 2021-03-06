package battleship.players;

import battleship.states.TurnState;

public interface Player {

    boolean turn(Player player);

    TurnState checkDamage(int x, int y);

}
