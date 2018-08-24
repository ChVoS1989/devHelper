package Model;

import java.util.ArrayList;
import java.util.HashMap;


public class DatasJava extends Datas{
	
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
			listKeyValue.get(0).put("if/else", "public static void main(String[] args) {\r\n" + 
					"\r\n" + 
					"	boolean condition1 = true;\r\n" + 
					"	boolean condition2 = false;\r\n" + 
					"	\r\n" + 
					"	if(condition1) {\r\n" + 
					"		\r\n" + 
					"		//Do something\r\n" + 
					"		//System.out.println(\"condition1 is true\");\r\n" + 
					"		\r\n" + 
					"	}else if(condition2) {\r\n" + 
					"		\r\n" + 
					"		//This condition is actually false\r\n" + 
					"		//Do something\r\n" + 
					"		//System.out.println(\"condition2 is now true\");\r\n" + 
					"	}else {\r\n" + 
					"		\r\n" + 
					"		//Do soemthing else when nothing above is true\r\n" + 
					"		//System.out.println(\"condition1 and condition2 are false\");\r\n" + 
					"	}\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(1).put("for/while/do while", "public static void main(String[] args) {\r\n" + 
					"\r\n" + 
					"	int variable = 10;\r\n" + 
					"	\r\n" + 
					"	//Use it if you know how often you need to repeat something\r\n" + 
					"	\r\n" + 
					"	for (int i = 0; i < variable; i++) {\r\n" + 
					"		\r\n" + 
					"		//Do something several times\r\n" + 
					"		//System.out.println(i);\r\n" + 
					"	}\r\n" + 
					"	\r\n" + 
					"	//or use this if its unclear how often something is going to be repeated\r\n" + 
					"	\r\n" + 
					"	int j = 0;\r\n" + 
					"	\r\n" + 
					"	while (j < variable) {\r\n" + 
					"		//System.out.println(j);\r\n" + 
					"		//Do something\r\n" + 
					"		j++;\r\n" + 
					"		\r\n" + 
					"	}\r\n" + 
					"	\r\n" + 
					"	// use this if you need at least something to be done once\r\n" + 
					"	\r\n" + 
					"	do {\r\n" + 
					"		//System.out.println(j);\r\n" + 
					"		//Do something\r\n" + 
					"		j++;\r\n" + 
					"	}while(j < variable);\r\n" + 
					"\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(2).put("switch/case/default", "public static void main(String[] args) {\r\n" + 
					"\r\n" + 
					"	int condition = 0;\r\n" + 
					"\r\n" + 
					"	switch (condition) {\r\n" + 
					"\r\n" + 
					"	// Case 1 or Case 2\r\n" + 
					"	case 1:\r\n" + 
					"		//System.out.println(\"Case 1\");\r\n" + 
					"		break;\r\n" + 
					"	case 2:\r\n" + 
					"		//System.out.println(\"Case 2\");\r\n" + 
					"		break;\r\n" + 
					"\r\n" + 
					"	// Case 3 and 4\r\n" + 
					"	case 3:\r\n" + 
					"		//System.out.println(\"Case 3\");\r\n" + 
					"	case 4:\r\n" + 
					"		//System.out.println(\"Case 4\");\r\n" + 
					"\r\n" + 
					"		// When nothing is true\r\n" + 
					"	default:\r\n" + 
					"		//System.out.println(\"Default\");\r\n" + 
					"\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(3).put("array", "public static void main(String[] args) {\r\n" + 
					"\r\n" + 
					"	//Initialize array\r\n" + 
					"	int[] array1 = {0,1,2,3,4,5,6,7,8,9};\r\n" + 
					"	\r\n" + 
					"	//Declare array\r\n" + 
					"	int[] array2;\r\n" + 
					"	array2 = new int[10];\r\n" + 
					"	for (int i = 0; i < array2.length; i++) {\r\n" + 
					"		\r\n" + 
					"		//Filling the array with 0-9	\r\n" + 
					"		array2[i] = i; \r\n" + 
					"		//System.out.println(array2[i]);\r\n" + 
					"	}\r\n" + 
					"	\r\n" + 
					"	//Declare array in one row\r\n" + 
					"	int[] array3 = new int[10];\r\n" + 
					"	for (int i = 0; i < array3.length; i++) {\r\n" + 
					"		\r\n" + 
					"		//Filling the array with 0-9	\r\n" + 
					"		array3[i] = i; \r\n" + 
					"		//System.out.println(array2[i]);\r\n" + 
					"	}\r\n" + 
					"	\r\n" + 
					"	//Filling the array with for each loop\r\n" + 
					"	int[] array4 = new int[10];\r\n" + 
					"	\r\n" + 
					"	int i = 0;\r\n" + 
					"	for (int iterator : array4){\r\n" + 
					"		\r\n" + 
					"		array4[i] = i;\r\n" + 
					"		//System.out.println(array4[i]);\r\n" + 
					"		i++;\r\n" + 
					"	\r\n" + 
					"	}	\r\n" + 
					"	\r\n" + 
					"	//Read the array\r\n" + 
					"	for (int iterator : array4){\r\n" + 
					"\r\n" + 
					"		//System.out.println(array4[iterator]);\r\n" + 
					"\r\n" + 
					"	}\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(4).put("filling 2d array", "public static void main(String[] args) {\r\n" + 
					"\r\n" + 
					"	int[][] array2D = new int[10][20];\r\n" + 
					"	\r\n" + 
					"	for (int i = 0; i < array2D.length; i++) {\r\n" + 
					"		for (int j = 0; j < array2D[0].length; j++) {\r\n" + 
					"			array2D[i][j] = j;\r\n" + 
					"			//System.out.print(array2D[i][j] + \" \");\r\n" + 
					"		}	\r\n" + 
					"			//System.out.println();\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"	\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(5).put("threads", "public static void main(String[] args){\r\n" + 
					"\r\n" + 
					"	System.out.println(\"Outside Thread\");\r\n" + 
					"		\r\n" + 
					"	//Anonymus Thread in a static class\r\n" + 
					"	Thread thread = new Thread(new Runnable() {\r\n" + 
					"\r\n" + 
					"		@Override\r\n" + 
					"		public void run() {\r\n" + 
					"			System.out.println(\"Inside Thread\");\r\n" + 
					"				\r\n" + 
					"		}\r\n" + 
					"		\r\n" + 
					"	});	\r\n" + 
					"		\r\n" + 
					"	thread.start();		//Its usual to use start method\r\n" + 
					"	//thread.run();			\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(6).put("sql", "import java.sql.*;\r\n" + 
					"\r\n" + 
					"public class Main {\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"	public static final String DB_NAME = \"test1db.de\";\r\n" + 
					"	public static final String CONNECTION_STRING = \"jdbc:sqlite:C:\\\\Users\\\\Alex\\\\eclipse-workspace\\\\SQL JDBC\\\\src\\\\\"+ DB_NAME;\r\n" + 
					"	\r\n" + 
					"	public static final String TABLE_KONTAKT = \"kontakte\";\r\n" + 
					"	public static final String COLUMN_NAME = \"name\";\r\n" + 
					"	public static final String COLUMN_PHONE = \"phone\";\r\n" + 
					"	public static final String COLUMN_EMAIL = \"email\";\r\n" + 
					"	\r\n" + 
					"	\r\n" + 
					"	public static void main(String[] args) {\r\n" + 
					"		\r\n" + 
					"		String url = CONNECTION_STRING;\r\n" + 
					"		\r\n" + 
					"		try {\r\n" + 
					"			Connection connection = DriverManager.getConnection(url);\r\n" + 
					"			Statement statement = connection.createStatement();\r\n" + 
					"			\r\n" + 
					"			statement.execute(\"CREATE TABLE IF NOT EXISTS \" + TABLE_KONTAKT + \"( \" + COLUMN_NAME + \" TEXT, \" + COLUMN_PHONE + \" INTEGER, \" + COLUMN_EMAIL + \" TEXT)\");\r\n" + 
					"			\r\n" + 
					"			// C - Create\r\n" + 
					"			createContact(statement, \"Alexander\", 1769952469, \"alexander.hergert@mail.com\");\r\n" + 
					"			// R - Read\r\n" + 
					"			readContacts(statement);\r\n" + 
					"			// U - Update\r\n" + 
					"			updateContact(statement, \"Alexander\", \"Hannah\");\r\n" + 
					"			// D - Delete\r\n" + 
					"			deleteContact(statement, \"Hannah\");\r\n" + 
					"			\r\n" + 
					"			statement.close();\r\n" + 
					"			connection.close();\r\n" + 
					"		} catch (SQLException e) {\r\n" + 
					"			// TODO Auto-generated catch block\r\n" + 
					"			e.printStackTrace();\r\n" + 
					"		}\r\n" + 
					"			\r\n" + 
					"		\r\n" + 
					"	}	\r\n" + 
					"	//CRUD\r\n" + 
					"		\r\n" + 
					"	private static void createContact(Statement statement, String name, int phone, String email) throws SQLException {\r\n" + 
					"		statement.execute(\"INSERT INTO \" + TABLE_KONTAKT + \" VALUES \" + \"('\" + name + \"',\" + phone + \",'\"+ email + \"')\");\r\n" + 
					"		\r\n" + 
					"	}\r\n" + 
					"		\r\n" + 
					"	private static void readContacts(Statement statement) throws SQLException {\r\n" + 
					"		ResultSet resultSet = statement.executeQuery(\"SELECT * FROM \" + TABLE_KONTAKT);\r\n" + 
					"	\r\n" + 
					"		while(resultSet.next()) {\r\n" + 
					"		System.out.println(resultSet.getString(COLUMN_NAME));\r\n" + 
					"		System.out.println(resultSet.getInt(COLUMN_PHONE));\r\n" + 
					"		System.out.println(resultSet.getString(COLUMN_EMAIL));\r\n" + 
					"		}\r\n" + 
					"	}	\r\n" + 
					"		\r\n" + 
					"	private static void updateContact(Statement statement, String currentName, String newName) throws SQLException {\r\n" + 
					"		statement.execute(\"UPDATE \" + TABLE_KONTAKT + \" SET \" + COLUMN_NAME + \" = '\" + newName + \"'\" + \" WHERE \" + COLUMN_NAME + \" = '\" + currentName + \"'\" + \" COLLATE NOCASE\");\r\n" + 
					"		\r\n" + 
					"	}	\r\n" + 
					"		\r\n" + 
					"	private static void deleteContact(Statement statement, String name) throws SQLException {\r\n" + 
					"		statement.execute(\"DELETE FROM \" + TABLE_KONTAKT + \" WHERE \" + COLUMN_NAME + \" = '\" + name + \"'\" + \" COLLATE NOCASE\");\r\n" + 
					"		\r\n" + 
					"	}		\r\n" + 
					"		\r\n" + 
					"}	");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(7).put("filewriter", "public static void main(String[] args){	\r\n" + 
					"	\r\n" + 
					"	File file = new File(\"save.dat\");\r\n" + 
					"	String text = \"text\";\r\n" + 
					"	HashMap<String, String> array = new HashMap<String, String>();\r\n" + 
					"	array.put(\"Hallo\", text );\r\n" + 
					"	\r\n" + 
					"	\r\n" + 
					"	\r\n" + 
					"	try {	\r\n" + 
					"		Scanner vonDatei = new Scanner(new FileReader(file));\r\n" + 
					"		\r\n" + 
					"		while(vonDatei.hasNextLine()) {\r\n" + 
					"			System.out.println(vonDatei.nextLine());\r\n" + 
					"		}\r\n" + 
					"		\r\n" + 
					"		FileWriter fileWriter = new FileWriter(file);\r\n" + 
					"		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);\r\n" + 
					"		PrintWriter writer = new PrintWriter(bufferedWriter);							\r\n" + 
					"		writer.println(array);\r\n" + 
					"		writer.flush();\r\n" + 
					"		writer.close();\r\n" + 
					"		vonDatei.close();\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"	}catch(Exception e) {}\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(8).put("hanoi", "public class hanoi {\r\n" + 
					"	\r\n" + 
					"	static int zaehler = 1;\r\n" + 
					"	\r\n" + 
					"	static void bewege(char quelle, char hilfe, char ziel, int anzahl) {\r\n" + 
					"		if(anzahl > 0) {\r\n" + 
					"		bewege(quelle, ziel, hilfe, anzahl-1);\r\n" + 
					"		System.out.printf(\"%4d\", zaehler++);\r\n" + 
					"		System.out.println(\" Bewege \" + quelle + \" nach \" + ziel);\r\n" + 
					"		bewege(hilfe, quelle, ziel, anzahl-1);\r\n" + 
					"		}\r\n" + 
					"		\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"	public static void main(String[] args) {\r\n" + 
					"		int n = 100;\r\n" + 
					"		bewege('A', 'B', 'C', n);\r\n" + 
					"\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(9).put("replace expression in array", "for (int j=0; j<textModel.getTextArray().size(); j++) {\r\n" + 
					"					   String replaceLetters = textModel.getTextArray().get(j);\r\n" + 
					"					   String oldLetter = \"'\";\r\n" + 
					"					   String newLetter = \"@@@\";\r\n" + 
					"					   replaceLetters = replaceLetters.replaceAll(oldLetter, newLetter);\r\n" + 
					"					   textModel.getTextArray().set(j, replaceLetters);\r\n" + 
					"					 }");
			


			
			
			
			for(int i = 0; i < listKeyValue.size(); i++) {
			
			allDatas.add(listKeyValue.get(i).toString());
			
			
			}
			
			
	}
	

}
