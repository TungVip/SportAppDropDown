package com.example.tabfinal.ScrollLeague;

import com.example.tabfinal.R;

import java.util.ArrayList;
import java.util.List;

public class League {

    public static List<LeagueIcon> getLeague() {
        List<LeagueIcon> leagueIconList = new ArrayList<>();

        LeagueIcon PL = new LeagueIcon();
        PL.setName("Premier League");
        PL.setImage(R.drawable.pl);
        leagueIconList.add(PL);

        LeagueIcon Bundesliga = new LeagueIcon();
        Bundesliga.setName("Bundesliga");
        Bundesliga.setImage(R.drawable.bundesliga);
        leagueIconList.add(Bundesliga);

        LeagueIcon LaLiga = new LeagueIcon();
        LaLiga.setName("LaLiga");
        LaLiga.setImage(R.drawable.laliga);
        leagueIconList.add(LaLiga);

        LeagueIcon SerieA = new LeagueIcon();
        SerieA.setName("Serie A");
        SerieA.setImage(R.drawable.seriea);
        leagueIconList.add(SerieA);

        return leagueIconList;


    }
}
