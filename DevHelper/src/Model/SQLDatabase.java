package Model;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.stage.FileChooser;

public class SQLDatabase {

	private static final String DB_NAME = "database.de";
	private static String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\ChVoS\\Desktop\\" + DB_NAME;
	private static String TABLE_DATABASE = "javaDatabase";
	private static final String COLUMN_ITEM = "item";
	private static final String COLUMN_TEXT = "text";
	private ArrayList<HashMap<String, String>> listKeyValue = new ArrayList<>();
	
	public SQLDatabase() {
		
	}
	
	public void save() {
		
		FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Datas");
        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
           CONNECTION_STRING = "jdbc:sqlite:" + file.getAbsolutePath();
        }	
	}
	
	public void load() {
		
		FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load Datas");
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
        	CONNECTION_STRING = "jdbc:sqlite:" + file.getAbsolutePath();
        }	
	}
	

	//SAVE
	public void saving(TextModel textModel) {
		
		//Name der Tabelle
		if(textModel.getLanguages()[0]) {
			TABLE_DATABASE = "javaDatabase";
		}
		else if(textModel.getLanguages()[1]) {
			TABLE_DATABASE = "javaFxDatabase";
		}
		else if(textModel.getLanguages()[2]) {
			TABLE_DATABASE = "androidDatabase";
		}
		else if(textModel.getLanguages()[3]) {
			TABLE_DATABASE = "cppDatabase";
		}
		else if(textModel.getLanguages()[4]) {
			TABLE_DATABASE = "csDatabase";
		}
		else if(textModel.getLanguages()[5]) {
			TABLE_DATABASE = "pythonDatabase";
		}
		else if(textModel.getLanguages()[6]) {
			TABLE_DATABASE = "htmlcssDatabase";
		}
		else if(textModel.getLanguages()[7]) {
			TABLE_DATABASE = "javascriptDatabase";
		}
		else if(textModel.getLanguages()[8]) {
			TABLE_DATABASE = "phpDatabase";
		}
		
		
		save(); //speichert an einem Zielort als Datei ab bzw. DE
		
		String url = CONNECTION_STRING; //speichert auch alternativ auf dem Desktop
		
		try {
			Connection connection = DriverManager.getConnection(url);
			Statement statement = connection.createStatement();
			
			statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_DATABASE + "( " + COLUMN_ITEM + " TEXT, " + COLUMN_TEXT + " TEXT)");
			
			//DROP
			clear(statement);
			
			statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_DATABASE + "( " + COLUMN_ITEM + " TEXT, " + COLUMN_TEXT + " TEXT)");

			// C - Create	
			
			//Replacing the ' for @@@
			//Without this JDBC is causing an SQL exception
			for (int j=0; j<textModel.getTextArray().size(); j++) {
					   String replaceLetters = textModel.getTextArray().get(j);
					   String oldLetter = "'";
					   String newLetter = "@@@";
					   replaceLetters = replaceLetters.replaceAll(oldLetter, newLetter);
					   textModel.getTextArray().set(j, replaceLetters);
					 }
			

			for(int i = 0; i < textModel.getItemArray().size(); i++) {
				
			createItem(statement, textModel.getItemArray().get(i), textModel.getTextArray().get(i));
			}

			
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	//LOAD
		public TextModel loading(TextModel textModel) {
			
			//Name der Tabelle
			if(textModel.getLanguages()[0]) {
				TABLE_DATABASE = "javaDatabase";
			}
			else if(textModel.getLanguages()[1]) {
				TABLE_DATABASE = "javaFxDatabase";
			}
			else if(textModel.getLanguages()[2]) {
				TABLE_DATABASE = "androidDatabase";
			}
			else if(textModel.getLanguages()[3]) {
				TABLE_DATABASE = "cppDatabase";
			}
			else if(textModel.getLanguages()[4]) {
				TABLE_DATABASE = "csDatabase";
			}
			else if(textModel.getLanguages()[5]) {
				TABLE_DATABASE = "pythonDatabase";
			}
			else if(textModel.getLanguages()[6]) {
				TABLE_DATABASE = "htmlcssDatabase";
			}
			else if(textModel.getLanguages()[7]) {
				TABLE_DATABASE = "javascriptDatabase";
			}
			else if(textModel.getLanguages()[8]) {
				TABLE_DATABASE = "phpDatabase";
			}
			
			load();
			
			String url = CONNECTION_STRING;
			
			try {
				Connection connection = DriverManager.getConnection(url);
				Statement statement = connection.createStatement();

				// R - Read
				
				textModel = readItems(statement, textModel);

				statement.close();
				connection.close();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return textModel;

		}
		
	
	//CRUD
		
	private void createItem(Statement statement, String item, String text) throws SQLException {
		statement.execute("INSERT INTO " + TABLE_DATABASE + " VALUES " + "('" + item + "','"+ text + "')");
		
	}
		
	private TextModel readItems(Statement statement, TextModel textModel) throws SQLException {
		
		//Replacing the @@@ back to '
		for (int j=0; j<textModel.getTextArray().size(); j++) {
				   String replaceLetters = textModel.getTextArray().get(j);
				   String oldLetter = "@@@";
				   String newLetter = "'";
				   replaceLetters = replaceLetters.replaceAll(oldLetter, newLetter);
				   textModel.getTextArray().set(j, replaceLetters);
				 }
		
		ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_DATABASE);
		textModel.getItemArray().clear();
		textModel.getTextArray().clear();
		textModel.getDatas().getAllDatas().clear();
		
		int i = 0;
		
		while(resultSet.next()) {
		
		textModel.getItemArray().add(resultSet.getString(COLUMN_ITEM));
		textModel.getTextArray().add(resultSet.getString(COLUMN_TEXT));
		
		//Filling getAllDatas
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(i).put(resultSet.getString(COLUMN_ITEM), resultSet.getString(COLUMN_TEXT));
		textModel.getDatas().getAllDatas().add(listKeyValue.get(i).toString());	
		i++;
		}
		
		return textModel;
	}	
		
//	private void updateItems(Statement statement, String currentName, String newName) throws SQLException {
//		statement.execute("UPDATE " + TABLE_DATABASE + " SET " + COLUMN_ITEM + " = '" + newName + "'" + " WHERE " + COLUMN_ITEM + " = '" + currentName + "'" + " COLLATE NOCASE");
//		
//	}	
//		
//	private void deleteItem(Statement statement, String name) throws SQLException {
//		statement.execute("DELETE FROM " + TABLE_DATABASE + " WHERE " + COLUMN_ITEM + " = '" + name + "'" + " COLLATE NOCASE");
//		
//	}	
	
	private void clear(Statement statement) throws SQLException{
		statement.execute("DROP TABLE " + TABLE_DATABASE);
	}
	
	
}
