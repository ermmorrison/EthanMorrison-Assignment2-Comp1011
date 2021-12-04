package com.example.ethanmorrisonassignment2comp1011;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RecipeLookupViewController implements Initializable {

    @FXML
    private ListView<Meal> mealsListView;

    @FXML
    private TextField searchTextField;

    @FXML
    private ImageView mealImageView;

    @FXML
    void getSearchResults(ActionEvent event) throws IOException, InterruptedException {
        mealsListView.getItems().clear();
        mealsListView.getItems().addAll(APIUtility.getMealFromAPI(searchTextField.getText()).getSearch());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mealsListView.getSelectionModel().selectedItemProperty().addListener(
                (obs, old, selectedMeal) -> {
                    try {
                        mealImageView.setImage(new Image(selectedMeal.getThumbnail()));
                    } catch (Exception e) {
                        mealImageView.setImage(new Image(getClass().getResourceAsStream("image-not-found.png")));
                    }
                }
        );
    }
}

