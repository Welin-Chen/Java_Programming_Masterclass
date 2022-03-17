import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer Pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<FootballPlayer> adeliadeCrows = new Team<>("Adeliade Crows");
        adeliadeCrows.addPlayer(joe);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(Pat);

        System.out.println(adeliadeCrows.numPlayers());

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adeliadeCrows, 3, 8);

        adeliadeCrows.matchResult(fremantle, 2, 1);
        // adeliadeCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adeliadeCrows.getName() + ": " + adeliadeCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adeliadeCrows.compareTo(melbourne));
        System.out.println(adeliadeCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adeliadeCrows));
        System.out.println(melbourne.compareTo(fremantle));
        // System.out.println("a".compareTo("b"));
        // System.out.println("1".compareTo("2"));
        // System.out.println("2".compareTo("1"));

        // ArrayList<Team> team = new ArrayList<>();
        // team.add(adeliadeCrows);
        // Collections.sort(team);
    }
}
