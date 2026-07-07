package com.rohan.library_management_system;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	
	private ArrayList<Book> books;

	
	public Library() {
		super();
		books = new ArrayList<Book>();

	}
	
	public void addBook(Book book)
	{
		for(Book b : books)
		{
			if(b.getIsbn()==book.getIsbn())
			{
				IO.println("ISBN already exist");
			}
		}
		
		books.add(book);
		IO.println("Book added successfully");

	}
	
	private Book searchBookByISBN(long isbn)
	{
		for(Book b : books)
		{
			if(b.getIsbn()==isbn)
			{
				return b;
			}
		}
		
		return null;
		
	}
		
	public void updateBookQuantityByISBN(long isbn)
	{
		for(Book b : books)
		{
			if(b.getIsbn()==isbn)
			{
				int quantity = Integer.parseInt(IO.readln("Enter quantity : "));
				if(quantity<0)
				{
					IO.println("Quantity cannot in negative");
				}
				else
				{
				b.setQuantity(quantity);
				IO.println("Quantity Updated Successfully");
				}
			}
			
		}

	}
	
	public void deleteBookByTitle(String title)
	{
		Iterator<Book> iterator = books.iterator();
		while(iterator.hasNext())
		{
			Book b = iterator.next();
			if(b.getTitle().equalsIgnoreCase(title))
			{
				iterator.remove();
				IO.println("Book Deleted Successfully");
				return;
			}
		}
		
		IO.println("Book not found");
		
	}
	
	public void getAllBooks() {
	    if (books.isEmpty()) {
	        IO.println("No books available");
	        return;
	    }

	    for (Book b : books) {
	        IO.println(b);
	        IO.println("------------------------");
	    }
	}
	
	

}
