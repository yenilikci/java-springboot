package Entities;

import java.util.Date;

import Abstract.Entity;

//Ürün sýnýfý , daha sonra oyun, oyun eþyasý ve oyun yükseltmesi sýnýfýna referans olacak
public class Product implements Entity {
	private int id;
	private String name;
	private String description;
	private Date releaseDate;
	private float sellPrice;
	private int producerId;
	private int categoryId;

	public Product(int id, String name, String description, Date releaseDate, float sellPrice, int producerId,
			int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.releaseDate = releaseDate;
		this.sellPrice = sellPrice;
		this.producerId = producerId;
		this.categoryId = categoryId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public float getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(float sellPrice) {
		this.sellPrice = sellPrice;
	}

	public int getProducerId() {
		return producerId;
	}

	public void setProducerId(int producerId) {
		this.producerId = producerId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
