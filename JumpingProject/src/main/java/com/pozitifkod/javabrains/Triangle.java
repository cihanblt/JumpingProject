package com.pozitifkod.javabrains;

public class Triangle {
	private String type;
	private int height;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle(String type,int height){
		this.type = type;
		this.height = height;
	}
	public void draw(){
		System.out.println(getType() + " - " + getHeight());
		System.out.println("PointA --> x : " + getPointA().getX() + " - y : " + getPointA().getY());
		System.out.println("PointB --> x : " + getPointB().getX() + " - y : " + getPointB().getY());
		System.out.println("PointC --> x : " + getPointC().getX() + "y : " + getPointC().getY());
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
}
