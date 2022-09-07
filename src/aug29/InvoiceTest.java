package aug29;

import java.util.Scanner;

class Invoice {

	String partNumber, partDescription;
	int quantity;
	double price;

	Invoice(String partNumber, String partDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.price = price;
		this.quantity = quantity;
	}

	void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	String getPartDescription() {
		return partDescription;
	}

	void setPrice(double price) {
		this.price = price;
	}

	double getPrice() {
		return price;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	int getQuantity() {
		return quantity;
	}

	void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	String getPartNumber() {
		return partNumber;
	}

	double getInvoice() {
		return price * quantity;
	}
}

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of products");
		int numberOfProducts = scan.nextInt();
		// local variables to store temporarily
		String pNumber, pDiscription;
		int quantity;
		double price;
		Invoice invoice[] = new Invoice[numberOfProducts];

		for (int index = 0; index < numberOfProducts; index++) {
			// take input from user for each product
			System.out.println("Enter Product " + (index + 1) + " Details: ");
			System.out.println("Enter Product Number: ");
			pNumber = scan.next();
			System.out.println("Enter Product Discription: ");
			pDiscription = scan.next();
			System.out.println("Enter Product Price: ");
			price = scan.nextDouble();
			price = price < 0 ? 0 : price;
			System.out.println("Enter quantity of Product : ");
			quantity = scan.nextInt();
			quantity = quantity < 0 ? 0 : quantity;
			scan.close();

			// assign each product details in invoice
			invoice[index] = new Invoice(pNumber, pDiscription, quantity, price);

		}

		// display each product Invoice
		System.out.println("Invoice of products:");
		for (int index = 0; index < numberOfProducts; index++) {
			System.out.println(
					"product Number: " + invoice[index].getPartNumber() + " Invoice:" + invoice[index].getInvoice());
		}

	}

}
