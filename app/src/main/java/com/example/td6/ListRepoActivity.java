package com.example.td6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.td6.adapter.ListRepoAdapter;
import com.example.td6.model.RepoItem;

public class ListRepoActivity extends AppCompatActivity {

    public RepoItem repo = new RepoItem();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_repo);

        RecyclerView recyclerView = findViewById(R.id.list_repo);
        if(getIntent().getExtras() != null) {
            repo = (RepoItem) getIntent().getSerializableExtra("repo");
        }

        ListRepoAdapter repoAdapter = new ListRepoAdapter(repo.getRepos());
        recyclerView.setAdapter(repoAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}