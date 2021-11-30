package com.example.td6.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.td6.R;
import com.example.td6.model.Repo;

import java.util.List;

public class ListRepoAdapter extends RecyclerView.Adapter<ListRepoAdapter.ViewHolder>{

    private final List<Repo> repos;

    public ListRepoAdapter(List<Repo> repos) {
        this.repos = repos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View repoView = layoutInflater.inflate(R.layout.item_repo,parent,false);
        return new ViewHolder(repoView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Repo repo = repos.get(position);
        TextView name = holder.name;
        name.setText(repo.getName());
        TextView full_name = holder.full_name;
        full_name.setText(repo.getFull_name());
        TextView html_url = holder.html_url;
        html_url.setText(repo.getHtml_url());
    }

    @Override
    public int getItemCount() {
        return repos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name;
        public TextView full_name;
        public TextView html_url;

        public ViewHolder(View itemView){
            super(itemView);

            name = itemView.findViewById(R.id.name);
            full_name =  itemView.findViewById(R.id.fullname);
            html_url =  itemView.findViewById(R.id.html_url);
        }
    }
}
