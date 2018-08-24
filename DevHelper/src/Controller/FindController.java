package Controller;

import java.io.IOException;
import java.util.ArrayList;
import Controller.InnerController;
import Model.TextModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FindController {
	
	private TextModel textModel;
	
	public void setTextModel(TextModel textModel) {
		this.textModel = textModel;
	}
	
    @FXML
    private Button cancelButton;
	
	@FXML
    private TextField findTextField;

    @FXML
    private Button findButton;

    @FXML
    void find(ActionEvent event) {
	
    	String text = findTextField.getText().toLowerCase();	
    	ArrayList<String> tmp = textModel.getItemArray();
    	
    	for(int i = 0; i < tmp.size(); i++) {
    		tmp.set(i, tmp.get(i).toLowerCase());  		
    	}
  
    	// Schleife vergleicht die Listenelemente mit der Menge der Buchstaben und den Buchstaben selbst
    	for(int i = 0; i < tmp.size(); i++) {
    		int wordLength = text.length();
    		String wordArray = tmp.get(i).substring(0, wordLength);
   
    		if(wordArray.equals(text)) {
    				
    			textModel.setFindIndex(i);
    			break;
    		}
    			
    	}
	
    	createView(event);
    	
    }

    @FXML
    void cancel(ActionEvent event) {
    	
    	createView(event);
    }
    
    private void createView(ActionEvent event){
    	
    	//load the xml
    	FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("/View/InnerView.fxml"));
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	InnerController innerController = fxmlLoader.getController();
		innerController.setTextModel(textModel);
		
		//set the layout
		Parent root = fxmlLoader.getRoot();
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) findButton.getScene().getWindow();
    	scene.getStylesheets().add(getClass().getResource("/design/innerView.css").toExternalForm());
    	stage.setResizable(false);
    	stage.setScene(scene);
    	stage.show();
		innerController.loadList(event);
    }
    
}