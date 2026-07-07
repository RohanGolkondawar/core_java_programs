package com.rohan.library_management_system;


public class BookLibrary {

	public static void main(String[] args) 
	{
		
	    Library library = new Library();
	    
	    while(true)
	    {
	    	System.out.println();
			IO.println("1. Add Book");
			IO.println("2. Display Books");
			IO.println("3. Update Quantity");
			IO.println("4. Delete Book");
			IO.println("5. Exit");
			System.out.println();
			
			int choice = Integer.parseInt(IO.readln("Enter Choice : "));
			
			switch (choice) {
			
			case 1 -> 
			{
				String title = IO.readln("Title : ");
				String author = IO.readln("author : ");
				long isbn = Long.parseLong(IO.readln("ISBN : "));
				double price = Double.parseDouble(IO.readln("Price : "));
				int quantity = Integer.parseInt(IO.readln("Quantity : "));
				Book b = new Book(title, author, isbn, price, quantity);
				library.addBook(b);
				
				
			}
			case 2 ->
			{
				IO.println("-------Books List--------");
				library.getAllBooks();
			}
			case 3 ->
			{
				long isbn = Long.parseLong(IO.readln("Enter ISBN : "));
				library.updateBookQuantityByISBN(isbn);
			}
			case 4 ->
			{
				String title = IO.readln("Enter Title : ");
				library.deleteBookByTitle(title);
				
			}
			case 5 ->
			{
				System.exit(0);
			}
			default ->
			{
				IO.println("Wrong choice");
			}
			
			
			}

	    }

	}

}
