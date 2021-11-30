package com.example.td6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.td6.adapter.ListRepoAdapter;
import com.example.td6.model.Repo;

import java.util.ArrayList;
import java.util.List;

public class ListRepoActivity extends AppCompatActivity {

    public List<Repo> repos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_repo);

        RecyclerView recyclerView = findViewById(R.id.list_repo);
        Intent intent = getIntent();
        repos = (ArrayList<Repo>)intent.getSerializableExtra("repos");

        ListRepoAdapter repoAdapter = new ListRepoAdapter(repos);
        recyclerView.setAdapter(repoAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}