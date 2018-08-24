package Model;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TextModel {

	private boolean[] languages = {false , false, false, false , false, false, false , false, false,};
	
	private int findIndex;
	
	private ArrayList<String> itemArray = new ArrayList<>(); //speichert items Namen für ListView
	private ArrayList<String> textArray = new ArrayList<>(); //speichert text für TextField
	private ObservableList<String> allDatasList = FXCollections.observableArrayList(); //Dient zur Übergabe an ListView
	
	private DatasJava datasJava = new DatasJava();
	private DatasJavaFx datasJavaFx = new DatasJavaFx();
	private DatasAndroid datasAndroid = new DatasAndroid();
	private DatasCpp datasCpp = new DatasCpp();
	private DatasCs datasCs= new DatasCs();
	private DatasPython datasPython = new DatasPython();
	private DatasHtmlcss datasHtmlcss = new DatasHtmlcss();
	private DatasJavascript datasJavascript = new DatasJavascript();
	private DatasPhp datasPhp = new DatasPhp();

	//Constructor
	public TextModel(){
		
	}

	
	public boolean[] getLanguages() {
		return languages;
	}


	public void setLanguages(boolean[] languages) {
		this.languages = languages;
	}


	public void setFindIndex(int findIndex) { //Dient zum herausfinden des gesuchten Index
		this.findIndex = findIndex;
		
	}

	public int getFindIndex() {
		return findIndex;
		
	}

	public ArrayList<String> getItemArray() {
		return itemArray;
	}

	public void setItemArray(ArrayList<String> itemArray) {
		this.itemArray = itemArray;
	}

	public ArrayList<String> getTextArray() {
		return textArray;
	}

	public void setTextArray(ArrayList<String> textArray) {
		this.textArray = textArray;
	}

	
	public DatasJava getDatasJava() {
		return datasJava;
	}


	public Datas getDatas() {
		
		if(languages[0])
			return datasJava;
		else if(languages[1])
			return datasJavaFx;
		else if(languages[2])
			return datasAndroid;
		else if(languages[3])
			return datasCpp;
		else if(languages[4])
			return datasCs;
		else if(languages[5])
			return datasPython;	
		else if(languages[6])
			return datasHtmlcss;
		else if(languages[7])
			return datasJavascript;
		else if(languages[8])
			return datasPhp;

		return null;
		
	}

	
	public ObservableList<String> allDatas() { //befüllen und überreichen der Array und der ObservableList

		if(itemArray.isEmpty()) {
			if(languages[0])
				datasJava.fillListMap();
			else if(languages[1])
				datasJavaFx.fillListMap();
			else if(languages[2])
				datasAndroid.fillListMap();
			else if(languages[3])
				datasCpp.fillListMap();
			else if(languages[4])
				datasCs.fillListMap();
			else if(languages[5])
				datasPython.fillListMap();
			else if(languages[6])
				datasHtmlcss.fillListMap();
			else if(languages[7])
				datasJavascript.fillListMap();
			else if(languages[8])
				datasPhp.fillListMap();

			substring();
		}	
			
		allDatasList.clear();	
		allDatasList.addAll(itemArray);
		
	
		return allDatasList;
	}
	
	
	private void substring() {
		//used once at start

		if(languages[0]) {
			for(int i = 0; i < datasJava.getAllDatas().size(); i++){
			
				itemArray.add(datasJava.getAllDatas().get(i).substring(1, datasJava.getAllDatas().get(i).indexOf('=')));
				textArray.add(datasJava.getAllDatas().get(i).substring(datasJava.getAllDatas().get(i).indexOf('=')+1, datasJava.getAllDatas().get(i).length()-1));
			}
		}
		
		else if(languages[1]) {
			for(int i = 0; i < datasJavaFx.getAllDatas().size(); i++){
				itemArray.add(datasJavaFx.getAllDatas().get(i).substring(1, datasJavaFx.getAllDatas().get(i).indexOf('=')));
				textArray.add(datasJavaFx.getAllDatas().get(i).substring(datasJavaFx.getAllDatas().get(i).indexOf('=')+1, datasJavaFx.getAllDatas().get(i).length()-1));
			}
		}
		
		else if(languages[2]) {
			for(int i = 0; i < datasAndroid.getAllDatas().size(); i++){
				itemArray.add(datasAndroid.getAllDatas().get(i).substring(1, datasAndroid.getAllDatas().get(i).indexOf('=')));
				textArray.add(datasAndroid.getAllDatas().get(i).substring(datasAndroid.getAllDatas().get(i).indexOf('=')+1, datasAndroid.getAllDatas().get(i).length()-1));
			}
		}
		
		else if(languages[3]) {
			for(int i = 0; i < datasCpp.getAllDatas().size(); i++){
				itemArray.add(datasCpp.getAllDatas().get(i).substring(1, datasCpp.getAllDatas().get(i).indexOf('=')));
				textArray.add(datasCpp.getAllDatas().get(i).substring(datasCpp.getAllDatas().get(i).indexOf('=')+1, datasCpp.getAllDatas().get(i).length()-1));
			}
		}
		
		else if(languages[4]) {
			for(int i = 0; i < datasCs.getAllDatas().size(); i++){
				itemArray.add(datasCs.getAllDatas().get(i).substring(1, datasCs.getAllDatas().get(i).indexOf('=')));
				textArray.add(datasCs.getAllDatas().get(i).substring(datasCs.getAllDatas().get(i).indexOf('=')+1, datasCs.getAllDatas().get(i).length()-1));
			}
		}
		
		else if(languages[5]) {
			for(int i = 0; i < datasPython.getAllDatas().size(); i++){
				itemArray.add(datasPython.getAllDatas().get(i).substring(1, datasPython.getAllDatas().get(i).indexOf('=')));
				textArray.add(datasPython.getAllDatas().get(i).substring(datasPython.getAllDatas().get(i).indexOf('=')+1, datasPython.getAllDatas().get(i).length()-1));
			}
		}
		
		else if(languages[6]) {
			for(int i = 0; i < datasHtmlcss.getAllDatas().size(); i++){
				itemArray.add(datasHtmlcss.getAllDatas().get(i).substring(1, datasHtmlcss.getAllDatas().get(i).indexOf('=')));
				textArray.add(datasHtmlcss.getAllDatas().get(i).substring(datasHtmlcss.getAllDatas().get(i).indexOf('=')+1, datasHtmlcss.getAllDatas().get(i).length()-1));
			}
		}
		
		else if(languages[7]) {
			for(int i = 0; i < datasJavascript.getAllDatas().size(); i++){
				itemArray.add(datasJavascript.getAllDatas().get(i).substring(1, datasJavascript.getAllDatas().get(i).indexOf('=')));
				textArray.add(datasJavascript.getAllDatas().get(i).substring(datasJavascript.getAllDatas().get(i).indexOf('=')+1, datasJavascript.getAllDatas().get(i).length()-1));
			}
		}
		
		else if(languages[8]) {
			for(int i = 0; i < datasPhp.getAllDatas().size(); i++){
				itemArray.add(datasPhp.getAllDatas().get(i).substring(1, datasPhp.getAllDatas().get(i).indexOf('=')));
				textArray.add(datasPhp.getAllDatas().get(i).substring(datasPhp.getAllDatas().get(i).indexOf('=')+1, datasPhp.getAllDatas().get(i).length()-1));
			}
		}
	}

}
