package com.example.tabfinal;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.tabfinal.League.Bundesliga;
import com.example.tabfinal.League.LaLiga;
import com.example.tabfinal.League.PremierLeague;
import com.example.tabfinal.League.SerieA;
import com.example.tabfinal.ScrollLeague.League;

import java.util.ArrayList;

public class fragment2 extends Fragment implements CustomSpinner.OnSpinnerEventsListener{
    private CustomSpinner spinnerLeague;
    private LeagueAdapter adapter;
    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        selectFragment(new PremierLeague());
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        spinnerLeague = view.findViewById(R.id.spinnerLeague);
        spinnerLeague.setSpinnerEventsListener(this);
        adapter = new LeagueAdapter(this.getContext(), League.getLeague());
        spinnerLeague.setAdapter(adapter);
        spinnerLeague.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        selectFragment(new PremierLeague());
                        break;
                    case 1:
                        selectFragment(new Bundesliga());
                        break;
                    case 2:
                        selectFragment(new LaLiga());
                        break;
                    case 3:
                        selectFragment(new SerieA());
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return view;
    }




    private void selectFragment(Fragment fragment) {
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }


    @Override
    public void onPopupWindowOpened(Spinner spinner) {
        spinnerLeague.setBackground(getResources().getDrawable(R.drawable.league_custom_spinner_up));
    }

    @Override
    public void onPopupWindowClosed(Spinner spinner) {
        spinnerLeague.setBackground(getResources().getDrawable(R.drawable.league_custom_spinner));
    }


}