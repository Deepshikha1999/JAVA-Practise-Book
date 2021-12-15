package com.ibm.lib;

public class TestLibrary{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("the alchemist");
		Member m = new Member("Deep");

		// b.status();
		// m.status();

		
		try {
			b.issueBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			b.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			m.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			b.issueBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			b.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			m.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			b.returnBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			b.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			m.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			b.returnBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			b.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			m.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}

}
