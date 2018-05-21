package tsingtaopad.et.liststretchdemo;

public class Hotel {
	private String name;
	private String zhe;
	private String price;
	private String num;

	public Hotel(String name, String zhe, String price, String num) {
		super();
		this.name = name;
		this.zhe = zhe;
		this.price = price;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZhe() {
		return zhe;
	}

	public void setZhe(String zhe) {
		this.zhe = zhe;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}
