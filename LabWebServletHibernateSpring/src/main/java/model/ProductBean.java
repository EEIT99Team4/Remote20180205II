package model;

import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="PRODUCT")
public class ProductBean {
	@Id
	private int id;
	private String name;
	private double price;
	private java.util.Date make;
	private int expire;
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof ProductBean)) {
			ProductBean temp = (ProductBean) obj;
			if(this.id == temp.id) {
				return true;
			}
		}
		return false;
	}

	@Transient
	private SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
	@Override
	public String toString() {
		return "{"+id+":"+name+":"+price+":"+make+":"+expire+"}";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public java.util.Date getMake() {
		return make;
	}
	public void setMake(java.util.Date make) {
		this.make = make;
	}
	public int getExpire() {
		return expire;
	}
	public void setExpire(int expire) {
		this.expire = expire;
	}
}
