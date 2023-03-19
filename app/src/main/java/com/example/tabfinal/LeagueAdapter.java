package com.example.tabfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tabfinal.ScrollLeague.LeagueIcon;

import java.util.List;

public class LeagueAdapter extends BaseAdapter {
    private Context context;
    private List<LeagueIcon> leagueIconList;

    public LeagueAdapter(Context context, List<LeagueIcon> leagueIconList) {
        this.context = context;
        this.leagueIconList = leagueIconList;
    }


    @Override
    public int getCount() {
        return leagueIconList != null ? leagueIconList.size():0;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.item_league, viewGroup, false);
        TextView txtname = rootView.findViewById(R.id.name);
        ImageView image = rootView.findViewById(R.id.image);

        txtname.setText(leagueIconList.get(i).getName());
        image.setImageResource(leagueIconList.get(i).getImage());

        return rootView;
    }
}
