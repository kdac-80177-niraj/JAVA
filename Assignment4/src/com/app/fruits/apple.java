package com.app.fruits;

public class apple extends fruits{
	public apple() {
		super("Apple",true);
	}
	public apple(String name,boolean isFresh,String color, double weight) {
		super(name,isFresh);
		this.color = color;
		this.weight = weight;
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return super.getWeight();
	}
	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		super.setWeight(weight);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	public Boolean getIsFresh() {
		// TODO Auto-generated method stub
		return super.getIsFresh();
	}
	@Override
	public void setIsFresh(Boolean isFresh) {
		// TODO Auto-generated method stub
		super.setIsFresh(isFresh);
	}
	@Override
	public void acceptData() {
		// TODO Auto-generated method stub
		super.acceptData();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet and Sour";
	}
	
	
}
