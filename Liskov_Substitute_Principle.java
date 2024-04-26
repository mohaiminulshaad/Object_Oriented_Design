/**
 * @author Mohaiminul Islam Shaad; Student ID : 220201
 * @version 2.0
 * @since 2024-04-22
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Interface representing a football entity.
 */
interface FootballEntity {
    /**
     * Gets the name of the football entity.
     *
     * @return The name of the football entity.
     */
    String getName();
}

/**
 * Player class representing a football player.
 */
class Player implements FootballEntity {
    private String name;
    private int jerseyNumber;

    /**
     * Creates a new Player instance with the given name and jersey number.
     *
     * @param name         The name of the player.
     * @param jerseyNumber The jersey number of the player.
     */
    public Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets the jersey number of the player.
     *
     * @return The jersey number of the player.
     */
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
class Team implements FootballEntity {
    private String name;
    private List<Player> players;

    /**
     * Creates a new Team instance with the given name.
     *
     * @param name The name of the team.
     */
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    /**
     * Adds a player to the team.
     *
     * @param player The player to add to the team.
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Gets the list of players in the team.
     *
     * @return The list of players in the team.
     */
    public List<Player> getPlayers() {
        return players;
    }

    @Override
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
    private FootballEntity homeTeam;
    private FootballEntity awayTeam;
    private String result;

    /**
     * Creates a new Match instance with the given home and away teams.
     *
     * @param homeTeam The home team for the match.
     * @param awayTeam The away team for the match.
     */
    public Match(FootballEntity homeTeam, FootballEntity awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    /**
     * Sets the result of the match.
     *
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
 * Main class to demonstrate the football entities and a match.
 */
public class Liskov_Substitute_Principle {
    /**
     * Main method to create football entities, a match, and display the results.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating a Player object
        FootballEntity player = new Player("Lionel Messi", 10);

        Team barcelona = new Team("Barcelona");
        barcelona.addPlayer((Player) player); // Casting to Player type

        Team realMadrid = new Team("Real Madrid");
        realMadrid.addPlayer(new Player("Cristiano Ronaldo", 7)); // Directly adding a Player

        Match match = new Match(barcelona, realMadrid);
        match.setResult("2-3");

        System.out.println(match);
        System.out.println(barcelona);
        System.out.println(realMadrid);
    }
}
