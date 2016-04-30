package com.archdrawer;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.util.Pair;


	public class MainWindowController {

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="menuItemOpenFile"
	    private MenuItem menuItemOpenFile; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemOpenRecent"
	    private MenuItem menuItemOpenRecent; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemExit"
	    private MenuItem menuItemExit; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemEditLimits"
	    private MenuItem menuItemEditLimits; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemEditSteppers"
	    private MenuItem menuItemEditSteppers; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemPreferences"
	    private MenuItem menuItemPreferences; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemDrawStart"
	    private MenuItem menuItemDrawStart; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemDrawPause"
	    private MenuItem menuItemDrawPause; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemDrawStop"
	    private MenuItem menuItemDrawStop; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemInstructions"
	    private MenuItem menuItemInstructions; // Value injected by FXMLLoader

	    @FXML // fx:id="menuItemAbout"
	    private MenuItem menuItemAbout; // Value injected by FXMLLoader

	    @FXML // fx:id="btnYplusCustom"
	    private Button btnYplusCustom; // Value injected by FXMLLoader

	    @FXML // fx:id="btnYplus10"
	    private Button btnYplus10; // Value injected by FXMLLoader

	    @FXML // fx:id="btnYplus1"
	    private Button btnYplus1; // Value injected by FXMLLoader

	    @FXML // fx:id="btnYminus1"
	    private Button btnYminus1; // Value injected by FXMLLoader

	    @FXML // fx:id="btnYminus10"
	    private Button btnYminus10; // Value injected by FXMLLoader

	    @FXML // fx:id="btnYminusCustom"
	    private Button btnYminusCustom; // Value injected by FXMLLoader

	    @FXML // fx:id="btnXminus1"
	    private Button btnXminus1; // Value injected by FXMLLoader

	    @FXML // fx:id="btnXminus10"
	    private Button btnXminus10; // Value injected by FXMLLoader

	    @FXML // fx:id="btnXminusCustom"
	    private Button btnXminusCustom; // Value injected by FXMLLoader

	    @FXML // fx:id="btnXplus1"
	    private Button btnXplus1; // Value injected by FXMLLoader

	    @FXML // fx:id="btnXplus10"
	    private Button btnXplus10; // Value injected by FXMLLoader

	    @FXML // fx:id="btnXplusCustom"
	    private Button btnXplusCustom; // Value injected by FXMLLoader

	    @FXML
	    void MinusT10(ActionEvent event) {
	    	
	    }

	    @FXML
	    void MinusX1(ActionEvent event) {

	    }

	    @FXML
	    void MinusX10(ActionEvent event) {

	    }

	    @FXML
	    void MinusXCustom(ActionEvent event) {

	    }

	    @FXML
	    void MinusY1(ActionEvent event) {

	    }

	    @FXML
	    void PlusX1(ActionEvent event) {

	    }

	    @FXML
	    void PlusX10(ActionEvent event) {
	    	System.out.println("plus x10");
	    }

	    @FXML
	    void PlusXCustom(ActionEvent event) {

	    }

	    @FXML
	    void PlusY10(ActionEvent event) {

	    }

	    @FXML
	    void PlusYCustom(ActionEvent event) {

	    }

	    @FXML
	    void Preferences(ActionEvent event) {

	    }

	    @FXML
	    void about(ActionEvent event) {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("About");
	    	alert.setHeaderText("Creators");
	    	alert.setContentText("Created by Deyvid and Teodor!");

	    	alert.showAndWait();
	    }

	    @FXML
	    void btnYminusCustom(ActionEvent event) {

	    }

	    @FXML
	    void editLimits(ActionEvent event) { //TODO: tui e za taq formichkata - trqbwa da se dobawqt oshte 2 poleta i 2 labela i da se narpawi i za drugoto 
	    	Dialog<Pair<String, String>> dialog = new Dialog<>();
	    	dialog.setTitle("Configure Limits");
	    	dialog.setHeaderText("Diameter");
	    	
	    	ButtonType save = new ButtonType("Save", ButtonData.OK_DONE);
	    	dialog.getDialogPane().getButtonTypes().addAll(save, ButtonType.CANCEL);
	    	
	    	GridPane grid = new GridPane();
	    	grid.setHgap(10);
	    	grid.setVgap(10);
	    	grid.setPadding(new Insets(20, 150, 10, 10));

	    	TextField machineWidth = new TextField();
	    	machineWidth.setPromptText("50.0");
	    	TextField machineHeight = new TextField();
	    	machineHeight.setPromptText("50.0");
	    	TextField paperWidth = new TextField();
	    	paperWidth.setPromptText("20.0");
	    	TextField paperHeight = new TextField();
	    	paperHeight.setPromptText("80.0");

	    	grid.add(new Label("Machine width:"), 0, 0);
	    	grid.add(machineWidth, 1, 0);
	    	grid.add(new Label("Machine height:"), 0, 1);
	    	grid.add(machineHeight, 1, 1);
	    	grid.add(new Label("Paper width:"), 0, 2);
	    	grid.add(paperWidth, 1, 2);
	    	grid.add(new Label("Paper height:"), 0, 3);
	    	grid.add(paperHeight, 1, 3);
	    	
	    	dialog.getDialogPane().setContent(grid);
	    	
	    	dialog.setResultConverter(dialogButton -> {
	    	    if (dialogButton == save) {
	    	        return new Pair<>(machineWidth.getText(), machineHeight.getText());
	    	    }
	    	    return null;
	    	});

	    	Optional<Pair<String, String>> result = dialog.showAndWait();
	    	result.ifPresent(paperWidthHeight -> {
	    	    System.out.println("Machine width: " + paperWidthHeight.getKey() + "| Machine height:" + paperWidthHeight.getValue());
	    	   
	    	});
	    	
	    	dialog.setResultConverter(dialogButton -> {
	    	    if (dialogButton == save) {
	    	        return new Pair<>(paperWidth.getText(), paperHeight.getText());
	    	    }
	    	    return null;
	    	});
	    	
	    	Optional<Pair<String, String>> result2 = dialog.showAndWait();
	    	
	    	result2.ifPresent(machineWidthHeight -> {
	    	    System.out.println("Machine width: " + machineWidthHeight.getKey() + "| Machine height:" + machineWidthHeight.getValue());
	    	   
	    	});
	    }

	    @FXML
	    void editSteppers(ActionEvent event) {
		   
		    	Dialog<Pair<String, String>> dialog = new Dialog<>();
		    	dialog.setTitle("Configure Bobbins");
		    	dialog.setHeaderText("Set diameter of the stepers");
		    	
		    	
		    	ButtonType save = new ButtonType("Save", ButtonData.OK_DONE);
		    	dialog.getDialogPane().getButtonTypes().addAll(save, ButtonType.CANCEL);
		    	
		    	GridPane grid = new GridPane();
		    	grid.setHgap(10);
		    	grid.setVgap(10);
		    	grid.setPadding(new Insets(20, 150, 10, 10));

		    	TextField leftBobbin = new TextField();
		    	leftBobbin.setPromptText("9.5");
		    	TextField rightBobbin = new TextField();
		    	rightBobbin.setPromptText("9.5");

		    	grid.add(new Label("Left in mm:"), 0, 0);
		    	grid.add(leftBobbin, 1, 0);
		    	grid.add(new Label("Right in mm:"), 0, 1);
		    	grid.add(rightBobbin, 1, 1);
		    	
		    	dialog.getDialogPane().setContent(grid);
		    	
		    	dialog.setResultConverter(dialogButton -> {
		    	    if (dialogButton == save) {
		    	        return new Pair<>(leftBobbin.getText(), rightBobbin.getText());
		    	    }
		    	    return null;
		    	});
		    	
		    	Optional<Pair<String, String>> result = dialog.showAndWait();
		    	
		    	result.ifPresent(leftRight -> {
		    	    System.out.println("Left Bobbin in mm: " + leftRight.getKey() + "| Right Bobbin in mm:" + leftRight.getValue());
		    	});
	    }

	    @FXML
	    void exit(ActionEvent event) {
	    	System.out.println("Exit");
	    	Platform.exit();
	    }
	    	//TODO: input info
	    @FXML 
	    void instructions(ActionEvent event) {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Instructions");
	    	alert.setHeaderText("How to use ArchDrawer");
	    	alert.setContentText("//input info!");

	    	alert.showAndWait();
	    }

	    @FXML
	    void openFile(ActionEvent event) {
	    	FileChooser fileChooser = new FileChooser();
	    	fileChooser.setTitle("Open Resource File");
	    	fileChooser.showOpenDialog(null);
	    }

	    @FXML
	    void openRecent(ActionEvent event) {

	    }

	    @FXML
	    void pauseDraw(ActionEvent event) {

	    }

	    @FXML
	    void startDraw(ActionEvent event) {
//			if(gcode.fileOpened) {
//				paused=false;
//				running=true;
//				UpdateMenuBar();
//				gcode.linesProcessed=0;
//				previewPane.setRunning(running);
//				previewPane.setLinesProcessed(gcode.linesProcessed);
//				statusBar.Start();
//				SendFileCommand();
//			}
	    }

	    @FXML
	    void stopDraw(ActionEvent event) {

	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert menuItemOpenFile != null : "fx:id=\"menuItemOpenFile\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemOpenRecent != null : "fx:id=\"menuItemOpenRecent\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemExit != null : "fx:id=\"menuItemExit\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemEditLimits != null : "fx:id=\"menuItemEditLimits\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemEditSteppers != null : "fx:id=\"menuItemEditSteppers\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemPreferences != null : "fx:id=\"menuItemPreferences\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemDrawStart != null : "fx:id=\"menuItemDrawStart\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemDrawPause != null : "fx:id=\"menuItemDrawPause\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemDrawStop != null : "fx:id=\"menuItemDrawStop\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemInstructions != null : "fx:id=\"menuItemInstructions\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert menuItemAbout != null : "fx:id=\"menuItemAbout\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnYplusCustom != null : "fx:id=\"btnYplusCustom\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnYplus10 != null : "fx:id=\"btnYplus10\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnYplus1 != null : "fx:id=\"btnYplus1\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnYminus1 != null : "fx:id=\"btnYminus1\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnYminus10 != null : "fx:id=\"btnYminus10\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnYminusCustom != null : "fx:id=\"btnYminusCustom\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnXminus1 != null : "fx:id=\"btnXminus1\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnXminus10 != null : "fx:id=\"btnXminus10\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnXminusCustom != null : "fx:id=\"btnXminusCustom\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnXplus1 != null : "fx:id=\"btnXplus1\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnXplus10 != null : "fx:id=\"btnXplus10\" was not injected: check your FXML file 'UIDescriptor.fxml'.";
	        assert btnXplusCustom != null : "fx:id=\"btnXplusCustom\" was not injected: check your FXML file 'UIDescriptor.fxml'.";

	    }
	}





