package model;

import java.util.Comparator;
import java.util.Random;

public class Plane implements Comparable, Comparator{
	
	//Constants
	
	//Attributes
	private String date;
	private String time;
	private int realTime;
	private String airline;
	private int id;
	private String end;
	private int door;
	
	//Relations
	
	//Constructors
	public Plane(int i) {
		
		setId(i);
		
		generateDate();
		generateTime();
		generateAirline();
		generateEnd();
		generateDoor();
		
	}
	
	//Getters and Setters
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
	
	public int getRealTime() {
		return realTime;
	}

	public void setRealTime(int realTime) {
		this.realTime = realTime;
	}
	
	//Methods
	public void generateDate() {
		
		String dt = "";
		
		Random r = new Random();
		int dia = r.nextInt(30)+1;
		
		Random f = new Random();
		int mes = f.nextInt(12)+1;

		Random a = new Random();
		int año = a.nextInt(79)+1999;
		
		dt = dia +"/"+ mes +"/"+ año;
		
		setDate(dt);
		
	}
	
	public void generateTime() {

		String tim = "";
		
		Random r = new Random();
		int rr = r.nextInt(12)+1;
		
		Random f = new Random();
		int ff = f.nextInt(60);
		
		String[] a = {"a.m.", "p.m."};
		Random aa = new Random();
		int aaa = aa.nextInt(2);
		
		if(aaa == 0) {
			if(ff >= 0 && ff < 10) {
				tim = rr+"0"+ff;
				setRealTime(Integer.parseInt(tim));
			}else {
				tim = rr+""+ff;
				setRealTime(Integer.parseInt(tim));
			}
		}else {
			if(ff >= 0 && ff < 10) {
				tim = rr+"0"+ff+"00";
				setRealTime(Integer.parseInt(tim));
			}else {
				tim = rr+""+ff+"00";
				setRealTime(Integer.parseInt(tim));
			}
		}
		
		if(ff >= 0 && ff < 10) {
			tim = rr +":0"+ ff +" "+ a[aaa];
		}else {
			tim = rr +":"+ ff +" "+ a[aaa];
		}
		
		setTime(tim);
		
	}
	
	public void generateAirline() {
		
		String[] a = {"Avianca", "American", "LATAM", "Copa", "Delta", "SATENA", "Virgin", "Frontier", "United", "Ethiopian"};
		Random r = new Random();
		int d = r.nextInt(10);
		setAirline(a[d]);
		
	}
	
	public void generateEnd() {
		
		String[] c = {"Kripton", "Earth-chan", "Mordor", "Narnia", "Thanos´s butthole", "you momma", "Equestria", "Mushroom Kingdom", "Hell", "Heaven", "Limbo", "Atlantis", "SS Enterprice", "Galactic Falcon", "Mother Russia blyat!"};
		Random r = new Random();
		int d = r.nextInt(15);
		setEnd(c[d]);
		
	}
	
	public void generateDoor() {
		
		Random r = new Random();
		int d = r.nextInt(10)+1;
		setDoor(d);
		
	}
	
	public String info() {
		
		String info = "";
		
		info = date +"     "+ time +"      ||      "+ airline +"            "+ id +"                                  "+ end +"      ||      "+ door;
		
		return info;
		
	}
	
	@Override
	public int compare(Object a, Object b) {
		return 0;
	}

	@Override
	public int compareTo(Object arg0) {
		return 0;
	}
	
}
