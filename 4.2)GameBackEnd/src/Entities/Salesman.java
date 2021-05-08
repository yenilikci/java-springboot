package Entities;

public class Salesman extends User {

	private int amountSales;
	private String status;

	public Salesman(int id, String userName, String email, String password, int amountSales, String status) {
		super(id, userName, email, password);
		this.amountSales = amountSales;
		this.status = status;
	}

	public int getAmountSales() {
		return amountSales;
	}

	public void setAmountSales(int amountSales) {
		this.amountSales = amountSales;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
