package Entities;

import Abstract.Entity;

//Sipariþ Sýnýfý
public class Order implements Entity {

	private int id;
	private int gamerId;
	private int productId;
	private int campaignId;
	private int amount;
	private double unitPrice;
	private double percentageOfDiscount;

	public Order(int id, int gamerId, int productId, int campaignId, int amount, double unitPrice,
			double percentageOfDiscount) {
		super();
		this.id = id;
		this.gamerId = gamerId;
		this.productId = productId;
		this.campaignId = campaignId;
		this.amount = amount;
		this.unitPrice = unitPrice;
		this.percentageOfDiscount = percentageOfDiscount;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getPercentageOfDiscount() {
		return percentageOfDiscount;
	}

	public void setPercentageOfDiscount(double percentageOfDiscount) {
		this.percentageOfDiscount = percentageOfDiscount;
	}

}
