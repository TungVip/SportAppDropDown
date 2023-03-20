package com.example.tabfinal.League;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabfinal.MatchAdapter;
import com.example.tabfinal.Matches;
import com.example.tabfinal.R;

import java.util.ArrayList;

public class PremierLeague extends Fragment {
    private ArrayList<Matches>matchesArrayList;
    private String[] matchesName;
    private String[] matchesOpponentName;
    private String[] matchesScore;
    private String[] matchesOpponentScore;
    private int[] matchesTeamIcon;
    private int[] matchesOpponentIcon;
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_premier_league, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialize();
        recyclerView = view.findViewById(R.id.recyclerViewPL);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        MatchAdapter matchAdapter = new MatchAdapter(getContext(),matchesArrayList);
        recyclerView.setAdapter(matchAdapter);
        matchAdapter.notifyDataSetChanged();

    }

    private void dataInitialize() {
        matchesArrayList = new ArrayList<>();
        matchesName = new String[] {
                getString(R.string.manchester_city),
                getString(R.string.manchester_united),
                getString(R.string.arsenal),
                getString(R.string.newcastle),
                getString(R.string.brighton),
                getString(R.string.liverpool),
                getString(R.string.manchester_city),
        };

        matchesOpponentName = new String[]{
                getString(R.string.manchester_city),
                getString(R.string.manchester_united),
                getString(R.string.arsenal),
                getString(R.string.newcastle),
                getString(R.string.brighton),
                getString(R.string.liverpool),
                getString(R.string.manchester_city),
        };

        matchesScore = new String[] {
                getString(R.string.one),
                getString(R.string.two),
                getString(R.string.three),
                getString(R.string.four),
                getString(R.string.five),
                getString(R.string.six),
                getString(R.string.six),
        };

        matchesOpponentScore = new String[] {
                getString(R.string.one),
                getString(R.string.two),
                getString(R.string.three),
                getString(R.string.four),
                getString(R.string.five),
                getString(R.string.six),
                getString(R.string.six),
        };

        matchesTeamIcon = new int[] {
                R.drawable.pl,
                R.drawable.laliga,
                R.drawable.bundesliga,
                R.drawable.seriea,
                R.drawable.pl,
                R.drawable.bundesliga,
                R.drawable.seriea,
        };

        matchesOpponentIcon = new int[] {
                R.drawable.laliga,
                R.drawable.bundesliga,
                R.drawable.pl,
                R.drawable.pl,
                R.drawable.seriea,
                R.drawable.laliga,
                R.drawable.seriea,
        };

        for (int i = 0; i<7; i++) {
            Matches matches = new Matches(matchesName[i],matchesOpponentName[i],matchesTeamIcon[i],matchesOpponentIcon[i],matchesScore[i],matchesOpponentScore[i]);
            matchesArrayList.add(matches);
        }

    }
}

