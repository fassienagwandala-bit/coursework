package coursework;

public class Main {
	public static void main(String [] args) {
		Product book = new Product("FN031", "Exercise Book", "Stationery", 1700, 8259);
		Product pen = new Product("FN0032", "Black Pen", "Stationery", 570, 11976);
		Product paper = new Product("FN0033", "Printing Paper", "paper",22500 ,529876);
		Product flash = new Product("FN0034", "Flash Disk 67GB", "Electronics", 67000 , 82);
		Product calculator = new Product("FN0035", "Calculator", "Electronics", 54600 ,99 );
		Product  eraser= new Product("FN0036", "Eraser", "Stationery", 660 ,59 );
		Product ruler = new Product("FN0037", "Ruler", "Stationery",1200 , 852);
	    Product set = new Product("FN0038", "Mathematical Set", "Stationery", 11500, 491);
	
	    
	System.out.println("Book price:" + book.getUnitPrice());
	System.out.println("Pen price:" + pen.getUnitPrice());
	System.out.println("Paper price:" + paper.getUnitPrice());
	System.out.println("Flash disk price: " + flash.getUnitPrice());
	System.out.println("Calculator stock: " + calculator.getQuantityInStock());
	System.out.println("Eraser stock: " + eraser.getQuantityInStock());
	System.out.println("Ruler price: " + ruler.getUnitPrice());
	System.out.println("Mathematical set price: " + set.getUnitPrice());
	
	
	
	System.out.println("\n--- INITIAL INVENTORY ---");
	System.out.println(book.getProductId() + " | " + book.getProductName() + " | " + book.getProductCategory() + " | " + book.getUnitPrice() + " | " + book.getQuantityInStock());
	System.out.println(pen.getProductId() + " | " + pen.getProductName() + " | " + pen.getProductCategory() + " | " + pen.getUnitPrice() + " | " + pen.getQuantityInStock());
	System.out.println(paper.getProductId() + " | " + paper.getProductName() + " | " + paper.getProductCategory() + " | " + paper.getUnitPrice() + " | " + paper.getQuantityInStock());
	System.out.println(flash.getProductId() + " | " + flash.getProductName() + " | " + flash.getProductCategory() + " | " + flash.getUnitPrice() + " | " + flash.getQuantityInStock());
	System.out.println(calculator.getProductId() + " | " + calculator.getProductName() + " | " + calculator.getProductCategory() + " | " + calculator.getUnitPrice() + " | " + calculator.getQuantityInStock());
	System.out.println(eraser.getProductId() + " | " + eraser.getProductName() + " | " + eraser.getProductCategory() + " | " + eraser.getUnitPrice() + " | " + eraser.getQuantityInStock());
	System.out.println(ruler.getProductId() + " | " + ruler.getProductName() + " | " + ruler.getProductCategory() + " | " + ruler.getUnitPrice() + " | " + ruler.getQuantityInStock());
	System.out.println(set.getProductId() + " | " + set.getProductName() + " | " + set.getProductCategory() + " | " + set.getUnitPrice() + " | " + set.getQuantityInStock());

	
	book.setUnitPrice(1900);
	flash.setQuantityInStock(50);

	
	System.out.println("\n--- AFTER UPDATES ---");
	System.out.println(book.getProductId() + " | " + book.getProductName() + " | " + book.getProductCategory() + " | " + book.getUnitPrice() + " | " + book.getQuantityInStock());
	System.out.println(pen.getProductId() + " | " + pen.getProductName() + " | " + pen.getProductCategory() + " | " + pen.getUnitPrice() + " | " + pen.getQuantityInStock());
	System.out.println(paper.getProductId() + " | " + paper.getProductName() + " | " + paper.getProductCategory() + " | " + paper.getUnitPrice() + " | " + paper.getQuantityInStock());
	System.out.println(flash.getProductId() + " | " + flash.getProductName() + " | " + flash.getProductCategory() + " | " + flash.getUnitPrice() + " | " + flash.getQuantityInStock());
	System.out.println(calculator.getProductId() + " | " + calculator.getProductName() + " | " + calculator.getProductCategory() + " | " + calculator.getUnitPrice() + " | " + calculator.getQuantityInStock());
	System.out.println(eraser.getProductId() + " | " + eraser.getProductName() + " | " + eraser.getProductCategory() + " | " + eraser.getUnitPrice() + " | " + eraser.getQuantityInStock());
	System.out.println(ruler.getProductId() + " | " + ruler.getProductName() + " | " + ruler.getProductCategory() + " | " + ruler.getUnitPrice() + " | " + ruler.getQuantityInStock());
	System.out.println(set.getProductId() + " | " + set.getProductName() + " | " + set.getProductCategory() + " | " + set.getUnitPrice() + " | " + set.getQuantityInStock());

	
	System.out.println("\n--- INVALID VALUE TEST ---");
	pen.setUnitPrice(-200);
	System.out.println("Pen price is still: " + pen.getUnitPrice());
	}
	

}
