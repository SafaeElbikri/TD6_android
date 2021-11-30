package com.example.td6.model;

import java.io.Serializable;
import java.util.List;

public class RepoItem implements Serializable {

    private double total_count;
    private boolean incomplete_results;
    private List<Repo> items;

    public RepoItem(){

    }

    public RepoItem(double total_count, boolean incomplete_results, List<Repo> repos) {
        this.total_count = total_count;
        this.incomplete_results = incomplete_results;
        this.items = repos;
    }

    public double getTotal_count() {
        return total_count;
    }

    public void setTotal_count(double total_count) {
        this.total_count = total_count;
    }

    public boolean isIncomplete_results() {
        return incomplete_results;
    }

    public void setIncomplete_results(boolean incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    public List<Repo> getRepos() {
        return items;
    }

    public void setRepos(List<Repo> repos) {
        this.items = repos;
    }
}
