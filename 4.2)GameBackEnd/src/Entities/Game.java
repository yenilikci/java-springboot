package Entities;

import java.util.Date;

//Ürün sýnýfýndan referans alan oyun sýnýfý
public class Game extends Product{
	
	private int gamerCount;
	private String gameWebsiteUrl;
	
	public Game(int id, String name, String description, Date releaseDate, float sellPrice, int producerId,
			int categoryId, int gamerCount, String gameWebsiteUrl) {
		super(id, name, description, releaseDate, sellPrice, producerId, categoryId);
		this.gamerCount = gamerCount;
		this.gameWebsiteUrl = gameWebsiteUrl;
	}

	public int getGamerCount() {
		return gamerCount;
	}

	public void setGamerCount(int gamerCount) {
		this.gamerCount = gamerCount;
	}

	public String getGameWebsiteUrl() {
		return gameWebsiteUrl;
	}

	public void setGameWebsiteUrl(String gameWebsiteUrl) {
		this.gameWebsiteUrl = gameWebsiteUrl;
	}
	
}
