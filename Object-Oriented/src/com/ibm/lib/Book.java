package com.ibm.lib;

public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void status()throws LibraryException {
		if (mbr == null) {
			System.out.println(title + " is not issued");
		} else {
			throw new LibraryException(title + " is issued by " + mbr.getName());
		}
	}

	public void issueBook(Member m) throws LibraryException{
		if (mbr == null && m.getB()==null) {
			m.setB(this);
			mbr = m;
		} else {
			throw new LibraryException("first retrun the issued book");
		}
	}

	public void returnBook(Member m) throws LibraryException{
		if (mbr != null && m.getB()!=null) {
			m.setB(null);
			mbr = null;
		}

		else
		throw new LibraryException("first issue a book");
	}

}
