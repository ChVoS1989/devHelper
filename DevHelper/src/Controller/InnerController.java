package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import Model.SQLDatabase;
import Model.TextModel;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class InnerController extends MainController{

	private SQLDatabase database = new SQLDatabase();
	
	private TextModel textModel;
	
	
	public TextModel getTextModel() {
		return textModel;
	}
	
	public void setTextModel(TextModel textModel) {
		this.textModel = textModel;
	}
	
	@FXML
	private Button findButton;

	@FXML
	private ListView<String> listView;
	
	@FXML
    private Button sortButton;
	
	@FXML
	private TextArea textArea;
	
	@FXML
	private ObservableList<String> items;
	
	@FXML
    private Button refreshButton;

    @FXML
    private Button backButton;
    
    @FXML
    private Button newButton;

    @FXML
    private Button saveButton;
    
    @FXML
    private Button removeButton;
    
    @FXML
    private Button loadButton;
	
	@FXML
	    public void loadList(ActionEvent event) {

		 items = textModel.allDatas();
		 items.clear();
		 items = textModel.allDatas();	 
		 listView.setItems(items);	 	 
		 listView.getSelectionModel().select(0);
		 ArrayList<String> tmp = textModel.getTextArray();	 
		 textArea.setText(tmp.get(0));	
		 listView.getSelectionModel().select(textModel.getFindIndex());
		 
		 } 
	
    @FXML
    void backToMain(ActionEvent event){
    	
    	textModel.getItemArray().clear();			//Reseting lists for other language
    	textModel.getTextArray().clear();
    	textModel.setFindIndex(0);  	

    	//load the xml
    	FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("/View/MainView.fxml"));
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		MainController mainController = fxmlLoader.getController();
		mainController.setTextModel(textModel);

		//set the layout
		Parent root = fxmlLoader.getRoot();
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) backButton.getScene().getWindow();
    	scene.getStylesheets().add(getClass().getResource("/design/mainView.css").toExternalForm());
    	stage.setResizable(false);
    	stage.setScene(scene);
    	stage.show();
    	
    	}

    
    @FXML
    void mouseClick(MouseEvent event) {
    	
    	try {
			int index = listView.getSelectionModel().getSelectedIndex();
			ArrayList<String> tmp = textModel.getTextArray();
			textArea.setText(tmp.get(index));
			
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			textArea.setText("Please refresh the list.");
		} 	
    	
    }  
    
    @FXML
    void textChange(KeyEvent event) {
    	try {
			ArrayList<String> tmp = textModel.getTextArray(); 
			tmp.set(listView.getSelectionModel().getSelectedIndex(), textArea.getText());
			textModel.setTextArray(tmp);
			
		} catch (Exception e) {
			e.printStackTrace();
			textArea.setText("Please select an item fom the list");
		}
    }
    
    
    @FXML
    void openAddNewItem(ActionEvent event) {

    	//load the xml
    	FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("/View/ViewNewItem.fxml"));
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		NewItemControllerJava newItemController = fxmlLoader.getController();
		newItemController.setTextModel(textModel);	
		items.clear();

		//set the layout	
		Parent root = fxmlLoader.getRoot();
    	Scene scene = new Scene(root);
    	scene.getStylesheets().add(getClass().getResource("/design/newItemView.css").toExternalForm());
    	Stage stage = (Stage) newButton.getScene().getWindow();
    	stage.setScene(scene);
    	stage.setResizable(false);
    	stage.show();
    	
    }
    
    
    //SQL database
    @FXML
    void loadAll(ActionEvent event) {
    	
    	this.textModel = database.loading(textModel);
    	loadList(event);
    } 
    
    @FXML
    void saveAll(ActionEvent event) {  	
    	database.saving(textModel);   	
    }
    
    
    @FXML
    void sortList(ActionEvent event) {
    	
    	Collections.sort(textModel.getDatas().getAllDatas());
    	
    	for(int i = 0; i < textModel.getDatas().getAllDatas().size(); i++){
    		
    		textModel.getItemArray().remove(0);
    		textModel.getTextArray().remove(0);
    		
    		textModel.getItemArray().add(textModel.getDatas().getAllDatas().get(i).substring(1, textModel.getDatas().getAllDatas().get(i).indexOf('=')));
    		textModel.getTextArray().add(textModel.getDatas().getAllDatas().get(i).substring(textModel.getDatas().getAllDatas().get(i).indexOf('=')+1, textModel.getDatas().getAllDatas().get(i).length()-1));

    		}

    	loadList(event);
    	
    }
    
    @FXML
    void find(ActionEvent event) {

    	//load the xml
    	FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("/View/FindView.fxml"));
		
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FindController findController = fxmlLoader.getController();
		findController.setTextModel(textModel);		

		//set the layout	
		Parent root = fxmlLoader.getRoot();
    	Scene scene = new Scene(root);
    	scene.getStylesheets().add(getClass().getResource("/design/newItemView.css").toExternalForm());
    	Stage stage = (Stage) findButton.getScene().getWindow();
    	stage.setScene(scene);
    	stage.setResizable(false);
    	stage.show();
    	
    	}


    @FXML
    void removeItem(ActionEvent event) {
    	
    	
    	ArrayList<String> tmpName = textModel.getItemArray();
    	ArrayList<String> tmpData = textModel.getTextArray(); 
    	ArrayList<String> tmpAllData = textModel.getDatas().getAllDatas(); 
    	
    	//Adding an element to avoid Nullpointer Exception
		if(tmpName.size() == 1) {	
			textModel.getItemArray().add("");
			textModel.getTextArray().add("");
			textModel.getDatas().getAllDatas().add("");
			textModel.getDatas().getListKeyValue().add(new HashMap<>());
		
	    	textModel.getDatas().getListKeyValue().remove(listView.getSelectionModel().getSelectedIndex());
			
			tmpName.remove(listView.getSelectionModel().getSelectedIndex());
        	tmpData.remove(listView.getSelectionModel().getSelectedIndex());
        	tmpAllData.remove(listView.getSelectionModel().getSelectedIndex());
        	textModel.setItemArray(tmpName);
        	textModel.setTextArray(tmpData);
        	textModel.getDatas().setAllDatas(tmpAllData);
        	
        	textArea.clear();
		}   	
    	
    	if (tmpName.size() > 1) {
	
    		tmpName.remove(listView.getSelectionModel().getSelectedIndex());
        	tmpData.remove(listView.getSelectionModel().getSelectedIndex());
        	tmpAllData.remove(listView.getSelectionModel().getSelectedIndex());
        	textModel.setItemArray(tmpName);
        	textModel.setTextArray(tmpData);
        	textModel.getDatas().setAllDatas(tmpAllData);
    	}	
		
    	items.clear();	
    	//refresh
		items = textModel.allDatas();	
		listView.setItems(items);
		listView.getSelectionModel().select(0);
		
		if(tmpName.size() > 1) {
		int index = listView.getSelectionModel().getSelectedIndex();
		ArrayList<String> tmp = textModel.getTextArray();
		textArea.setText(tmp.get(index));
		}
    }
    
}
