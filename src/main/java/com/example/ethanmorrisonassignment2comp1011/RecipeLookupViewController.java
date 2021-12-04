package com.example.ethanmorrisonassignment2comp1011;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class RecipeLookupViewController {

    @FXML
    private ListView<Meal> mealsListView;

    @FXML
    private TextField searchTextField;

    @FXML
    private ImageView mealImageView;

    @FXML
    void getSearchResults(ActionEvent event) {
        mealsListView.getItems().addAll(APIUtility.getRecipeFromJSON().getSearch());

    }

}

