package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class DatasCs extends Datas{
	
	private ArrayList<HashMap<String, String>> listKeyValue = new ArrayList<>(); //Sichert beim Sortieren die Zugehörigkeit zwischen item und text
	private ArrayList<String> allDatas = new ArrayList<>(); //Dient zum Speichern eines ganzen Eintrags und zum trennen nach item und text
	
	
	public ArrayList<HashMap<String, String>> getListKeyValue() {
		return listKeyValue;
	}

	
	public void setAllDatas(ArrayList<String> allDatas) {
		this.allDatas = allDatas;
		
	}

	public ArrayList<String> getAllDatas() {
		return allDatas;
	}


		//Maps
	public void fillListMap() {
		
		allDatas.clear();
		listKeyValue.clear();

		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(0).put("item1", "text1");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(1).put("item2", "text2");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(2).put("item3", "text3");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(3).put("item4", "text4");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(4).put("item5", "text5");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(5).put("item6", "text6");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(6).put("item7", "text7");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(7).put("item8", "text8");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(8).put("item9", "text9");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(9).put("item10", "text10");
			
			
			for(int i = 0; i < listKeyValue.size(); i++) {
			
			allDatas.add(listKeyValue.get(i).toString());
			
			
			}
			
			
	}

}
