package com.witnip.guessnumber;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GuessNumberController {
    @FXML
    private Label lblGeneratedNumber;
    @FXML
    private Label lblMessage;
    @FXML
    private TextField txtGuessedNumber;
    @FXML
    private Button btnCheck;
    
    @FXML
    protected void btnCheckClick(){
        int generatedNumber = generatedNumber();
        int guessedNUmber = Integer.parseInt(txtGuessedNumber.getText().toString());
        lblGeneratedNumber.setVisible(true);
        lblGeneratedNumber.setText("Generated Number is : "+generatedNumber);
        if(generatedNumber == guessedNUmber){
            lblMessage.setText("You Won!!!");
        }else {
            lblMessage.setText("You Lose!! Try again");
        }
    }

    private int generatedNumber() {
         return  (int)(Math.random()*(10-1+1)+1);
    }
}