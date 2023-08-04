
public class House {
	int id;
	String owner;
	int size;
	int price;
	
	public House() {
		
	}
	
	public House(int id, String owner, int size, int price) {
		super();
		this.id = id;
		this.owner = owner;
		this.size = size;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", owner=" + owner + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
	
}
