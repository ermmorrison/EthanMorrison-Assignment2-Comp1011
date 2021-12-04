package com.example.ethanmorrisonassignment2comp1011;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class School {

    @SerializedName("state-province")
    private String province;

    @SerializedName("country")
    private String country;

    @SerializedName("web_pages")
    private Array webPages;

    @SerializedName("name")
    private String name;

    @SerializedName("alpha_two_code")
    private String code;

    @SerializedName("domains")
    private Array domains;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Array getWebPages() {
        return webPages;
    }

    public void setWebPages(Array webPages) {
        this.webPages = webPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Array getDomains() {
        return domains;
    }

    public void setDomains(Array domains) {
        this.domains = domains;
    }
}
