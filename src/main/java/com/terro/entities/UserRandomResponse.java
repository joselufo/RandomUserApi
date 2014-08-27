package com.terro.entities;

import java.util.ArrayList;
import java.util.List;

public class UserRandomResponse {

    private List<Result> results;

    public UserRandomResponse() {
        results = new ArrayList<Result>();
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionResult{" +
                "results=" + results +
                '}';
    }
}
