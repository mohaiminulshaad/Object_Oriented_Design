/**
 * @author Mohaiminul Islam Shaad; Student ID : 220201
 * @version 1.0
 * @since 2024-04-22
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Player class representing a football player.
 */
class Player {
    private String name;
    private int jerseyNumber;

    /**
     * Constructor to create a new Player object.
     * @param name The name of the player.
     * @param jerseyNumber The jersey number of the player.
     */
    public Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @Override
    public String toString() {
        return "Best Player: " + name + " (Jersey Number: " + jerseyNumber + ")";
    }
}

/**
 * Team class representing a football team.
 */
class Team {
    private String name;
    private List<Player> players;

    /**
     * Constructor to create a new Team object.
     * @param name The name of the team.
     */
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    /**
     * Add a player to the team.
     * @param player The player to be added.
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team: ").append(name).append("\n");
        for (Player player : players) {
            sb.append(player).append("\n");
        }
        return sb.toString();
    }
}

/**
 * Match class representing a football match between two teams.
 */
class Match {
    private Team homeTeam;
    private Team awayTeam;
    private String result;

    /**
     * Constructor to create a new Match object.
     * @param homeTeam The home team.
     * @param awayTeam The away team.
     */
    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    /**
     * Set the result of the match.
     * @param result The result of the match.
     */
    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Match Result: " + homeTeam.getName() + " vs " + awayTeam.getName() + " : " + result + "\n";
    }
}

/**
 * Main class to test the football club system.
 */
public class Liskov_Substitute_Principle {
    public static void main(String[] args) {
        // Create players
        Player player1 = new Player("Lionel Messi", 10);
        Player player2 = new Player("Cristiano Ronaldo", 7);

        // Create teams and add players
        Team barcelona = new Team("Barcelona");
        barcelona.addPlayer(player1);

        Team realMadrid = new Team("Real Madrid");
        realMadrid.addPlayer(player2);

        // Create a match between two teams
        Match match = new Match(barcelona, realMadrid);
        match.setResult("2-3"); // Example result

        // Print match result
        System.out.println(match);

        // Print team information
        System.out.println(barcelona);
        System.out.println(realMadrid);
    }
}
