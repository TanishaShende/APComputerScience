package lab0111.FantasySports;

import java.util.ArrayList;

/**
 * Created by David on 2/5/2016.
 */

public interface Gambler {
    public Bet gamble(Team team1, Team team2);

    public double getMoneyHave();

    public ArrayList getBetRecord();

    public void win(Bet b);

    public void lose(Bet b);
}
