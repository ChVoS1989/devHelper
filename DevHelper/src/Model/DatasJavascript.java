package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class DatasJavascript extends Datas{
	
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
		listKeyValue.get(0).put("manipulate innerHtml", "<!DOCTYPE html>\r\n" + 
				"\r\n" + 
				"<html>\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <title>Complete JavaScript Course</title>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"    <div id=\"output\">Hello World</div>\r\n" + 
				"    <input type=\"text\" id=\"val\" >\r\n" + 
				"    <script>\r\n" + 
				"        var output = document.getElementById('output');\r\n" + 
				"        var val = document.getElementById('val');      \r\n" + 
				"        val.value = output.innerHTML;\r\n" + 
				"    </script>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(1).put("arrays", "<html>\r\n" + 
				" \r\n" + 
				"<head>\r\n" + 
				"    <title></title>\r\n" + 
				"</head>\r\n" + 
				" \r\n" + 
				"<body>\r\n" + 
				"    <script>\r\n" + 
				"        \r\n" + 
				"        var myArray = [\"string\",100,false]; // literal array\r\n" + 
				"        var myArray3 = [];\r\n" + 
				"        \r\n" + 
				"        var myArray1= new Array(\"string\",100,false);\r\n" + 
				"        var myArray2 = new Array();\r\n" + 
				"        \r\n" + 
				"        console.log(myArray[0]);\r\n" + 
				"        myArray[1] = \"New Value\";\r\n" + 
				"        console.log(myArray);      \r\n" + 
				"        \r\n" + 
				"    </script>\r\n" + 
				"</body>\r\n" + 
				" \r\n" + 
				"</html>");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(2).put("switch", "   var myTime = prompt(\"What are you doing?\");\r\n" + 
				"        var output = document.getElementById(\"output\");\r\n" + 
				"        var html;\r\n" + 
				"        \r\n" + 
				"        switch (myTime) {\r\n" + 
				"            case \"Get Up\":\r\n" + 
				"                html = \"8:00AM\";\r\n" + 
				"                break;\r\n" + 
				"            case \"Lunch\":\r\n" + 
				"                html =\"12:00PM\";\r\n" + 
				"                break;\r\n" + 
				"            case \"Dinner\":\r\n" + 
				"                html =\"6:00PM\";\r\n" + 
				"                break;\r\n" + 
				"            default:\r\n" + 
				"                html = \"Not found\";\r\n" + 
				"        }\r\n" + 
				"        \r\n" + 
				"        output.innerHTML = html;");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(3).put("nested loop", "var output = document.getElementById(\"output\");\r\n" + 
				"        \r\n" + 
				"        var html =\"<table>\";\r\n" + 
				"        \r\n" + 
				"        for(var row = 0; row < 10; row++){\r\n" + 
				"            html += \"<tr>\";\r\n" + 
				"            for(var col = 0; col < 5 ;col++){\r\n" + 
				"                html +=\"<td>Cell = \"+((col+1)+(row*5))+\"</td>\";\r\n" + 
				"            }\r\n" + 
				"            html += \"</tr>\";\r\n" + 
				"        }\r\n" + 
				"        \r\n" + 
				"        html += \"</table>\";\r\n" + 
				"        output.innerHTML = html;");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(4).put("do while", "var output = document.getElementById(\"output\");\r\n" + 
				"        var answer = prompt(\"How many times do you want me to loop?\");\r\n" + 
				"        answer = Number(answer);\r\n" + 
				"        var x = 0;\r\n" + 
				"        do {\r\n" + 
				"            x++;\r\n" + 
				"            output.innerHTML += \"value x = \"+x+\"<br>\";\r\n" + 
				"        }\r\n" + 
				"        while (x < answer);\r\n" + 
				"        output.innerHTML += \"Final value of x = \"+x+\"<br>\";\r\n" + 
				"        var output = document.getElementById(\"output\");\r\n" + 
				"        var x = 0;\r\n" + 
				"        do {\r\n" + 
				"            if(x % 2 === 0){\r\n" + 
				"            output.innerHTML += \"value x = \"+x+\"<br>\";\r\n" + 
				"            }\r\n" + 
				"            x++;\r\n" + 
				"        }\r\n" + 
				"        while (x < 30);\r\n" + 
				"        output.innerHTML += \"Final value of x = \"+x+\"<br>\";");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(5).put("functions", "     var response = \"55\"; // global\r\n" + 
				"        myFun1(4,5,6);\r\n" + 
				"        \r\n" + 
				"        var a = \"hello\";\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        output.innerHTML = myFun2();\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        function myFun2(){\r\n" + 
				"            var b = a + \" \" + \"world\";\r\n" + 
				"            return b;\r\n" + 
				"        }\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        function myFun1(a,b,c){\r\n" + 
				"            response = a + b + c; //global\r\n" + 
				"            var response = a + b + c; //local\r\n" + 
				"            output.innerHTML = response;\r\n" + 
				"            return response;\r\n" + 
				"        }");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(6).put("self invoking funtion", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <title>Complete JavaScript Course</title>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"    <div id=\"output\"></div>\r\n" + 
				"    <script>\r\n" + 
				"        var a = \" World\";\r\n" + 
				"        var output = document.getElementById(\"output\");\r\n" + 
				"        (function () {\r\n" + 
				"            var a = \"Hello\";\r\n" + 
				"            output.innerHTML = a;\r\n" + 
				"        })();\r\n" + 
				"        output.innerHTML += a;\r\n" + 
				"    </script>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(7).put("callbacks", "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <title>Complete JavaScript Course</title>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body> \r\n" + 
				"\r\n" + 
				"    <div id=\"output\"></div>\r\n" + 
				"    <script>\r\n" + 
				"        var output = document.getElementById(\"output\");\r\n" + 
				"\r\n" + 
				"        function makeMessage(s1, s2, callback) {\r\n" + 
				"            var result1 = callback(s1, s2);\r\n" + 
				"            output.innerHTML += result1;\r\n" + 
				"        }\r\n" + 
				"        makeMessage(\"hello\", \"world\", function (s1, s2) {\r\n" + 
				"            var result2 = s1 + s2 + \"worked\";\r\n" + 
				"            return result2;\r\n" + 
				"        })\r\n" + 
				"        makeMessage(\"Java\", \"Script\", function (s1, s2) {\r\n" + 
				"            var result2 = s1 + s2 + \" is great\" + s1;\r\n" + 
				"            return result2;\r\n" + 
				"        })\r\n" + 
				"    </script>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(8).put("get elements by id", "<html>\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <style>\r\n" + 
				"\r\n" + 
				"    </style>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"    <div id=\"output\"></div>\r\n" + 
				"    <form name=\"myForm\">\r\n" + 
				"        <input type=\"url\" id=\"url\" name=\"url\">\r\n" + 
				"        <input type=\"text\" id=\"first\" name=\"first\">\r\n" + 
				"        <input type=\"text\" id=\"last\" name=\"last\">\r\n" + 
				"        <textarea name=\"output1\"></textarea>\r\n" + 
				"        <div id=\"another\">Parent\r\n" + 
				"            <div id=\"one\">Test 1</div>\r\n" + 
				"            <div id=\"two\">Test 2</div>\r\n" + 
				"            <div id=\"three\">Test 3</div>\r\n" + 
				"            <div id=\"four\">Test 4</div>\r\n" + 
				"            <div id=\"five\">Test 5</div>\r\n" + 
				"            <div id=\"six\">Test 6</div>\r\n" + 
				"        </div>\r\n" + 
				"        <input id=\"btn1\" type=\"button\" onclick=\"myFun1()\" value=\"Click Here\"> </form>\r\n" + 
				"    <script>\r\n" + 
				"        var output = document.getElementById('output');\r\n" + 
				"        var divList = document.getElementsByTagName('div');\r\n" + 
				"        divList[7].innerHTML = \"Welcome to my website\";\r\n" + 
				"\r\n" + 
				"        function myFun1() {\r\n" + 
				"            var html = \"<h1>Div list</h1>\";\r\n" + 
				"            for (var x = 1; x < divList.length; x++) {\r\n" + 
				"                if (!divList[x].firstElementChild) {\r\n" + 
				"                    html += divList[x].innerText + \"<br>\";\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"            divList[0].innerHTML = html;\r\n" + 
				"        }\r\n" + 
				"    </script>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(9).put("query selector", "<html>\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <style>\r\n" + 
				"        div .output {\r\n" + 
				"            background-color: red;\r\n" + 
				"        }\r\n" + 
				"    </style>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"    <div id=\"message\">Message 1</div>\r\n" + 
				"    <div class=\"output\">Test Me 1</div>\r\n" + 
				"    <div class=\"output\">Test Me 2</div>\r\n" + 
				"    <div id=\"pickme1\">\r\n" + 
				"        <div class=\"output highlight\">Test Me 3</div>\r\n" + 
				"    </div>\r\n" + 
				"    <input type=\"text\" name=\"queryStuff\" id=\"queryStuff\">\r\n" + 
				"    <input type=\"button\" onclick=\"mySel()\" value=\"Get Query\">\r\n" + 
				"    <div id=\"pickme2\">\r\n" + 
				"        <div class=\"output\">Test Me 4</div>\r\n" + 
				"        <div class=\"output\">Test Me 5</div>\r\n" + 
				"        <div class=\"output\">Test Me 6</div>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"output highlight\">Test Me 7</div>\r\n" + 
				"    <div class=\"output\">Test Me 8</div>\r\n" + 
				"    <div class=\"output\">Test Me 9</div>\r\n" + 
				"    <div class=\"output\">Test Me 10</div>\r\n" + 
				"    <script>\r\n" + 
				"        function mySel() {\r\n" + 
				"            var a = document.getElementById('queryStuff').value;\r\n" + 
				"            var el = qs(a);\r\n" + 
				"            var html = \"Results<br>\";\r\n" + 
				"            for (var x = 0; x < el.length; x++) {\r\n" + 
				"                html += el[x].innerText + \"<br>\";\r\n" + 
				"            }\r\n" + 
				"            document.getElementById('message').innerHTML = html;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        function qs(el) {\r\n" + 
				"            return document.querySelectorAll(el);\r\n" + 
				"        }\r\n" + 
				"    </script>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>");
			
			
			for(int i = 0; i < listKeyValue.size(); i++) {
			
			allDatas.add(listKeyValue.get(i).toString());
			
			
			}
			
			
	}	

}
