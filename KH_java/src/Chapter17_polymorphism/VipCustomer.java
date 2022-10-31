package Chapter17_polymorphism;

import java.util.Objects;

public class VipCustomer extends Person {
	public VipCustomer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private double discount=0.08;
	private int point =10000;
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "VipCustomer [name=" + name + ", discount=" + discount + ", point=" + point + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(discount, point);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VipCustomer other = (VipCustomer) obj;
		return Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount) && point == other.point;
	}

}
