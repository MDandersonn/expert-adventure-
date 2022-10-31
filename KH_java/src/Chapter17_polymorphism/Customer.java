package Chapter17_polymorphism;

import java.util.Objects;

public class Customer extends Person {
	public Customer(String name) {
		super(name);
	}
	private double discount=0.03;
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", discount=" + discount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(discount);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount);
	}
	
	
}
