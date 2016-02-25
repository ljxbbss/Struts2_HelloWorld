package com.atguigu.action;

public class SaveBook {

	private String bookName;
	private String author;
	private double price;
	
	
	public String saveBook(){
		System.out.println("saveBook -----------");
		
		
		return "save-success";
	}
	
	
	public SaveBook() {
		// TODO Auto-generated constructor stub
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
