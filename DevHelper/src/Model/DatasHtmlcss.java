package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class DatasHtmlcss extends Datas{
	
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
		listKeyValue.get(0).put("paragraphs", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<p>This is a paragraph.</p>\r\n" + 
				"<p>This is a paragraph.</p>\r\n" + 
				"<p>This is a paragraph.</p>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(1).put("colors", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h1 style=\"background-color:Tomato;\">Tomato</h1>\r\n" + 
				"<h1 style=\"background-color:Orange;\">Orange</h1>\r\n" + 
				"<h1 style=\"background-color:DodgerBlue;\">DodgerBlue</h1>\r\n" + 
				"<h1 style=\"background-color:MediumSeaGreen;\">MediumSeaGreen</h1>\r\n" + 
				"<h1 style=\"background-color:Gray;\">Gray</h1>\r\n" + 
				"<h1 style=\"background-color:SlateBlue;\">SlateBlue</h1>\r\n" + 
				"<h1 style=\"background-color:Violet;\">Violet</h1>\r\n" + 
				"<h1 style=\"background-color:LightGray;\">LightGray</h1>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(2).put("links", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h2>HTML Links</h2>\r\n" + 
				"<p><a href=\"https://www.w3schools.com/html/\">Visit our HTML tutorial</a></p>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(3).put("images", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h2>HTML Image</h2>\r\n" + 
				"<img src=\"pic_trulli.jpg\" alt=\"Trulli\" width=\"500\" height=\"333\">\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(4).put("tables", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<style>\r\n" + 
				"table {\r\n" + 
				"    font-family: arial, sans-serif;\r\n" + 
				"    border-collapse: collapse;\r\n" + 
				"    width: 100%;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"td, th {\r\n" + 
				"    border: 1px solid #dddddd;\r\n" + 
				"    text-align: left;\r\n" + 
				"    padding: 8px;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"tr:nth-child(even) {\r\n" + 
				"    background-color: #dddddd;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h2>HTML Table</h2>\r\n" + 
				"\r\n" + 
				"<table>\r\n" + 
				"  <tr>\r\n" + 
				"    <th>Company</th>\r\n" + 
				"    <th>Contact</th>\r\n" + 
				"    <th>Country</th>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Alfreds Futterkiste</td>\r\n" + 
				"    <td>Maria Anders</td>\r\n" + 
				"    <td>Germany</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Centro comercial Moctezuma</td>\r\n" + 
				"    <td>Francisco Chang</td>\r\n" + 
				"    <td>Mexico</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Ernst Handel</td>\r\n" + 
				"    <td>Roland Mendel</td>\r\n" + 
				"    <td>Austria</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Island Trading</td>\r\n" + 
				"    <td>Helen Bennett</td>\r\n" + 
				"    <td>UK</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Laughing Bacchus Winecellars</td>\r\n" + 
				"    <td>Yoshi Tannamuri</td>\r\n" + 
				"    <td>Canada</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Magazzini Alimentari Riuniti</td>\r\n" + 
				"    <td>Giovanni Rovelli</td>\r\n" + 
				"    <td>Italy</td>\r\n" + 
				"  </tr>\r\n" + 
				"</table>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(5).put("iframes", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h2>HTML Iframes</h2>\r\n" + 
				"<p>You can use the height and width attributes to specify the size of the iframe:</p>\r\n" + 
				"\r\n" + 
				"<iframe src=\"demo_iframe.htm\" height=\"200\" width=\"300\"></iframe>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(6).put("audio", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<audio controls>\r\n" + 
				"  <source src=\"horse.ogg\" type=\"audio/ogg\">\r\n" + 
				"  <source src=\"horse.mp3\" type=\"audio/mpeg\">\r\n" + 
				"Your browser does not support the audio element.\r\n" + 
				"</audio>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(7).put("borders", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<style>\r\n" + 
				"p.dotted {border-style: dotted;}\r\n" + 
				"p.dashed {border-style: dashed;}\r\n" + 
				"p.solid {border-style: solid;}\r\n" + 
				"p.double {border-style: double;}\r\n" + 
				"p.groove {border-style: groove;}\r\n" + 
				"p.ridge {border-style: ridge;}\r\n" + 
				"p.inset {border-style: inset;}\r\n" + 
				"p.outset {border-style: outset;}\r\n" + 
				"p.none {border-style: none;}\r\n" + 
				"p.hidden {border-style: hidden;}\r\n" + 
				"p.mix {border-style: dotted dashed solid double;}\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h2>The border-style Property</h2>\r\n" + 
				"<p>This property specifies what kind of border to display:</p>\r\n" + 
				"\r\n" + 
				"<p class=\"dotted\">A dotted border.</p>\r\n" + 
				"<p class=\"dashed\">A dashed border.</p>\r\n" + 
				"<p class=\"solid\">A solid border.</p>\r\n" + 
				"<p class=\"double\">A double border.</p>\r\n" + 
				"<p class=\"groove\">A groove border.</p>\r\n" + 
				"<p class=\"ridge\">A ridge border.</p>\r\n" + 
				"<p class=\"inset\">An inset border.</p>\r\n" + 
				"<p class=\"outset\">An outset border.</p>\r\n" + 
				"<p class=\"none\">No border.</p>\r\n" + 
				"<p class=\"hidden\">A hidden border.</p>\r\n" + 
				"<p class=\"mix\">A mixed border.</p>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(8).put("dropdowns", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<style>\r\n" + 
				".dropdown {\r\n" + 
				"    position: relative;\r\n" + 
				"    display: inline-block;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".dropdown-content {\r\n" + 
				"    display: none;\r\n" + 
				"    position: absolute;\r\n" + 
				"    background-color: #f9f9f9;\r\n" + 
				"    min-width: 160px;\r\n" + 
				"    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n" + 
				"    padding: 12px 16px;\r\n" + 
				"    z-index: 1;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".dropdown:hover .dropdown-content {\r\n" + 
				"    display: block;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h2>Hoverable Dropdown</h2>\r\n" + 
				"<p>Move the mouse over the text below to open the dropdown content.</p>\r\n" + 
				"\r\n" + 
				"<div class=\"dropdown\">\r\n" + 
				"  <span>Mouse over me</span>\r\n" + 
				"  <div class=\"dropdown-content\">\r\n" + 
				"    <p>Hello World!</p>\r\n" + 
				"  </div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(9).put("margin", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<style>\r\n" + 
				"div {\r\n" + 
				"    border: 1px solid black;\r\n" + 
				"    margin-top: 100px;\r\n" + 
				"    margin-bottom: 100px;\r\n" + 
				"    margin-right: 150px;\r\n" + 
				"    margin-left: 80px;\r\n" + 
				"    background-color: lightblue;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h2>Using individual margin properties</h2>\r\n" + 
				"\r\n" + 
				"<div>This div element has a top margin of 100px, a right margin of 150px, a bottom margin of 100px, and a left margin of 80px.</div>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
			
			
			for(int i = 0; i < listKeyValue.size(); i++) {
			
			allDatas.add(listKeyValue.get(i).toString());
			
			
			}
			
			
	}

}
