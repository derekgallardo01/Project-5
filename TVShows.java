// TV Show Object

public class TVShows
{

// TVShow Properties 

    String name;
    int yearPremired;
    int numberOfSeasons;
    int numberOfEpisodes;
    String network;
    String genre;
    String maleLead;
    String femaleLead;

// TV Show Constructor

    TVShows(String name, int yearPremired, int numberOfSeasons, int numberOfEpisodes, String network, String genre, String maleLead, String femaleLead)
    {
        this.name=name;
        this.yearPremired=yearPremired;
        this.numberOfSeasons=numberOfSeasons;
        this.numberOfEpisodes=numberOfEpisodes;
        this.network=network;
        this.genre=genre;
        this.maleLead=maleLead;
        this.femaleLead=femaleLead;
    }
}