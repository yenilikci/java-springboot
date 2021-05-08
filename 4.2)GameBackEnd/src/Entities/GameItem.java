package Entities;

import java.util.Date;

//Ürün sýnýfýndan referans alan oyun eþyasý sýnýfý
public class GameItem extends Product{

	private String rareCriterion;
	boolean canItBeSold;
	
	public GameItem(int id, String name, String description, Date releaseDate, float sellPrice, int producerId,
			int categoryId, String rareCriterion, boolean canItBeSold) {
		super(id, name, description, releaseDate, sellPrice, producerId, categoryId);
		this.rareCriterion = rareCriterion;
		this.canItBeSold = canItBeSold;
	}

	public String getRareCriterion() {
		return rareCriterion;
	}

	public void setRareCriterion(String rareCriterion) {
		this.rareCriterion = rareCriterion;
	}

	public boolean isCanItBeSold() {
		return canItBeSold;
	}

	public void setCanItBeSold(boolean canItBeSold) {
		this.canItBeSold = canItBeSold;
	}
	
	
}
