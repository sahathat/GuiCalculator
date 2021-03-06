/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * download scene builder and open fxml file
 */

package calculatorfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author sahat
 */
public class FXMLDocumentController implements Initializable {
    
    // keep data in float value
    Float data = 0f;
    int operation = -1;
    
    
    int len = 0;
    
    String store = "";
    
    // set button is number and operation
    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button muti;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button div;
    
    @FXML
    private Button backspace;

    @FXML
    private Button mod;

    @FXML
    private Button plusminus;
    
    
    @FXML
    private Button one;
    
    //set textfield to display number
    @FXML
    private TextField display;
    
    //display operation doing
    @FXML
    private TextField operationtool;
    
    
    @FXML
    void handleButtonAction(ActionEvent event) {
        
        //set text to add number continue
        if(event.getSource() == one){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("1");
            } else {
                display.setText(display.getText() + "1");
            }
            data = Float.parseFloat(display.getText()); // convert String to float value
        }
        else if(event.getSource() == two){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("2");
            } else {
                display.setText(display.getText() + "2");
            }
            data = Float.parseFloat(display.getText()); // convert String to float value
        }
        else if(event.getSource() == three){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("3");
            } else {
                display.setText(display.getText() + "3");
            }
            data = Float.parseFloat(display.getText()); // convert String to float value
        }
        else if(event.getSource() == four){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("4");
            } else {
                display.setText(display.getText() + "4");
            }
            data = Float.parseFloat(display.getText()); // convert String to float value
        }
        else if(event.getSource() == five){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("5");
            } else {
                display.setText(display.getText() + "5");
            }
            data = Float.parseFloat(display.getText()); // convert String to float value
        }
        else if(event.getSource() == six){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("6");
            } else {
                display.setText(display.getText() + "6");
            }
            data = Float.parseFloat(display.getText()); // convert String to float value
        }
        else if(event.getSource() == seven){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("7");
            } else {
                display.setText(display.getText() + "7");
            }
            data = Float.parseFloat(display.getText()); // convert String to float value
        }
        else if(event.getSource() == eight){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("8");
            } else {
                display.setText(display.getText() + "8");
            }
            data = Float.parseFloat(display.getText()); // convert String to float value
        }
        else if(event.getSource() == nine){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("9");
            } else {
                display.setText(display.getText() + "9");
            }
            data = Float.parseFloat(display.getText()); // convert String to float value
        }
        else if(event.getSource() == zero){
            if("0".equals(display.getText()) || "Error".equals(display.getText())){
                display.setText("0");
            } else {
                display.setText(display.getText() + "0");
            }
        }
        else if(event.getSource() == clear){
            display.setText("0");
            data = Float.parseFloat(display.getText()); //clear value is 0
        }
        
        //do operation
        else if(event.getSource() == plus){
            operation = 1; // type addition
            display.setText("0");
            operationtool.setText("+");
        }
        else if(event.getSource() == minus){
            operation = 2; // type substraction
            display.setText("0");
            operationtool.setText("-");
        }
        else if(event.getSource() == muti){
            operation = 3; // type mutiplition
            display.setText("0");
            operationtool.setText("*");
        }
        else if(event.getSource() == div){
            operation = 4; // type division
            display.setText("0");
            operationtool.setText("/");
        }
        else if(event.getSource() == mod){
            operation = 5; // type modulation
            display.setText("0");
            operationtool.setText("%");
            
        //step equal to get number
        } else if(event.getSource() == equals){
            
            //set second operand number
            Float secondOperand = Float.parseFloat(display.getText());
            //set result of number
            Float ans = 0f;
            switch(operation){
                case 1: //addition
                    ans = data + secondOperand;
                    display.setText(String.valueOf(ans)); //convert float to String and display on text field
                    operationtool.setText("=");
                    break;
                case 2: //substraction
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans)); //convert float to String and display on text field
                    operationtool.setText("=");
                    break;
                case 3: //mutiplition
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans)); //convert float to String and display on text field
                    operationtool.setText("=");
                    break;
                case 4: //division
                    try {
                        if(secondOperand != 0){
                           ans = data / secondOperand;
                           display.setText(String.valueOf(ans)); //convert float to String and display on text field
                        } else {
                           display.setText("Error");
                        }
                    } catch(ArithmeticException e) {
                        display.setText("Error");
                    } finally {
                        operationtool.setText("=");
                    }
                    break;
                case 5: //modulation
                    ans = data % secondOperand;
                    display.setText(String.valueOf(ans)); //convert float to String and display on text field
                    operationtool.setText("=");
            }
        }
        //set backspace button delete back position of textfield
        else if(event.getSource() == backspace){
            len = display.getText().length() -1; // length of textfield - 1
            if(len == 0){
                display.setText("0"); //use one digit number
            }
            else{
               StringBuilder back = new StringBuilder(display.getText());
            back.deleteCharAt(len); //delete last index of char and toString with string builder
            store = back.toString(); //store item in textfield and output item after delete index of item
            display.setText(store);  
            }
        }
        //set point of plus / minus switch
        else if(event.getSource() == plusminus){
            if(data > 0){
                display.setText("-" + display.getText());
                data = -data;
            }else if(data < 0){
                StringBuilder back = new StringBuilder(display.getText());
                back.deleteCharAt(0); //delete first index of char and toString with string builder
                store = back.toString(); //store item in textfield and output item after delete index of item
                display.setText(store);  
                data = -data;
            }
        }
    }

    @FXML
    void handleButtonActionHistory(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
