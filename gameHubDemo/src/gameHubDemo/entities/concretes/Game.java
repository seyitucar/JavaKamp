package gameHubDemo.entities.concretes;

import gameHubDemo.entities.abstracts.Entitiy;

public class Game implements Entitiy {
	
	private int id;
	private String name;
	private String type;
	private double price;
	
	public Game () {
		
	}

	public Game(int id, String name, String type, double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
