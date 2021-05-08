package Entities;

//Oyun geliþtirici sýnýfý
public class Producer extends User {
	
	private String description;
	private String location;
	private String webSiteUrl;

	public Producer(int id, String userName, String email, String password, String description, String location,String webSiteUrl) {
		super(id, userName, email, password);
		this.description = description;
		this.location = location;
		this.webSiteUrl = webSiteUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWebSiteUrl() {
		return webSiteUrl;
	}

	public void setWebSiteUrl(String webSiteUrl) {
		this.webSiteUrl = webSiteUrl;
	}

}
