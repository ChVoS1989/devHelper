package Model;


import java.util.ArrayList;
import java.util.HashMap;


public class DatasJavaFx extends Datas{
	
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
			listKeyValue.get(0).put("fXMLLoader", "private void loadInnerView(ActionEvent event) {	\r\n" + 
					"		\r\n" + 
					"		/********************************************/\r\n" + 
					"    	FXMLLoader fxmlLoader = new FXMLLoader();\r\n" + 
					"		fxmlLoader.setLocation(getClass().getResource(\"/View/InnerView.fxml\"));\r\n" + 
					"		\r\n" + 
					"		try {\r\n" + 
					"			fxmlLoader.load();\r\n" + 
					"		} catch (IOException e) {\r\n" + 
					"			e.printStackTrace();\r\n" + 
					"		}\r\n" + 
					"\r\n" + 
					"		InnerController innerController = fxmlLoader.getController();	\r\n" + 
					"		innerController.setTextModel(textModel);\r\n" + 
					"		innerController.loadList(event);\r\n" + 
					"				\r\n" + 
					"		/********************************************/\r\n" + 
					"		\r\n" + 
					"		Parent root = fxmlLoader.getRoot();\r\n" + 
					"    	Scene scene = new Scene(root);\r\n" + 
					"		scene.getStylesheets().add(getClass().getResource(\"/design/innerView.css\").toExternalForm());\r\n" + 
					"    	Stage stage = (Stage) javaButton.getScene().getWindow(); //für alle Buttons\r\n" + 
					"    	stage.setScene(scene);\r\n" + 
					"    	stage.setResizable(false);\r\n" + 
					"    	stage.show();\r\n" + 
					"		\r\n" + 
					"	}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(1).put("listView", "public class Main extends Application {\r\n" + 
					"	@Override\r\n" + 
					"	public void start(Stage primaryStage) {\r\n" + 
					"		try {\r\n" + 
					"			\r\n" + 
					"			//Scene / root\r\n" + 
					"			HBox root = new HBox();\r\n" + 
					"			Scene scene = new Scene(root,600,400);\r\n" + 
					"			\r\n" + 
					"			//ListView - Liste erstellen\r\n" + 
					"			ListView<String> listView = new ListView<String>();\r\n" + 
					"			\r\n" + 
					"			//Liste erstellen - ObservableList\r\n" + 
					"			ObservableList<String> observableList = FXCollections.observableArrayList();\r\n" + 
					"			observableList.addAll(\"Berlin\", \"Hamburg\", \"Bremen\", \"München\", \"Düsseldorf\", \"Nürnberg\");\r\n" + 
					"			\r\n" + 
					"			// ListView Methoden\r\n" + 
					"			listView.setItems(observableList);\r\n" + 
					"			listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);\r\n" + 
					"			//listView.setOrientation(Orientation.HORIZONTAL);\r\n" + 
					"			\r\n" + 
					"			//Tracking der User Interaktion - Wo hat der User geklickt\r\n" + 
					"			listView.getSelectionModel().getSelectedIndex(); // Index des geklickten items\r\n" + 
					"			listView.getSelectionModel().getSelectedItem(); // Item / Inhalt welches geklickt wurde\r\n" + 
					"			listView.getFocusModel().getFocusedIndex(); // Index des fokussierten items\r\n" + 
					"			listView.getFocusModel().getFocusedItem(); // Item / Inhalt welches fokussiert wurde\r\n" + 
					"			\r\n" + 
					"			// Eventhandling - Tracking\r\n" + 
					"			listView.setOnMouseClicked(new EventHandler<MouseEvent>() {\r\n" + 
					"\r\n" + 
					"				@Override\r\n" + 
					"				public void handle(MouseEvent event) {\r\n" + 
					"					System.out.println(listView.getSelectionModel().getSelectedIndex());\r\n" + 
					"					System.out.println(listView.getSelectionModel().getSelectedItem());\r\n" + 
					"					System.out.println(listView.getFocusModel().getFocusedIndex());\r\n" + 
					"					System.out.println(listView.getFocusModel().getFocusedItem());\r\n" + 
					"				}\r\n" + 
					"				\r\n" + 
					"			});\r\n" + 
					"			\r\n" + 
					"			// Eventhandling mit der Liste\r\n" + 
					"			listView.setEditable(true);\r\n" + 
					"			listView.setCellFactory(TextFieldListCell.forListView());\r\n" + 
					"\r\n" + 
					"			// Elemente hinzufügen - Root Box\r\n" + 
					"			root.getChildren().addAll(listView);\r\n" + 
					"			\r\n" + 
					"			//Stage\r\n" + 
					"			primaryStage.setScene(scene);\r\n" + 
					"			primaryStage.show();\r\n" + 
					"		} catch(Exception e) {\r\n" + 
					"			e.printStackTrace();\r\n" + 
					"		}\r\n" + 
					"	}\r\n" + 
					"	\r\n" + 
					"	public static void main(String[] args) {\r\n" + 
					"		launch(args);\r\n" + 
					"	}\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(2).put("listView2", "import javafx.application.Application;\r\n" + 
					"import javafx.collections.FXCollections;\r\n" + 
					"import javafx.collections.ObservableList;\r\n" + 
					"import javafx.scene.Scene;\r\n" + 
					"import javafx.scene.control.*;\r\n" + 
					"import javafx.scene.control.cell.ComboBoxListCell;\r\n" + 
					"import javafx.scene.layout.StackPane;\r\n" + 
					"import javafx.stage.Stage;\r\n" + 
					" \r\n" + 
					"public class ListViewSample extends Application {\r\n" + 
					"    \r\n" + 
					"    public static final ObservableList names = \r\n" + 
					"        FXCollections.observableArrayList();\r\n" + 
					"    public static final ObservableList data = \r\n" + 
					"        FXCollections.observableArrayList();\r\n" + 
					"       \r\n" + 
					"    public static void main(String[] args) {\r\n" + 
					"        launch(args);\r\n" + 
					"    }\r\n" + 
					"    \r\n" + 
					"    @Override\r\n" + 
					"    public void start(Stage primaryStage) {\r\n" + 
					"        primaryStage.setTitle(\"List View Sample\");        \r\n" + 
					"        \r\n" + 
					"        final ListView listView = new ListView(data);\r\n" + 
					"        listView.setPrefSize(200, 250);\r\n" + 
					"        listView.setEditable(true);\r\n" + 
					"        \r\n" + 
					"        names.addAll(\r\n" + 
					"             \"Adam\", \"Alex\", \"Alfred\", \"Albert\",\r\n" + 
					"             \"Brenda\", \"Connie\", \"Derek\", \"Donny\", \r\n" + 
					"             \"Lynne\", \"Myrtle\", \"Rose\", \"Rudolph\", \r\n" + 
					"             \"Tony\", \"Trudy\", \"Williams\", \"Zach\"\r\n" + 
					"        );\r\n" + 
					"         \r\n" + 
					"        for (int i = 0; i < 18; i++) {\r\n" + 
					"            data.add(\"anonym\");\r\n" + 
					"        }\r\n" + 
					"          \r\n" + 
					"        listView.setItems(data);\r\n" + 
					"        listView.setCellFactory(ComboBoxListCell.forListView(names));              \r\n" + 
					"               \r\n" + 
					"        StackPane root = new StackPane();\r\n" + 
					"        root.getChildren().add(listView);\r\n" + 
					"        primaryStage.setScene(new Scene(root, 200, 250));\r\n" + 
					"        primaryStage.show();\r\n" + 
					"    }\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(3).put("tableView", "import javafx.application.Application;\r\n" + 
					"import javafx.geometry.Insets;\r\n" + 
					"import javafx.scene.Group;\r\n" + 
					"import javafx.scene.Scene;\r\n" + 
					"import javafx.scene.control.Label;\r\n" + 
					"import javafx.scene.control.TableColumn;\r\n" + 
					"import javafx.scene.control.TableView;\r\n" + 
					"import javafx.scene.layout.VBox;\r\n" + 
					"import javafx.scene.text.Font;\r\n" + 
					"import javafx.stage.Stage;\r\n" + 
					" \r\n" + 
					"public class TableViewSample extends Application {\r\n" + 
					" \r\n" + 
					"    private TableView table = new TableView();\r\n" + 
					"    public static void main(String[] args) {\r\n" + 
					"        launch(args);\r\n" + 
					"    }\r\n" + 
					" \r\n" + 
					"    @Override\r\n" + 
					"    public void start(Stage stage) {\r\n" + 
					"        Scene scene = new Scene(new Group());\r\n" + 
					"        stage.setTitle(\"Table View Sample\");\r\n" + 
					"        stage.setWidth(300);\r\n" + 
					"        stage.setHeight(500);\r\n" + 
					" \r\n" + 
					"        final Label label = new Label(\"Address Book\");\r\n" + 
					"        label.setFont(new Font(\"Arial\", 20));\r\n" + 
					" \r\n" + 
					"        table.setEditable(true);\r\n" + 
					" \r\n" + 
					"        TableColumn firstNameCol = new TableColumn(\"First Name\");\r\n" + 
					"        TableColumn lastNameCol = new TableColumn(\"Last Name\");\r\n" + 
					"        TableColumn emailCol = new TableColumn(\"Email\");\r\n" + 
					"        \r\n" + 
					"        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);\r\n" + 
					" \r\n" + 
					"        final VBox vbox = new VBox();\r\n" + 
					"        vbox.setSpacing(5);\r\n" + 
					"        vbox.setPadding(new Insets(10, 0, 0, 10));\r\n" + 
					"        vbox.getChildren().addAll(label, table);\r\n" + 
					" \r\n" + 
					"        ((Group) scene.getRoot()).getChildren().addAll(vbox);\r\n" + 
					" \r\n" + 
					"        stage.setScene(scene);\r\n" + 
					"        stage.show();\r\n" + 
					"    }\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(4).put("checkbox", "final String[] names = new String[]{\"Security\", \"Project\", \"Chart\"};\r\n" + 
					"final Image[] images = new Image[names.length];\r\n" + 
					"final ImageView[] icons = new ImageView[names.length];\r\n" + 
					"final CheckBox[] cbs = new CheckBox[names.length];\r\n" + 
					"\r\n" + 
					"for (int i = 0; i < names.length; i++) {\r\n" + 
					"    final Image image = images[i] =\r\n" + 
					"        new Image(getClass().getResourceAsStream(names[i] + \".png\"));\r\n" + 
					"    final ImageView icon = icons[i] = new ImageView();\r\n" + 
					"    final CheckBox cb = cbs[i] = new CheckBox(names[i]);\r\n" + 
					"    cb.selectedProperty().addListener(new ChangeListener<Boolean>() {\r\n" + 
					"        public void changed(ObservableValue<? extends Boolean> ov,\r\n" + 
					"            Boolean old_val, Boolean new_val) {\r\n" + 
					"                icon.setImage(new_val ? image : null);\r\n" + 
					"        }\r\n" + 
					"    });\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(5).put("treeView", "import javafx.application.Application;\r\n" + 
					"import javafx.scene.Node;\r\n" + 
					"import javafx.scene.Scene;\r\n" + 
					"import javafx.scene.control.TreeItem;\r\n" + 
					"import javafx.scene.control.TreeView;\r\n" + 
					"import javafx.scene.image.Image;\r\n" + 
					"import javafx.scene.image.ImageView;\r\n" + 
					"import javafx.scene.layout.StackPane;\r\n" + 
					"import javafx.stage.Stage;\r\n" + 
					" \r\n" + 
					"public class TreeViewSample extends Application {\r\n" + 
					"\r\n" + 
					"    private final Node rootIcon = new ImageView(\r\n" + 
					"        new Image(getClass().getResourceAsStream(\"folder_16.png\"))\r\n" + 
					"    );\r\n" + 
					"\r\n" + 
					"    public static void main(String[] args) {\r\n" + 
					"        launch(args);\r\n" + 
					"    }\r\n" + 
					"    \r\n" + 
					"    @Override\r\n" + 
					"    public void start(Stage primaryStage) {\r\n" + 
					"        primaryStage.setTitle(\"Tree View Sample\");        \r\n" + 
					"        \r\n" + 
					"        TreeItem<String> rootItem = new TreeItem<String> (\"Inbox\", rootIcon);\r\n" + 
					"        rootItem.setExpanded(true);\r\n" + 
					"        for (int i = 1; i < 6; i++) {\r\n" + 
					"            TreeItem<String> item = new TreeItem<String> (\"Message\" + i);            \r\n" + 
					"            rootItem.getChildren().add(item);\r\n" + 
					"        }        \r\n" + 
					"        TreeView<String> tree = new TreeView<String> (rootItem);        \r\n" + 
					"        StackPane root = new StackPane();\r\n" + 
					"        root.getChildren().add(tree);\r\n" + 
					"        primaryStage.setScene(new Scene(root, 300, 250));\r\n" + 
					"        primaryStage.show();\r\n" + 
					"    }\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(6).put("slider", "import javafx.application.Application;\r\n" + 
					"import javafx.beans.value.ChangeListener;\r\n" + 
					"import javafx.beans.value.ObservableValue;\r\n" + 
					"import javafx.geometry.Insets;\r\n" + 
					"import javafx.scene.Group;\r\n" + 
					"import javafx.scene.Scene;\r\n" + 
					"import javafx.scene.control.Label;\r\n" + 
					"import javafx.scene.control.Slider;\r\n" + 
					"import javafx.scene.effect.SepiaTone;\r\n" + 
					"import javafx.scene.image.Image;\r\n" + 
					"import javafx.scene.image.ImageView;\r\n" + 
					"import javafx.scene.layout.GridPane;\r\n" + 
					"import javafx.scene.paint.Color;\r\n" + 
					"import javafx.stage.Stage;\r\n" + 
					" \r\n" + 
					"public class Main extends Application {\r\n" + 
					" \r\n" + 
					"    final Slider opacityLevel = new Slider(0, 1, 1);    \r\n" + 
					"    final Slider sepiaTone = new Slider(0, 1, 1);\r\n" + 
					"    final Slider scaling = new Slider (0.5, 1, 1);\r\n" + 
					"    final Image image  = new Image(getClass().getResourceAsStream(\r\n" + 
					"        \"cappuccino.jpg\")\r\n" + 
					"    );\r\n" + 
					" \r\n" + 
					"    final Label opacityCaption = new Label(\"Opacity Level:\");\r\n" + 
					"    final Label sepiaCaption = new Label(\"Sepia Tone:\");\r\n" + 
					"    final Label scalingCaption = new Label(\"Scaling Factor:\");\r\n" + 
					" \r\n" + 
					"    final Label opacityValue = new Label(\r\n" + 
					"        Double.toString(opacityLevel.getValue()));\r\n" + 
					"    final Label sepiaValue = new Label(\r\n" + 
					"        Double.toString(sepiaTone.getValue()));\r\n" + 
					"    final Label scalingValue = new Label(\r\n" + 
					"        Double.toString(scaling.getValue()));\r\n" + 
					" \r\n" + 
					"    final static Color textColor = Color.WHITE;\r\n" + 
					"    final static SepiaTone sepiaEffect = new SepiaTone();\r\n" + 
					" \r\n" + 
					"    @Override\r\n" + 
					"    public void start(Stage stage) {\r\n" + 
					"        Group root = new Group();\r\n" + 
					"        Scene scene = new Scene(root, 600, 400);\r\n" + 
					"        stage.setScene(scene);\r\n" + 
					"        stage.setTitle(\"Slider Sample\");\r\n" + 
					"        scene.setFill(Color.BLACK);\r\n" + 
					" \r\n" + 
					"        GridPane grid = new GridPane();\r\n" + 
					"        grid.setPadding(new Insets(10, 10, 10, 10));\r\n" + 
					"        grid.setVgap(10);\r\n" + 
					"        grid.setHgap(70);\r\n" + 
					" \r\n" + 
					"        final ImageView cappuccino = new ImageView (image);\r\n" + 
					"        cappuccino.setEffect(sepiaEffect);\r\n" + 
					"        GridPane.setConstraints(cappuccino, 0, 0);\r\n" + 
					"        GridPane.setColumnSpan(cappuccino, 3);\r\n" + 
					"        grid.getChildren().add(cappuccino);\r\n" + 
					"        scene.setRoot(grid);\r\n" + 
					" \r\n" + 
					"        opacityCaption.setTextFill(textColor);\r\n" + 
					"        GridPane.setConstraints(opacityCaption, 0, 1);\r\n" + 
					"        grid.getChildren().add(opacityCaption);\r\n" + 
					"        \r\n" + 
					" \r\n" + 
					"        opacityLevel.valueProperty().addListener(new ChangeListener<Number>() {\r\n" + 
					"            public void changed(ObservableValue<? extends Number> ov,\r\n" + 
					"                Number old_val, Number new_val) {\r\n" + 
					"                    cappuccino.setOpacity(new_val.doubleValue());\r\n" + 
					"                    opacityValue.setText(String.format(\"%.2f\", new_val));\r\n" + 
					"            }\r\n" + 
					"        });\r\n" + 
					" \r\n" + 
					"        GridPane.setConstraints(opacityLevel, 1, 1);\r\n" + 
					"        grid.getChildren().add(opacityLevel);\r\n" + 
					" \r\n" + 
					"        opacityValue.setTextFill(textColor);\r\n" + 
					"        GridPane.setConstraints(opacityValue, 2, 1);\r\n" + 
					"        grid.getChildren().add(opacityValue);\r\n" + 
					" \r\n" + 
					"        sepiaCaption.setTextFill(textColor);\r\n" + 
					"        GridPane.setConstraints(sepiaCaption, 0, 2);\r\n" + 
					"        grid.getChildren().add(sepiaCaption);\r\n" + 
					" \r\n" + 
					"        sepiaTone.valueProperty().addListener(new ChangeListener<Number>() {\r\n" + 
					"            public void changed(ObservableValue<? extends Number> ov,\r\n" + 
					"                Number old_val, Number new_val) {\r\n" + 
					"                    sepiaEffect.setLevel(new_val.doubleValue());\r\n" + 
					"                    sepiaValue.setText(String.format(\"%.2f\", new_val));\r\n" + 
					"            }\r\n" + 
					"        });\r\n" + 
					"        GridPane.setConstraints(sepiaTone, 1, 2);\r\n" + 
					"        grid.getChildren().add(sepiaTone);\r\n" + 
					" \r\n" + 
					"        sepiaValue.setTextFill(textColor);\r\n" + 
					"        GridPane.setConstraints(sepiaValue, 2, 2);\r\n" + 
					"        grid.getChildren().add(sepiaValue);\r\n" + 
					" \r\n" + 
					"        scalingCaption.setTextFill(textColor);\r\n" + 
					"        GridPane.setConstraints(scalingCaption, 0, 3);\r\n" + 
					"        grid.getChildren().add(scalingCaption);\r\n" + 
					" \r\n" + 
					"        scaling.valueProperty().addListener(new ChangeListener<Number>() {\r\n" + 
					"            public void changed(ObservableValue<? extends Number> ov,\r\n" + 
					"                Number old_val, Number new_val) {\r\n" + 
					"                    cappuccino.setScaleX(new_val.doubleValue());\r\n" + 
					"                    cappuccino.setScaleY(new_val.doubleValue());\r\n" + 
					"                    scalingValue.setText(String.format(\"%.2f\", new_val));\r\n" + 
					"            }\r\n" + 
					"        });\r\n" + 
					"        GridPane.setConstraints(scaling, 1, 3);\r\n" + 
					"        grid.getChildren().add(scaling);\r\n" + 
					" \r\n" + 
					"        scalingValue.setTextFill(textColor);\r\n" + 
					"        GridPane.setConstraints(scalingValue, 2, 3);\r\n" + 
					"        grid.getChildren().add(scalingValue);\r\n" + 
					" \r\n" + 
					"        stage.show();\r\n" + 
					"    }\r\n" + 
					" \r\n" + 
					"    public static void main(String[] args) {\r\n" + 
					"        launch(args);\r\n" + 
					"    }\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(7).put("progressbar", "import javafx.application.Application;\r\n" + 
					"import javafx.geometry.Pos;\r\n" + 
					"import javafx.scene.Group;\r\n" + 
					"import javafx.scene.Scene;\r\n" + 
					"import javafx.scene.control.Label;\r\n" + 
					"import javafx.scene.control.ProgressBar;\r\n" + 
					"import javafx.scene.control.ProgressIndicator;\r\n" + 
					"import javafx.scene.layout.HBox;\r\n" + 
					"import javafx.scene.layout.VBox;\r\n" + 
					"import javafx.stage.Stage;\r\n" + 
					"\r\n" + 
					"public class Main  extends Application {\r\n" + 
					"\r\n" + 
					"final Float[] values = new Float[] {-1.0f, 0f, 0.6f, 1.0f};\r\n" + 
					"final Label [] labels = new Label[values.length];\r\n" + 
					"final ProgressBar[] pbs = new ProgressBar[values.length];\r\n" + 
					"final ProgressIndicator[] pins = new ProgressIndicator[values.length];\r\n" + 
					"final HBox hbs [] = new HBox [values.length];\r\n" + 
					"\r\n" + 
					"    @Override\r\n" + 
					"    public void start(Stage stage) {\r\n" + 
					"        Group root = new Group();\r\n" + 
					"        Scene scene = new Scene(root, 300, 150);\r\n" + 
					"        scene.getStylesheets().add(\"progresssample/Style.css\");\r\n" + 
					"        stage.setScene(scene);\r\n" + 
					"        stage.setTitle(\"Progress Controls\");\r\n" + 
					" \r\n" + 
					" \r\n" + 
					"        for (int i = 0; i < values.length; i++) {\r\n" + 
					"            final Label label = labels[i] = new Label();\r\n" + 
					"            label.setText(\"progress:\" + values[i]);\r\n" + 
					" \r\n" + 
					"            final ProgressBar pb = pbs[i] = new ProgressBar();\r\n" + 
					"            pb.setProgress(values[i]);\r\n" + 
					" \r\n" + 
					"            final ProgressIndicator pin = pins[i] = new ProgressIndicator();\r\n" + 
					"            pin.setProgress(values[i]);\r\n" + 
					"            final HBox hb = hbs[i] = new HBox();\r\n" + 
					"            hb.setSpacing(5);\r\n" + 
					"            hb.setAlignment(Pos.CENTER);\r\n" + 
					"            hb.getChildren().addAll(label, pb, pin);\r\n" + 
					"        }\r\n" + 
					" \r\n" + 
					"        final VBox vb = new VBox();\r\n" + 
					"        vb.setSpacing(5);\r\n" + 
					"        vb.getChildren().addAll(hbs);\r\n" + 
					"        scene.setRoot(vb);\r\n" + 
					"        stage.show();\r\n" + 
					"    }\r\n" + 
					"    public static void main(String[] args) {\r\n" + 
					"        launch(args);\r\n" + 
					"    }\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(8).put("hyperlink", "import javafx.application.Application;\r\n" + 
					"import javafx.event.ActionEvent;\r\n" + 
					"import javafx.event.EventHandler;\r\n" + 
					"import javafx.scene.*;\r\n" + 
					"import javafx.scene.control.*;\r\n" + 
					"import javafx.scene.image.Image;\r\n" + 
					"import javafx.scene.image.ImageView;\r\n" + 
					"import javafx.scene.layout.VBox;\r\n" + 
					"import javafx.stage.Stage;\r\n" + 
					" \r\n" + 
					"public class Main extends Application {\r\n" + 
					" \r\n" + 
					"    final static String[] imageFiles = new String[]{\r\n" + 
					"        \"product.png\",\r\n" + 
					"        \"education.png\",\r\n" + 
					"        \"partners.png\",\r\n" + 
					"        \"support.png\"\r\n" + 
					"    };\r\n" + 
					"    final static String[] captions = new String[]{\r\n" + 
					"        \"Products\",\r\n" + 
					"        \"Education\",\r\n" + 
					"        \"Partners\",\r\n" + 
					"        \"Support\"\r\n" + 
					"    };\r\n" + 
					"    final ImageView selectedImage = new ImageView();\r\n" + 
					"    final ScrollPane list = new ScrollPane();\r\n" + 
					"    final Hyperlink[] hpls = new Hyperlink[captions.length];\r\n" + 
					"    final Image[] images = new Image[imageFiles.length];\r\n" + 
					" \r\n" + 
					"    public static void main(String[] args) {\r\n" + 
					"        Application.launch(args);\r\n" + 
					"    }\r\n" + 
					" \r\n" + 
					"    @Override\r\n" + 
					"    public void start(Stage stage) {\r\n" + 
					"        Scene scene = new Scene(new Group());\r\n" + 
					"        stage.setTitle(\"Hyperlink Sample\");\r\n" + 
					"        stage.setWidth(300);\r\n" + 
					"        stage.setHeight(200);\r\n" + 
					" \r\n" + 
					"        selectedImage.setLayoutX(100);\r\n" + 
					"        selectedImage.setLayoutY(10);\r\n" + 
					" \r\n" + 
					"        for (int i = 0; i < captions.length; i++) {\r\n" + 
					"            final Hyperlink hpl = hpls[i] = new Hyperlink(captions[i]);\r\n" + 
					"            final Image image = images[i] = new Image(\r\n" + 
					"                getClass().getResourceAsStream(imageFiles[i])\r\n" + 
					"            );\r\n" + 
					"            hpl.setOnAction(new EventHandler<ActionEvent>() {\r\n" + 
					"                @Override\r\n" + 
					"                public void handle(ActionEvent e) {\r\n" + 
					"                    selectedImage.setImage(image);\r\n" + 
					"                }\r\n" + 
					"            });\r\n" + 
					"        }\r\n" + 
					" \r\n" + 
					"        final Button button = new Button(\"Refresh links\");\r\n" + 
					"        button.setOnAction(new EventHandler<ActionEvent>() {\r\n" + 
					"                @Override\r\n" + 
					"                public void handle(ActionEvent e) {\r\n" + 
					"                    for (int i = 0; i < captions.length; i++) {\r\n" + 
					"                        hpls[i].setVisited(false);\r\n" + 
					"                        selectedImage.setImage(null);\r\n" + 
					"                    }\r\n" + 
					"                }\r\n" + 
					"            });\r\n" + 
					" \r\n" + 
					"        VBox vbox = new VBox();\r\n" + 
					"        vbox.getChildren().addAll(hpls);\r\n" + 
					"        vbox.getChildren().add(button);\r\n" + 
					"        vbox.setSpacing(5);\r\n" + 
					" \r\n" + 
					"        ((Group) scene.getRoot()).getChildren().addAll(vbox, selectedImage);\r\n" + 
					"        stage.setScene(scene);\r\n" + 
					"        stage.show();\r\n" + 
					"    }\r\n" + 
					"}");
			listKeyValue.add(new HashMap<String, String>());
			listKeyValue.get(9).put("tooltip", "import javafx.application.Application;\r\n" + 
					"import javafx.beans.value.ChangeListener;\r\n" + 
					"import javafx.beans.value.ObservableValue;\r\n" + 
					"import javafx.geometry.Insets;\r\n" + 
					"import javafx.scene.Group;\r\n" + 
					"import javafx.scene.Scene;\r\n" + 
					"import javafx.scene.control.CheckBox;\r\n" + 
					"import javafx.scene.control.Label;\r\n" + 
					"import javafx.scene.control.Tooltip;\r\n" + 
					"import javafx.scene.layout.HBox;\r\n" + 
					"import javafx.scene.layout.VBox;\r\n" + 
					"import javafx.scene.text.Font;\r\n" + 
					"import javafx.stage.Stage;\r\n" + 
					" \r\n" + 
					" \r\n" + 
					"public class Main extends Application {\r\n" + 
					" \r\n" + 
					"    final static String[] rooms = new String[]{\r\n" + 
					"        \"Accommodation (BB)\",\r\n" + 
					"        \"Half Board\",\r\n" + 
					"        \"Late Check-out\",\r\n" + 
					"        \"Extra Bed\"\r\n" + 
					"    };\r\n" + 
					"    final static Integer[] rates = new Integer[]{\r\n" + 
					"        100, 20, 10, 30\r\n" + 
					"    };\r\n" + 
					"    final CheckBox[] cbs = new CheckBox[rooms.length];\r\n" + 
					"    final Label total = new Label(\"Total: $0\");\r\n" + 
					"    Integer sum = 0;\r\n" + 
					" \r\n" + 
					"    public static void main(String[] args) {\r\n" + 
					"        launch(args);\r\n" + 
					"    }\r\n" + 
					" \r\n" + 
					"    @Override\r\n" + 
					"    public void start(Stage stage) {\r\n" + 
					"        Scene scene = new Scene(new Group());\r\n" + 
					"        stage.setTitle(\"Tooltip Sample\");\r\n" + 
					"        stage.setWidth(300);\r\n" + 
					"        stage.setHeight(150);\r\n" + 
					" \r\n" + 
					"        total.setFont(new Font(\"Arial\", 20));\r\n" + 
					"        \r\n" + 
					"        for (int i = 0; i < rooms.length; i++) {\r\n" + 
					"            final CheckBox cb = cbs[i] = new CheckBox(rooms[i]);\r\n" + 
					"            final Integer rate = rates[i];\r\n" + 
					"            final Tooltip tooltip = new Tooltip(\"$\" + rates[i].toString());\r\n" + 
					"            tooltip.setFont(new Font(\"Arial\", 16));\r\n" + 
					"            cb.setTooltip(tooltip);\r\n" + 
					"            cb.selectedProperty().addListener(new ChangeListener<Boolean>() {\r\n" + 
					"                public void changed(ObservableValue<? extends Boolean> ov,\r\n" + 
					"                    Boolean old_val, Boolean new_val) {\r\n" + 
					"                    if (cb.isSelected()) {\r\n" + 
					"                        sum = sum + rate;\r\n" + 
					"                    } else {\r\n" + 
					"                        sum = sum - rate;\r\n" + 
					"                    }\r\n" + 
					"                    total.setText(\"Total: $\" + sum.toString());\r\n" + 
					"                }\r\n" + 
					"            });\r\n" + 
					"        }\r\n" + 
					" \r\n" + 
					"        VBox vbox = new VBox();\r\n" + 
					"        vbox.getChildren().addAll(cbs);\r\n" + 
					"        vbox.setSpacing(5);\r\n" + 
					"        HBox root = new HBox();\r\n" + 
					"        root.getChildren().add(vbox);\r\n" + 
					"        root.getChildren().add(total);\r\n" + 
					"        root.setSpacing(40);\r\n" + 
					"        root.setPadding(new Insets(20, 10, 10, 20));\r\n" + 
					" \r\n" + 
					"        ((Group) scene.getRoot()).getChildren().add(root);\r\n" + 
					" \r\n" + 
					"        stage.setScene(scene);\r\n" + 
					"        stage.show();\r\n" + 
					"    }\r\n" + 
					"}");
			
			
			for(int i = 0; i < listKeyValue.size(); i++) {
			
			allDatas.add(listKeyValue.get(i).toString());
			
			
			}
			
			
	}

}
