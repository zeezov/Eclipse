package paymentsManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import beans.Location;
import beans.MyDate;
import beans.Payment;
import beans.Product;
import beans.Visa;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
//		// 1/2/09 Product1 1200 Visa Betina Parkville MO United States
//		
//		Payment payment1 = new Visa();
//		
//		payment1.setTransactionDate(new MyDate(1,2,2009));
//		payment1.setProduct(new Product("Product1"));
//		payment1.setPrice(1200);
//		payment1.setName("Betina");
//		payment1.setLocation(new Location("Parkville", "MO", "United States"));
//		
//		// toString method
//		
//		System.out.println(payment1.toString());
//		
//		PaymentController paymentController = new PaymentController();
//		
//		paymentController.addARecord("1/2/09 6:17,Product1,1200,Mastercard,carolina,Basildon,England,United Kingdom");
//		
//		System.out.println(paymentController.payments.get(0).toString());
//		
//		// Read data from CSV file
//		BufferedReader br = new BufferedReader(new FileReader("/Users/nshaazizov/Desktop/SalesJan2009.csv"));
//		
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		
//		System.out.println("=======================================");
//		
//		String line = "";
//		
//		while( (line = br.readLine()) != null ) {
//			System.out.println(line);
//		}
		
		PaymentController p = new PaymentController();
		p.loadDataFromCSVFile("/Users/nshaazizov/Desktop/SalesJan2009.csv");
		
		for(Payment payment :  p.payments) {
			System.out.println(payment.toString());
		}
		
		
	}

}
