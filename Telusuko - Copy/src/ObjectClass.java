class Laptop
{
	private String model;
	private long price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (int) (price ^ (price >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}
public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lp=new Laptop();
		lp.setModel("Dell");
		lp.setPrice(100000);
		System.out.println(lp);//If we print the obj be default it will call toString Method
		                       //In the above class Laptop we have Overriden the toString() method
		Laptop lp1=new Laptop();
		lp1.setModel("Dell");
		lp1.setPrice(100000);
		System.out.println(lp.equals(lp1));//calling the Overrided equals method
		//lp.e
		
	}

}
