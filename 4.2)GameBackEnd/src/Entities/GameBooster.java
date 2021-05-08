package Entities;

import java.util.Date;

//Ürün sýnýfýndan referans alan oyun yükseltmesi sýnýfý
public class GameBooster extends Product {

	private int validityTimeSec;
	private int boostPercent;
	
	public GameBooster(int id, String name, String description, Date releaseDate, float sellPrice, int producerId,
			int categoryId, int validityTimeSec, int boostPercent) {
		super(id, name, description, releaseDate, sellPrice, producerId, categoryId);
		this.validityTimeSec = validityTimeSec;
		this.boostPercent = boostPercent;
	}

	public int getValidityTimeSec() {
		return validityTimeSec;
	}

	public void setValidityTimeSec(int validityTimeSec) {
		this.validityTimeSec = validityTimeSec;
	}

	public int getBoostPercent() {
		return boostPercent;
	}

	public void setBoostPercent(int boostPercent) {
		this.boostPercent = boostPercent;
	}

}
