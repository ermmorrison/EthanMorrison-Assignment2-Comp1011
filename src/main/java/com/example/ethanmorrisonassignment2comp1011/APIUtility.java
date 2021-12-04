package com.example.ethanmorrisonassignment2comp1011;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class APIUtility {


    public static Response getRecipeFromJSON(){
        Gson gson = new Gson();
        Response result = null;

        try(
                FileReader fileReader = new FileReader("apiResponse.json");
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            result = gson.fromJson(jsonReader, Response.class);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
