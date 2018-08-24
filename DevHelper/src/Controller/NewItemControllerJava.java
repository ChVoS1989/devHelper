package Controller;

import java.io.IOException;
import java.util.HashMap;

import Model.TextModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewItemControllerJava {

	@FXML
    private Button cancelButton;

    @FXML
    private Button addButton;   
    
    @FXML
    private TextField titleField;

    @FXML
    private TextArea newTextArea;
 
   
    private TextModel textModel;
  
    
    public TextModel getTextModel() {
		return textModel;
	}

	public void setTextModel(TextModel textModel) {
		this.textModel = textModel;
	}

	@FXML
	public TextField getTitleField() {
		return titleField;
	}

	
	public void setTitleField(TextField titleField) {
		this.titleField = titleField;
	}

	public TextArea getNewTextArea() {
		return newTextArea;
	}

	public void setNewTextArea(TextArea newTextArea) {
		this.newTextArea = newTextArea;
	}

	
	@FXML
    void addNewItem(ActionEvent event) {
	
		textModel.getDatas().getListKeyValue().add(new HashMap<>());
		textModel.getDatas().getListKeyValue().get(textModel.getDatas().getListKeyValue().size()-1).put(titleField.getText(), newTextArea.getText());
		
		textModel.getDatas().getAllDatas().add(textModel.getDatas().getListKeyValue().get(textModel.getDatas().getListKeyValue().size()-1).toString());
		
		textModel.getItemArray().add(textModel.getDatas().getAllDatas().get(textModel.getDatas().getAllDatas().size()-1).
		substring(1, textModel.getDatas().getAllDatas().get(textModel.getDatas().getAllDatas().size()-1).indexOf('=')));
		
		textModel.getTextArray().add(textModel.getDatas().getAllDatas().get(textModel.getDatas().getAllDatas().size()-1).
		substring(textModel.getDatas().getAllDatas().get(textModel.getDatas().getAllDatas().size()-1).indexOf('=')+1, textModel.getDatas().getAllDatas().get(textModel.getDatas().getAllDatas().size()-1).length()-1));

		createView(event);
    }

    @FXML
    void cancelNewItem(ActionEvent event) {    	
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
		innerController.loadList(event);
			
		//set the layout		
		Parent root = fxmlLoader.getRoot();
    	Scene scene = new Scene(root);
    	scene.getStylesheets().add(getClass().getResource("/design/innerView.css").toExternalForm());
    	Stage stage = (Stage) cancelButton.getScene().getWindow();
    	stage.setResizable(false);
    	stage.setScene(scene);
    	stage.show();
    }
}
