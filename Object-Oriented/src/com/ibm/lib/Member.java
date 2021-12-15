package com.ibm.lib;
public class Member {
	private String name;
	private Book b;

	public Member(String name) {
		super();
		this.name = name;
	}

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

	public String getName() {
		return name;
	}

	public void status() throws LibraryException {
		if (b == null) {
			System.out.println("No book is issued by:" + name);
		} else {
			throw new LibraryException(name + " has issued the book having title " + b.getTitle());
		}
	}
}
