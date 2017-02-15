public class Food {

	private String name;
	private String consist;
	private String weight;
	private int price;
	private int id;	

	public Food(String name, String consist, String weight, int price) {

		this.name = name;
		this.consist = consist;
		this.weight = weight;
		this.price = price;
	}
	
	public Food() {		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConsist() {
		return consist;
	}

	public void setConsist(String consist) {
		this.consist = consist;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
