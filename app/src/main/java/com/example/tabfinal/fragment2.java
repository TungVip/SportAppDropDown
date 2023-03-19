package com.example.tabfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.tabfinal.ScrollLeague.League;

public class fragment2 extends Fragment implements CustomSpinner.OnSpinnerEventsListener{
    private CustomSpinner spinnerLeague;
    private LeagueAdapter adapter;
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        spinnerLeague = view.findViewById(R.id.spinnerLeague);
        spinnerLeague.setSpinnerEventsListener(this);
        adapter = new LeagueAdapter(this.getContext(), League.getLeague());
        spinnerLeague.setAdapter(adapter);
        return view;
    }

//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        switch (position) {
//            case 0:
//                fragmentTransaction.replace(R.id.fragment_container, new PremierLeagueFragment());
//                break;
//            case 1:
//                fragmentTransaction.replace(R.id.fragment_container, new BundesligaFragment());
//                break;
//            case 2:
//                fragmentTransaction.replace(R.id.fragment_container, new LaLigaFragment());
//                break;
//        }
//
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }

//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//        // Do nothing
//    }
    @Override
    public void onPopupWindowOpened(Spinner spinner) {
        spinnerLeague.setBackground(getResources().getDrawable(R.drawable.league_custom_spinner_up));
    }

    @Override
    public void onPopupWindowClosed(Spinner spinner) {
        spinnerLeague.setBackground(getResources().getDrawable(R.drawable.league_custom_spinner));
    }
}