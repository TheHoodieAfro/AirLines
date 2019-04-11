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
		
		long t1 = System.currentTimeMillis();
		
		
		
		ObservableList<String> vuelos = FXCollections.<String>observableArrayList();
		
		for(int i=0; i<planes.size(); i++) {
			
			vuelos.add(planes.get(i).info());
			
		}
		
		listi.setItems(vuelos);
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void orgHorario(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		for(int i=0; i<planes.size()-1; i++) {
			
			Plane min = planes.get(i);
			int camb = i;
			
			for(int j=i+1; j<planes.size(); j++) {
				
				if(planes.get(j).getRealTime()<min.getRealTime()) {
					
					min = planes.get(j);
					camb = j;
					
				}
				
			}
			
			Plane temp = planes.get(i);
			planes.set(i, min);
			planes.set(camb,  temp);
			
		}
		
		ObservableList<String> vuelos = FXCollections.<String>observableArrayList();
		
		for(int i=0; i<planes.size(); i++) {
			
			vuelos.add(planes.get(i).info());
			
		}
		
		listi.setItems(vuelos);
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void orgAerolinea(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void orgNumero(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void orgDestino(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void orgPuerta(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		for(int i=1; i<planes.size(); i++) {
			
			for(int j=i; j>0 && planes.get(j-1).getDoor() > planes.get(j).getDoor(); j--) {//a[j-1]>a[j]
				
				Plane temp = planes.get(j-1);
				planes.set(j-1, planes.get(j));
				planes.set(j, temp);
				
			}
			
		}
		
		ObservableList<String> vuelos = FXCollections.<String>observableArrayList();
		
		for(int i=0; i<planes.size(); i++) {
			
			vuelos.add(planes.get(i).info());
			
		}
		
		listi.setItems(vuelos);
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
			
	}
	
	public void buscFecha(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void buscHorario(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void buscAerolinea(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void buscNumero(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void buscDestino(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
	public void buscPuerta(ActionEvent event) {
		
		long t1 = System.currentTimeMillis();
		
		
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
	
}
