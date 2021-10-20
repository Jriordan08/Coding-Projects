
import javafx.application.Application;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class pizzaLab extends Application  {
//	public pizza_Driver l = new pizza_Driver();
	ImageView Logo = new ImageView(new Image("pizzalogo.jpg"));
	private TextField order,total;
	private ListView<String> toppingsL;
	private Label toppings,orderSum,sizeL,totalP;
	private RadioButton Sm,Med,Lg;
	private Button orderit, clearit;  
	private ObservableList<String> tps =
			FXCollections.observableArrayList(
					"Bacon", "Pepperoni",
					"Sausage", "Peppers", "Mushrooms","Jalapeno");
	// place varibles that are used in the event handler
	String totalS;
	double toppingsPrice;
	int sizeCost;
	String toppingslist;
	int toppingsCount=0;
	double totalCost;
	String sizeS;

public void start(Stage primaryStage) {
	
	
	VBox pane = new VBox(15);
	HBox orderr_pane = new HBox(10);
	HBox topping_pane = new HBox(10);
	HBox size_pane = new HBox(10);
	HBox button_pane= new HBox(10);
	//Sizes
	sizeL = new Label("Sizes");
	Sm = new RadioButton("Small");
	Med = new RadioButton("Medium");
	Lg = new RadioButton("Large");
	size_pane.getChildren().addAll(sizeL,Sm,Med,Lg);
	ToggleGroup group = new ToggleGroup(); // if red is selected blue cant be 
    Sm.setToggleGroup(group);
    Med.setToggleGroup(group);
    Lg.setToggleGroup(group);
	
	//Toppings
	toppings = new Label("Toppings");
	toppingsL = new ListView(tps);
	toppingsL.setPrefSize(250,150);
	toppingsL.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	Logo.setFitHeight(200);
	Logo.setFitWidth(200);
	topping_pane.getChildren().addAll(toppings,toppingsL,Logo);
	
	//order
	orderSum = new Label("Total Order ");
	totalP = new Label("Total Payment");
	order = new TextField();
	order.setPrefWidth(200);
	order.setEditable(false);
	total = new TextField();
	total.setEditable(false);
	orderr_pane.getChildren().addAll(orderSum,order,totalP,total);
	
	//button
	clearit = new Button("Clear");
	orderit = new Button("Order");
	button_pane.getChildren().addAll(orderit,clearit);
	pane.getChildren().addAll(size_pane,
			topping_pane, orderr_pane, button_pane);
	
	Scene scene = new Scene(pane, 600, 325);
	primaryStage.setTitle("Pizzia");
	primaryStage.setScene(scene);
	primaryStage.show();
	order.getText();
	//Event Handler
		
	
		Sm.setOnAction(e -> {
	      if (Sm.isSelected()) {
	        sizeCost=8;
	         toppingsPrice = .25;
	         sizeS = "Small";
	      	}//end of small 
	    });
		Med.setOnAction(e -> {   
			if (Med.isSelected()) {
				sizeCost=10;
				toppingsPrice = .50;
				sizeS = "Medium";
			}
		});// end of medium
		Lg.setOnAction(e -> { 
			if (Lg.isSelected()) {
				sizeCost=12;
				toppingsPrice = .75;
				sizeS = "Large";
				
			}
	});// end of large 
		orderit.setOnAction(e -> {
		if (e.getSource()== orderit) {
			String result = sizeS;	
			// get the toppings to display 
			for(String s: toppingsL.getSelectionModel().getSelectedItems()) {
				toppingsCount ++;
				result += " " + s;
				totalCost = sizeCost + (toppingsPrice * toppingsCount);
				}
				order.setText(result);
				totalS = "$" + totalCost; 
				}	
				total.setText(totalS);
		}); //end of orderit
		clearit.setOnAction(e-> {
			toppingsL.getSelectionModel().clearSelection();
			order.clear();
			total.clear();
			Sm.setSelected(false);
			Med.setSelected(false);
			Lg.setSelected(false);
			
		});
}// end of start
public static void main(String[] args) {
	Application.launch(args);
}//main

} // end of class
