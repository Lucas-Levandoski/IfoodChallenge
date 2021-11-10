package entity;

public class Restaurant {

	private int cdRestaurant;
	private String address;
	private String cnpj;
	private String restaurantName;
	private String anvisaScore;
	private String restaurantScore;

	public Restaurant(int cdRestaurant, String address, String cnpj, String restaurantName, String anvisaScore,
			String restaurantScore) {
		super();
		this.cdRestaurant = cdRestaurant;
		this.address = address;
		this.cnpj = cnpj;
		this.restaurantName = restaurantName;
		this.anvisaScore = anvisaScore;
		this.restaurantScore = restaurantScore;
	}

	public Restaurant() {
		super();
	}

	public int getCdRestaurant() {
		return cdRestaurant;
	}

	public void setCdRestaurant(int cdRestaurant) {
		this.cdRestaurant = cdRestaurant;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getAnvisaScore() {
		return anvisaScore;
	}

	public void setAnvisaScore(String anvisaScore) {
		this.anvisaScore = anvisaScore;
	}

	public String getRestaurantScore() {
		return restaurantScore;
	}

	public void setRestaurantScore(String restaurantScore) {
		this.restaurantScore = restaurantScore;
	}

}
