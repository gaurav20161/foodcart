package food;

//Pogo class -  plain Java class that encapsulates data 

public class Food {
	
	private int code;
	private String item;
	private int price;
	
	
	public Food(int code, String item, int price) {
		
		this.code = code;
		this.item = item;
		this.price = price;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	

}
