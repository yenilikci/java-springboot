package Entities;

public class Organizer extends User {

	private int amountCampaign;

	public Organizer(int id, String userName, String email, String password, int amountCampaign) {
		super(id, userName, email, password);
		this.amountCampaign = amountCampaign;
	}

	public int getAmountCampaign() {
		return amountCampaign;
	}

	public void setAmountCampaign(int amountCampaign) {
		this.amountCampaign = amountCampaign;
	}

}
