package Entities;

import java.util.Date;

import Abstract.Entity;

//Kampanya sýnýfý
public class Campaign implements Entity{

	private int id;
	private int productId;
	private String name;
	private String description;
	private String code;
	private Date expirationDate;
	
	public Campaign(int id, int productId, String name, String description, String code, Date expirationDate) {
		super();
		this.id = id;
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.code = code;
		this.expirationDate = expirationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}
