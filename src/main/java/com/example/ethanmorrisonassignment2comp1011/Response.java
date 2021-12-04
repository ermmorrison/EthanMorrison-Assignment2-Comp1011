package com.example.ethanmorrisonassignment2comp1011;

import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("")
    private School[] search;

    public School[] getSearch() {
        return search;
    }

    public void setSearch(School[] search) {
        this.search = search;
    }
}
