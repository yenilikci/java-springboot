package Entities;

//Oyuncu Sýnýfý
public class Gamer extends User {

	private int gameCount;
	private int achievementCount;
	private int badgeCount;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private int dateOfBirthYear;
	
	public Gamer(int id, String userName, String email, String password, int gameCount, int achievementCount,
			int badgeCount, String firstName, String lastName, String identityNumber, int dateOfBirthYear) {
		super(id, userName, email, password);
		this.gameCount = gameCount;
		this.achievementCount = achievementCount;
		this.badgeCount = badgeCount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirthYear = dateOfBirthYear;
	}

	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}

	public int getAchievementCount() {
		return achievementCount;
	}

	public void setAchievementCount(int achievementCount) {
		this.achievementCount = achievementCount;
	}

	public int getBadgeCount() {
		return badgeCount;
	}

	public void setBadgeCount(int badgeCount) {
		this.badgeCount = badgeCount;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public void setDateOfBirthYear(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}
	
}
