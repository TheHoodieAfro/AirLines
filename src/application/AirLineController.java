package application;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Plane;

public class AirLineController {

	//Constants

	//Relations
	@FXML private TextField txtGenerar;
	@FXML private TextField txtBuscar;
	@FXML private ListView<String> listi;
	
	private ArrayList<Plane> planes;
	
	//Getters and Setters
		
	//Methods
	public void initialize() {
		
	}
	
	public void generarVuelos(ActionEvent event) {
		
		if(!txtGenerar.getText().equals("") && Integer.parseInt(txtGenerar.getText()) > 0) {
			
			planes = new ArrayList<Plane>();
			
			int cantVuelos = Integer.parseInt(txtGenerar.getText());
			
			ObservableList<String> vuelos = FXCollections.<String>observableArrayList();
			
			for(int i=0; i<cantVuelos; i++) {
				planes.add(new Plane(i));
				vuelos.add(planes.get(i).info());
			}
			
			listi.setItems(vuelos);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "no sea baboso, eliga la cantidad de vuelos a crear (mayor que 0!)", "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
			
		}
		
	}
	
	public void orgFecha(ActionEvent event) {
		
		
		
	}
	
	public void orgHorario(ActionEvent event) {
		
		
		
	}
	
	public void orgAerolinea(ActionEvent event) {
		
		
		
	}
	
	public void orgNumero(ActionEvent event) {
		
		
		
	}
	
	public void orgDestino(ActionEvent event) {
		
		
		
	}
	
	public void orgPuerta(ActionEvent event) {
		
		
		
	}
	
	public void buscFecha(ActionEvent event) {
		
		
		
	}
	
	public void buscHorario(ActionEvent event) {
		
		
		
	}
	
	public void buscAerolinea(ActionEvent event) {
		
		
		
	}
	
	public void buscNumero(ActionEvent event) {
		
		
		
	}
	
	public void buscDestino(ActionEvent event) {
		
		
		
	}
	
	public void buscPuerta(ActionEvent event) {
		
		
		
	}
	
}
