package Controller;

import java.io.IOException;
import Model.TextModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController {

	@FXML
    private Label labelMain;
	
	@FXML
    private Button javaButton;
	
	@FXML
    private Button phpButton;

    @FXML
    private Button pythonButton;

    @FXML
    private Button androidButton;

    @FXML
    private Button javascriptButton;

    @FXML
    private Button javaFXButton;

    @FXML
    private Button csButton;

    @FXML
    private Button htmlcssButton;

    @FXML
    private Button cppButton;
	
    
	private TextModel textModel = new TextModel();
	

	public TextModel getTextModel() {
		return textModel;
	}
	
	public void setTextModel(TextModel textModel) {
		this.textModel = textModel;
	}
	

	@FXML
    void loadInnerViewJava(ActionEvent event){
		falseLoop();
		textModel.getLanguages()[0] = true;
    	loadInnerView(event);
    	
    }

	@FXML
    void loadInnerViewJavaFx(ActionEvent event){
		falseLoop();
		textModel.getLanguages()[1] = true;	
    	loadInnerView(event);
    	
    }
	
	@FXML
    void loadInnerViewAndroid(ActionEvent event){
		falseLoop();
		textModel.getLanguages()[2] = true;	
    	loadInnerView(event);
    	
    }
	
	@FXML
    void loadInnerViewCpp(ActionEvent event){	
		falseLoop();
		textModel.getLanguages()[3] = true;	
    	loadInnerView(event);
    	
    }
	
	@FXML
    void loadInnerViewCs(ActionEvent event){
		falseLoop();
    	textModel.getLanguages()[4] = true;
    	loadInnerView(event);
    }
	
	@FXML
    void loadInnerViewPython(ActionEvent event){	
		falseLoop();
		textModel.getLanguages()[5] = true;	
    	loadInnerView(event);
    	
    }
	
	@FXML
    void loadInnerViewHtmlcss(ActionEvent event){
		falseLoop();
		textModel.getLanguages()[6] = true;	
    	loadInnerView(event);
    	
    }
	
	
	@FXML
    void loadInnerViewJavascript(ActionEvent event){	
		falseLoop();
		textModel.getLanguages()[7] = true;	
    	loadInnerView(event);
    	
    }
	
	
	@FXML
    void loadInnerViewPhp(ActionEvent event){
		falseLoop();
		textModel.getLanguages()[8] = true;
    	loadInnerView(event);
    	
    }

	
	private void loadInnerView(ActionEvent event) {	
		
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
    	Stage stage = (Stage) javaButton.getScene().getWindow(); //für alle Buttons
    	stage.setScene(scene);
    	stage.setResizable(false);
    	stage.show();
		
	}
	
	private void falseLoop() {
		
		for(int i = 0; i < textModel.getLanguages().length; i++) {	
			textModel.getLanguages()[i] = false;
		}
	}
    
    
}
