package gameHubDemo.entities.concretes;

import java.time.LocalDate;

public class Order {
	
	private int id;
	private int userId;
	private int campaignId;
	private int gameId;
	private String orderNumber;
	private LocalDate orderDate;
	
	public Order () {
		
	}

	public Order(int id, int userId, int campaignId, int gameId, String orderNumber, LocalDate orderDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.campaignId = campaignId;
		this.gameId = gameId;
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
}
