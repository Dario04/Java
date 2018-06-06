package loquesea;

public class Library {
	static int horaApertura = 9;
	static int horaCierre = 5;
	String address;
	public Library(String string) {
    address = string;
	}
    public void addBook(Book book) {
		Book[] books = new Book[10];
		
		for (int i = 0; i < books.length; i++) {
            books[i]=book;
		}
	}
	public void returnBook(String string) {
		// TODO Auto-generated method stub
		
	}

	private void printAvailableBooks() {
		// TODO Auto-generated method stub
	}
	private static void borrowBook(String string) {
		return borrowed;
		
	}

	private void printAddress() {
		System.out.println(address);
		
	}
	private static void printOpeningHours() {
		System.out.println();
		
	}
    private void printAddress() {
    }
    private void addBook(Book book) {
	    Book[] catalog = new Book[0];
    	if (numberOfBooks >= 0) {
    		Book[] newArray = new Book[(numberOfBooks + 1)];
    		System.arraycopy(catalog, 0, newArray, 0, numberOfBooks);
    		
    	}
    		catalog[numberOfBooks] = book;
    		numberOfBooks++
    	}
    private void borrowBook(String title) {
    	String string1 = title;
    	if(catalog.length == 0) {
    		System.out.println("lo siento, este libro no esta en nuestro catalogo");
    	}
    }
   

	public static void main(String[] args) {
		
		Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }	
	}

