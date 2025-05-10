package library;

import java.util.Objects;

public class Book {
	private String isbn;
	private String authorName;
	private double price;
	private int quantity;
	

	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String isbn,String authorName,double price,int quantity) {
		this.isbn=isbn;
		this.authorName=authorName;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIsbn() {
		return isbn;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
		
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Book->   isbn="+isbn + "  authorname="+authorName+"       price= "+price+"Rs       quantity="+quantity;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}
	 
}
