/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.events.managementfx;

import acme.events.management.controllers.SpeakerController;
import acme.events.management.model.Speaker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrator
 */
public class SpeakerUIController implements Initializable {

    @FXML
    TextField speakerName;
    @FXML
    TextField rate;
    @FXML
    TextField contact;
    @FXML
    TextArea allSpeakers;

    @FXML
    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");

        String Name = speakerName.getText();
        double Rate = Double.parseDouble(rate.getText());
        String Contact = contact.getText();

        SpeakerController.save(new Speaker(Name,Contact,Rate));
        
        System.out.println(Name);
        System.out.println(Rate);
        System.out.println(Contact);
    
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
