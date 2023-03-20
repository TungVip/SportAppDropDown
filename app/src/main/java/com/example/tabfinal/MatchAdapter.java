package com.example.tabfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchHolder> {
    Context context;
    ArrayList<Matches> matchesArrayList;

    public MatchAdapter(Context context, ArrayList<Matches>matchesArrayList) {
        this.context = context;
        this.matchesArrayList = matchesArrayList;

    }


    @NonNull
    @Override
    public MatchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_match,parent,false);

        return new MatchHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchHolder holder, int position) {
        Matches matches = matchesArrayList.get(position);
        holder.image_team1.setImageResource(matches.teamImage);
        holder.image_team2.setImageResource(matches.opponentTeamImage);
        holder.name_team1.setText(matches.name);
        holder.name_team2.setText(matches.opponent_name);
        holder.score_team1.setText(matches.score);
        holder.score_team2.setText(matches.opponentScore);

    }

    @Override
    public int getItemCount() {
        return matchesArrayList.size();
    }

    public static class MatchHolder extends RecyclerView.ViewHolder {
        ShapeableImageView image_team1;
        ShapeableImageView image_team2;
        TextView name_team1;
        TextView name_team2;
        TextView score_team1;
        TextView score_team2;
        public MatchHolder(@NonNull View itemView) {
            super(itemView);
            image_team1 = itemView.findViewById(R.id.image_team1);
            image_team2 = itemView.findViewById(R.id.image_team2);
            name_team1 = itemView.findViewById(R.id.name_team1);
            name_team2 = itemView.findViewById(R.id.name_team2);
            score_team1 = itemView.findViewById(R.id.score_team1);
            score_team2 = itemView.findViewById(R.id.score_team2);


        }
    }
}
