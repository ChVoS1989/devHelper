package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class DatasAndroid extends Datas{
	
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
		listKeyValue.get(0).put("animations", "import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.util.Log;\r\n" + 
				"import android.view.View;\r\n" + 
				"import android.widget.ImageView;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    boolean bartIsShowing = true;\r\n" + 
				"\r\n" + 
				"    public void fade(View view) {\r\n" + 
				"\r\n" + 
				"        Log.i(\"Info\", \"Imageview tapped\");\r\n" + 
				"\r\n" + 
				"        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView); //use your own image\r\n" + 
				"\r\n" + 
				"        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView); //use your own image\r\n" + 
				"\r\n" + 
				"        if (bartIsShowing) {\r\n" + 
				"\r\n" + 
				"            bartIsShowing = false;\r\n" + 
				"\r\n" + 
				"            bartImageView.animate().alpha(0).setDuration(2000);\r\n" + 
				"\r\n" + 
				"            homerImageView.animate().alpha(1).setDuration(2000);\r\n" + 
				"\r\n" + 
				"        } else {\r\n" + 
				"\r\n" + 
				"            bartIsShowing = true;\r\n" + 
				"\r\n" + 
				"            bartImageView.animate().alpha(1).setDuration(2000);\r\n" + 
				"\r\n" + 
				"            homerImageView.animate().alpha(0).setDuration(2000);\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"    }\r\n" + 
				"}");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(1).put("braingame", "import android.os.CountDownTimer;\r\n" + 
				"import android.support.constraint.ConstraintLayout;\r\n" + 
				"import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.util.Log;\r\n" + 
				"import android.view.View;\r\n" + 
				"import android.widget.Button;\r\n" + 
				"import android.widget.TextView;\r\n" + 
				"\r\n" + 
				"import java.util.ArrayList;\r\n" + 
				"import java.util.Random;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    Button goButton;\r\n" + 
				"    ArrayList<Integer> answers = new ArrayList<Integer>();\r\n" + 
				"    int locationOfCorrectAnswer;\r\n" + 
				"    TextView resultTextView;\r\n" + 
				"    int score = 0;\r\n" + 
				"    int numberOfQuestions = 0;\r\n" + 
				"    TextView scoreTextView;\r\n" + 
				"    Button button0;\r\n" + 
				"    Button button1;\r\n" + 
				"    Button button2;\r\n" + 
				"    Button button3;\r\n" + 
				"    TextView sumTextView;\r\n" + 
				"    TextView timerTextView;\r\n" + 
				"    Button playAgainButton;\r\n" + 
				"    ConstraintLayout gameLayout;\r\n" + 
				"\r\n" + 
				"    public void playAgain(View view) {\r\n" + 
				"        score = 0;\r\n" + 
				"        numberOfQuestions = 0;\r\n" + 
				"        timerTextView.setText(\"30s\");\r\n" + 
				"        scoreTextView.setText(Integer.toString(score)+\"/\"+Integer.toString(numberOfQuestions));\r\n" + 
				"        newQuestion();\r\n" + 
				"        playAgainButton.setVisibility(View.INVISIBLE);\r\n" + 
				"        resultTextView.setText(\"\");\r\n" + 
				"\r\n" + 
				"        new CountDownTimer(30100,1000) {\r\n" + 
				"\r\n" + 
				"            @Override\r\n" + 
				"            public void onTick(long l) {\r\n" + 
				"                timerTextView.setText(String.valueOf(l / 1000) + \"s\");\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            @Override\r\n" + 
				"            public void onFinish() {\r\n" + 
				"                resultTextView.setText(\"Done!\");\r\n" + 
				"                playAgainButton.setVisibility(View.VISIBLE);\r\n" + 
				"            }\r\n" + 
				"        }.start();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public void chooseAnswer(View view) {\r\n" + 
				"       if (Integer.toString(locationOfCorrectAnswer).equals(view.getTag().toString())) {\r\n" + 
				"           resultTextView.setText(\"Correct!\");\r\n" + 
				"           score++;\r\n" + 
				"       } else {\r\n" + 
				"           resultTextView.setText(\"Wrong :(\");\r\n" + 
				"       }\r\n" + 
				"       numberOfQuestions++;\r\n" + 
				"       scoreTextView.setText(Integer.toString(score)+\"/\"+Integer.toString(numberOfQuestions));\r\n" + 
				"       newQuestion();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public void start(View view) {\r\n" + 
				"        goButton.setVisibility(View.INVISIBLE);\r\n" + 
				"        gameLayout.setVisibility(View.VISIBLE);\r\n" + 
				"        playAgain(findViewById(R.id.timerTextView));\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public void newQuestion() {\r\n" + 
				"        Random rand = new Random();\r\n" + 
				"\r\n" + 
				"        int a = rand.nextInt(21);\r\n" + 
				"        int b = rand.nextInt(21);\r\n" + 
				"\r\n" + 
				"        sumTextView.setText(Integer.toString(a) + \" + \" + Integer.toString(b));\r\n" + 
				"\r\n" + 
				"        locationOfCorrectAnswer = rand.nextInt(4);\r\n" + 
				"\r\n" + 
				"        answers.clear();\r\n" + 
				"\r\n" + 
				"        for (int i=0; i<4; i++) {\r\n" + 
				"            if (i == locationOfCorrectAnswer) {\r\n" + 
				"                answers.add(a+b);\r\n" + 
				"            } else {\r\n" + 
				"                int wrongAnswer = rand.nextInt(41);\r\n" + 
				"\r\n" + 
				"                while (wrongAnswer == a+b) {\r\n" + 
				"                    wrongAnswer = rand.nextInt(41);\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                answers.add(wrongAnswer);\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        button0.setText(Integer.toString(answers.get(0)));\r\n" + 
				"        button1.setText(Integer.toString(answers.get(1)));\r\n" + 
				"        button2.setText(Integer.toString(answers.get(2)));\r\n" + 
				"        button3.setText(Integer.toString(answers.get(3)));\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"\r\n" + 
				"        sumTextView = findViewById(R.id.sumTextView);\r\n" + 
				"        button0 = findViewById(R.id.button0);\r\n" + 
				"        button1 = findViewById(R.id.button1);\r\n" + 
				"        button2 = findViewById(R.id.button2);\r\n" + 
				"        button3 = findViewById(R.id.button3);\r\n" + 
				"        resultTextView = findViewById(R.id.resultTextView);\r\n" + 
				"        scoreTextView = findViewById(R.id.scoreTextView);\r\n" + 
				"        timerTextView = findViewById(R.id.timerTextView);\r\n" + 
				"        playAgainButton = findViewById(R.id.playAgainButton);\r\n" + 
				"        gameLayout = findViewById(R.id.gameLayout);\r\n" + 
				"        goButton = findViewById(R.id.goButton);\r\n" + 
				"\r\n" + 
				"        goButton.setVisibility(View.VISIBLE);\r\n" + 
				"        gameLayout.setVisibility(View.INVISIBLE);\r\n" + 
				"    }\r\n" + 
				"}");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(2).put("tictactoe", "import android.media.Image;\r\n" + 
				"import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.util.Log;\r\n" + 
				"import android.view.View;\r\n" + 
				"import android.widget.Button;\r\n" + 
				"import android.widget.GridLayout;\r\n" + 
				"import android.widget.ImageView;\r\n" + 
				"import android.widget.TextView;\r\n" + 
				"import android.widget.Toast;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    // 0: yellow, 1: red, 2: empty\r\n" + 
				"\r\n" + 
				"    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};\r\n" + 
				"\r\n" + 
				"    int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};\r\n" + 
				"\r\n" + 
				"    int activePlayer = 0;\r\n" + 
				"\r\n" + 
				"    boolean gameActive = true;\r\n" + 
				"\r\n" + 
				"    public void dropIn(View view) {\r\n" + 
				"\r\n" + 
				"        ImageView counter = (ImageView) view;\r\n" + 
				"\r\n" + 
				"        int tappedCounter = Integer.parseInt(counter.getTag().toString());\r\n" + 
				"\r\n" + 
				"        if (gameState[tappedCounter] == 2 && gameActive) {\r\n" + 
				"\r\n" + 
				"            gameState[tappedCounter] = activePlayer;\r\n" + 
				"\r\n" + 
				"            counter.setTranslationY(-1500);\r\n" + 
				"\r\n" + 
				"            if (activePlayer == 0) {\r\n" + 
				"\r\n" + 
				"                counter.setImageResource(R.drawable.yellow);\r\n" + 
				"\r\n" + 
				"                activePlayer = 1;\r\n" + 
				"\r\n" + 
				"            } else {\r\n" + 
				"\r\n" + 
				"                counter.setImageResource(R.drawable.red);\r\n" + 
				"\r\n" + 
				"                activePlayer = 0;\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            counter.animate().translationYBy(1500).rotation(3600).setDuration(300);\r\n" + 
				"\r\n" + 
				"            for (int[] winningPosition : winningPositions) {\r\n" + 
				"\r\n" + 
				"                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[0]] != 2) {\r\n" + 
				"\r\n" + 
				"                    // Somone has won!\r\n" + 
				"\r\n" + 
				"                    gameActive = false;\r\n" + 
				"\r\n" + 
				"                    String winner = \"\";\r\n" + 
				"\r\n" + 
				"                    if (activePlayer == 1) {\r\n" + 
				"\r\n" + 
				"                        winner = \"Yellow\";\r\n" + 
				"\r\n" + 
				"                    } else {\r\n" + 
				"\r\n" + 
				"                        winner = \"Red\";\r\n" + 
				"\r\n" + 
				"                    }\r\n" + 
				"\r\n" + 
				"                    Button playAgainButton = (Button) findViewById(R.id.playAgainButton);\r\n" + 
				"\r\n" + 
				"                    TextView winnerTextView = (TextView) findViewById(R.id.winnerTextView);\r\n" + 
				"\r\n" + 
				"                    winnerTextView.setText(winner + \" has won!\");\r\n" + 
				"\r\n" + 
				"                    playAgainButton.setVisibility(View.VISIBLE);\r\n" + 
				"\r\n" + 
				"                    winnerTextView.setVisibility(View.VISIBLE);\r\n" + 
				"\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public void playAgain(View view) {\r\n" + 
				"\r\n" + 
				"        Button playAgainButton = (Button) findViewById(R.id.playAgainButton);\r\n" + 
				"\r\n" + 
				"        TextView winnerTextView = (TextView) findViewById(R.id.winnerTextView);\r\n" + 
				"\r\n" + 
				"        playAgainButton.setVisibility(View.INVISIBLE);\r\n" + 
				"\r\n" + 
				"        winnerTextView.setVisibility(View.INVISIBLE);\r\n" + 
				"\r\n" + 
				"        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);\r\n" + 
				"\r\n" + 
				"        for(int i=0; i<gridLayout.getChildCount(); i++) {\r\n" + 
				"\r\n" + 
				"            ImageView counter = (ImageView) gridLayout.getChildAt(i);\r\n" + 
				"\r\n" + 
				"            counter.setImageDrawable(null);\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        for (int i=0; i<gameState.length; i++) {\r\n" + 
				"\r\n" + 
				"            gameState[i] = 2;\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        activePlayer = 0;\r\n" + 
				"\r\n" + 
				"        gameActive = true;\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"    }\r\n" + 
				"}");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(3).put("database", "import android.database.Cursor;\r\n" + 
				"import android.database.sqlite.SQLiteDatabase;\r\n" + 
				"import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.util.Log;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"\r\n" + 
				"        try {\r\n" + 
				"\r\n" + 
				"            SQLiteDatabase sqLiteDatabase = this.openOrCreateDatabase(\"Events\", MODE_PRIVATE, null);\r\n" + 
				"            sqLiteDatabase.execSQL(\"CREATE TABLE IF NOT EXISTS events (name VARCHAR, year INT(4))\");\r\n" + 
				"            sqLiteDatabase.execSQL(\"INSERT INTO events (name, year) VALUES ('Milenieum',2000)\");\r\n" + 
				"            sqLiteDatabase.execSQL(\"INSERT INTO events (name, year) VALUES ('Nick started teaching',2014)\");\r\n" + 
				"\r\n" + 
				"            Cursor c = sqLiteDatabase.rawQuery(\"SELECT * FROM events\", null);\r\n" + 
				"            int nameIndex = c.getColumnIndex(\"name\");\r\n" + 
				"            int yearIndex = c.getColumnIndex(\"year\");\r\n" + 
				"            c.moveToFirst();\r\n" + 
				"\r\n" + 
				"            while (c != null) {\r\n" + 
				"                Log.i(\"Results - name\", c.getString(nameIndex));\r\n" + 
				"                Log.i(\"Results - year\", Integer.toString(c.getInt(yearIndex)));\r\n" + 
				"\r\n" + 
				"                c.moveToNext();\r\n" + 
				"            }\r\n" + 
				"        } catch (Exception e) {\r\n" + 
				"            e.printStackTrace();\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(4).put("using web content", "import android.os.AsyncTask;\r\n" + 
				"import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.util.Log;\r\n" + 
				"\r\n" + 
				"import java.io.InputStream;\r\n" + 
				"import java.io.InputStreamReader;\r\n" + 
				"import java.net.HttpURLConnection;\r\n" + 
				"import java.net.MalformedURLException;\r\n" + 
				"import java.net.URL;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    public class DownloadTask extends AsyncTask<String, Void, String> {\r\n" + 
				"\r\n" + 
				"        @Override\r\n" + 
				"        protected String doInBackground(String... urls) {\r\n" + 
				"\r\n" + 
				"            String result = \"\";\r\n" + 
				"            URL url;\r\n" + 
				"            HttpURLConnection urlConnection = null;\r\n" + 
				"\r\n" + 
				"            try {\r\n" + 
				"                url = new URL(urls[0]);\r\n" + 
				"                urlConnection = (HttpURLConnection) url.openConnection();\r\n" + 
				"                InputStream in = urlConnection.getInputStream();\r\n" + 
				"                InputStreamReader reader = new InputStreamReader(in);\r\n" + 
				"                int data = reader.read();\r\n" + 
				"\r\n" + 
				"                while (data != -1) {\r\n" + 
				"                    char current = (char) data;\r\n" + 
				"\r\n" + 
				"                    result += current;\r\n" + 
				"\r\n" + 
				"                    data = reader.read();\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                return result;\r\n" + 
				"\r\n" + 
				"            } catch (Exception e) {\r\n" + 
				"                e.printStackTrace();\r\n" + 
				"\r\n" + 
				"                return \"Failed\";\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"\r\n" + 
				"        DownloadTask task = new DownloadTask();\r\n" + 
				"        String result = null;\r\n" + 
				"        try {\r\n" + 
				"            result = task.execute(\"http://www.zappycode.com\").get();\r\n" + 
				"        } catch (Exception e) {\r\n" + 
				"            e.printStackTrace();\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        Log.i(\"Result\",result);\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(5).put("timer", "import android.media.MediaPlayer;\r\n" + 
				"import android.os.CountDownTimer;\r\n" + 
				"import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.util.Log;\r\n" + 
				"import android.view.View;\r\n" + 
				"import android.widget.Button;\r\n" + 
				"import android.widget.SeekBar;\r\n" + 
				"import android.widget.TextView;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    TextView timerTextView;\r\n" + 
				"    SeekBar timerSeekBar;\r\n" + 
				"    Boolean counterIsActive = false;\r\n" + 
				"    Button goButton;\r\n" + 
				"    CountDownTimer countDownTimer;\r\n" + 
				"\r\n" + 
				"    public void resetTimer() {\r\n" + 
				"        timerTextView.setText(\"0:30\");\r\n" + 
				"        timerSeekBar.setProgress(30);\r\n" + 
				"        timerSeekBar.setEnabled(true);\r\n" + 
				"        countDownTimer.cancel();\r\n" + 
				"        goButton.setText(\"GO!\");\r\n" + 
				"        counterIsActive = false;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public void buttonClicked(View view) {\r\n" + 
				"\r\n" + 
				"        if (counterIsActive) {\r\n" + 
				"\r\n" + 
				"            resetTimer();\r\n" + 
				"\r\n" + 
				"        } else {\r\n" + 
				"\r\n" + 
				"            counterIsActive = true;\r\n" + 
				"            timerSeekBar.setEnabled(false);\r\n" + 
				"            goButton.setText(\"STOP!\");\r\n" + 
				"\r\n" + 
				"            countDownTimer = new CountDownTimer(timerSeekBar.getProgress() * 1000 + 100, 1000) {\r\n" + 
				"\r\n" + 
				"                @Override\r\n" + 
				"                public void onTick(long l) {\r\n" + 
				"                    updateTimer((int) l / 1000);\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                @Override\r\n" + 
				"                public void onFinish() {\r\n" + 
				"                    MediaPlayer mplayer = MediaPlayer.create(getApplicationContext(), R.raw.airhorn);\r\n" + 
				"                    mplayer.start();\r\n" + 
				"                    resetTimer();\r\n" + 
				"                }\r\n" + 
				"            }.start();\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public void updateTimer(int secondsLeft) {\r\n" + 
				"        int minutes = secondsLeft / 60;\r\n" + 
				"        int seconds = secondsLeft - (minutes * 60);\r\n" + 
				"\r\n" + 
				"        String secondString = Integer.toString(seconds);\r\n" + 
				"\r\n" + 
				"        if (seconds <= 9) {\r\n" + 
				"            secondString = \"0\" + secondString;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        timerTextView.setText(Integer.toString(minutes) + \":\" + secondString);\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"\r\n" + 
				"        timerSeekBar = findViewById(R.id.timerSeekBar);\r\n" + 
				"        timerTextView = findViewById(R.id.countdownTextView);\r\n" + 
				"        goButton = findViewById(R.id.goButton);\r\n" + 
				"\r\n" + 
				"        timerSeekBar.setMax(600);\r\n" + 
				"        timerSeekBar.setProgress(30);\r\n" + 
				"\r\n" + 
				"        timerSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\r\n" + 
				"            @Override\r\n" + 
				"            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {\r\n" + 
				"                updateTimer(i);\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            @Override\r\n" + 
				"            public void onStartTrackingTouch(SeekBar seekBar) {\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            @Override\r\n" + 
				"            public void onStopTrackingTouch(SeekBar seekBar) {\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(6).put("JASON", "import android.os.AsyncTask;\r\n" + 
				"import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.util.Log;\r\n" + 
				"import org.json.JSONArray;\r\n" + 
				"import org.json.JSONObject;\r\n" + 
				"import java.io.InputStream;\r\n" + 
				"import java.io.InputStreamReader;\r\n" + 
				"import java.net.HttpURLConnection;\r\n" + 
				"import java.net.URL;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    public class DownloadTask extends AsyncTask<String,Void,String> {\r\n" + 
				"\r\n" + 
				"        @Override\r\n" + 
				"        protected String doInBackground(String... urls) {\r\n" + 
				"            String result = \"\";\r\n" + 
				"            URL url;\r\n" + 
				"            HttpURLConnection urlConnection = null;\r\n" + 
				"\r\n" + 
				"            try {\r\n" + 
				"\r\n" + 
				"                url = new URL(urls[0]);\r\n" + 
				"                urlConnection = (HttpURLConnection) url.openConnection();\r\n" + 
				"                InputStream in = urlConnection.getInputStream();\r\n" + 
				"                InputStreamReader reader = new InputStreamReader(in);\r\n" + 
				"                int data = reader.read();\r\n" + 
				"\r\n" + 
				"                while (data != -1) {\r\n" + 
				"                    char current = (char) data;\r\n" + 
				"                    result += current;\r\n" + 
				"                    data = reader.read();\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"                return result;\r\n" + 
				"\r\n" + 
				"            } catch (Exception e) {\r\n" + 
				"                e.printStackTrace();\r\n" + 
				"                return null;\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        @Override\r\n" + 
				"        protected void onPostExecute(String s) {\r\n" + 
				"            super.onPostExecute(s);\r\n" + 
				"\r\n" + 
				"            try {\r\n" + 
				"                JSONObject jsonObject = new JSONObject(s);\r\n" + 
				"\r\n" + 
				"                String weatherInfo = jsonObject.getString(\"weather\");\r\n" + 
				"\r\n" + 
				"                Log.i(\"Weather content\", weatherInfo);\r\n" + 
				"\r\n" + 
				"                JSONArray arr = new JSONArray(weatherInfo);\r\n" + 
				"\r\n" + 
				"                for (int i=0; i < arr.length(); i++) {\r\n" + 
				"                    JSONObject jsonPart = arr.getJSONObject(i);\r\n" + 
				"\r\n" + 
				"                    Log.i(\"main\",jsonPart.getString(\"main\"));\r\n" + 
				"                    Log.i(\"description\",jsonPart.getString(\"description\"));\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"            } catch (Exception e) {\r\n" + 
				"                e.printStackTrace();\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"\r\n" + 
				"        DownloadTask task = new DownloadTask();\r\n" + 
				"        task.execute(\"http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1\");\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(7).put("listView", "import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.util.Log;\r\n" + 
				"import android.view.View;\r\n" + 
				"import android.widget.AdapterView;\r\n" + 
				"import android.widget.ArrayAdapter;\r\n" + 
				"import android.widget.ListView;\r\n" + 
				"import android.widget.Toast;\r\n" + 
				"import java.util.ArrayList;\r\n" + 
				"import static java.util.Arrays.asList;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"\r\n" + 
				"        ListView friendsListView = findViewById(R.id.friendListView);\r\n" + 
				"\r\n" + 
				"        final ArrayList<String> myFriends = new ArrayList<String>(asList(\"Mark\",\"Jane\",\"Sussy\",\"Jan\"));\r\n" + 
				"\r\n" + 
				"        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, myFriends);\r\n" + 
				"\r\n" + 
				"        friendsListView.setAdapter(arrayAdapter);\r\n" + 
				"\r\n" + 
				"        friendsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {\r\n" + 
				"            @Override\r\n" + 
				"            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {\r\n" + 
				"\r\n" + 
				"                Toast.makeText(getApplicationContext(), \"Hello \" + myFriends.get(i), Toast.LENGTH_LONG).show();\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"    }\r\n" + 
				"}");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(8).put("location", "import android.Manifest;\r\n" + 
				"import android.accounts.AccountAuthenticatorResponse;\r\n" + 
				"import android.content.Context;\r\n" + 
				"import android.content.pm.PackageManager;\r\n" + 
				"import android.location.Location;\r\n" + 
				"import android.location.LocationListener;\r\n" + 
				"import android.location.LocationManager;\r\n" + 
				"import android.support.annotation.NonNull;\r\n" + 
				"import android.support.v4.app.ActivityCompat;\r\n" + 
				"import android.support.v4.content.ContextCompat;\r\n" + 
				"import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.util.Log;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    LocationManager locationManager;\r\n" + 
				"    LocationListener locationListener;\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\r\n" + 
				"        super.onRequestPermissionsResult(requestCode, permissions, grantResults);\r\n" + 
				"\r\n" + 
				"            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\r\n" + 
				"\r\n" + 
				"                if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {\r\n" + 
				"\r\n" + 
				"                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"\r\n" + 
				"        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);\r\n" + 
				"\r\n" + 
				"        locationListener = new LocationListener() {\r\n" + 
				"            @Override\r\n" + 
				"            public void onLocationChanged(Location location) {\r\n" + 
				"                Log.i(\"Location\",location.toString());\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            @Override\r\n" + 
				"            public void onStatusChanged(String s, int i, Bundle bundle) {\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            @Override\r\n" + 
				"            public void onProviderEnabled(String s) {\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            @Override\r\n" + 
				"            public void onProviderDisabled(String s) {\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"        };\r\n" + 
				"\r\n" + 
				"        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {\r\n" + 
				"            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);\r\n" + 
				"        } else {\r\n" + 
				"            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}");
		listKeyValue.add(new HashMap<String, String>());
		listKeyValue.get(9).put("multiple activity", "import android.content.Intent;\r\n" + 
				"import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.view.View;\r\n" + 
				"import android.widget.AdapterView;\r\n" + 
				"import android.widget.ArrayAdapter;\r\n" + 
				"import android.widget.ListView;\r\n" + 
				"\r\n" + 
				"import java.util.ArrayList;\r\n" + 
				"\r\n" + 
				"public class MainActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_main);\r\n" + 
				"\r\n" + 
				"        ListView listView = findViewById(R.id.listView);\r\n" + 
				"\r\n" + 
				"        final ArrayList<String> friends = new ArrayList<String>();\r\n" + 
				"\r\n" + 
				"        friends.add(\"Fido\");\r\n" + 
				"        friends.add(\"Sean\");\r\n" + 
				"        friends.add(\"Sarah\");\r\n" + 
				"        friends.add(\"Jane\");\r\n" + 
				"\r\n" + 
				"        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, friends);\r\n" + 
				"\r\n" + 
				"        listView.setAdapter(arrayAdapter);\r\n" + 
				"\r\n" + 
				"        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {\r\n" + 
				"            @Override\r\n" + 
				"            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {\r\n" + 
				"                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);\r\n" + 
				"                intent.putExtra(\"name\",friends.get(i));\r\n" + 
				"                startActivity(intent);\r\n" + 
				"            }\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"//Second Activity Class\r\n" + 
				"import android.content.Intent;\r\n" + 
				"import android.support.v7.app.AppCompatActivity;\r\n" + 
				"import android.os.Bundle;\r\n" + 
				"import android.view.View;\r\n" + 
				"import android.widget.Toast;\r\n" + 
				"\r\n" + 
				"public class SecondActivity extends AppCompatActivity {\r\n" + 
				"\r\n" + 
				"    public void goBack(View view) {\r\n" + 
				"        //Intent intent = new Intent(getApplicationContext(), MainActivity.class);\r\n" + 
				"        //startActivity(intent);\r\n" + 
				"        finish();\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    @Override\r\n" + 
				"    protected void onCreate(Bundle savedInstanceState) {\r\n" + 
				"        super.onCreate(savedInstanceState);\r\n" + 
				"        setContentView(R.layout.activity_second);\r\n" + 
				"\r\n" + 
				"        Intent intent = getIntent();\r\n" + 
				"        String name = intent.getStringExtra(\"name\");\r\n" + 
				"\r\n" + 
				"        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();\r\n" + 
				"    }\r\n" + 
				"}");
			
			
			for(int i = 0; i < listKeyValue.size(); i++) {
			
			allDatas.add(listKeyValue.get(i).toString());
			
			
			}
			
			
	}
	

}
