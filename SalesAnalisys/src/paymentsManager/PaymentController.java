package paymentsManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.AmericanExpress;
import beans.Diners;
import beans.Location;
import beans.MasterCard;
import beans.MyDate;
import beans.Payment;
import beans.Product;
import beans.Visa;

public class PaymentController {
	
	List<Payment> payments = new ArrayList<>();
	
	public void addARecord(String data) {
		
		// check if payment data is empty
		if(data.isEmpty()) {
			System.out.println("Exception: Empty Data is passed");
			return;
		}
		
		// split by comma since data is coming from cvs
		// I am sure there is ready library for this
		String[] dataArray = data.split(",");
		
		// check for missing fields
		if(dataArray.length != 8) {
			System.out.println("Exception: Some Data is missing");
			return;
		}
		
		Payment tempPayment = null;
		
		switch(dataArray[3].trim()) {
			
		case "Visa":
			tempPayment = new Visa();
			break;
		case "Mastercard":
			tempPayment = new MasterCard();
			break;
		case "Diners":
			tempPayment = new Diners();
			break;
		case "Amex":
			tempPayment = new AmericanExpress();
			break;
		default:
			System.out.println("Exception: Invlaid Payment! " + dataArray[3].trim());
			return;
		
		}
		// 1/2/2009 1:08:00 PM
		tempPayment.setTransactionDate(parseDate(dataArray[0]));
		tempPayment.setProduct(new Product(dataArray[1].trim()));
		tempPayment.setPrice(Double.parseDouble(dataArray[2].trim()));
		tempPayment.setName(dataArray[4].trim());
		tempPayment.setLocation(new Location(dataArray[5].trim(), dataArray[6].trim(), dataArray[7].trim()));
		
		
		payments.add(tempPayment);
		
	}
	
	// 1/2/2009 1:08:00 PM
	private MyDate parseDate(String str) {
		String[] arr = str.split("/");
		arr[2] = arr[2].substring(0, 2);
		
		return new MyDate(Integer.parseInt(arr[0]), 
						  Integer.parseInt(arr[1]), 
						  Integer.parseInt("20" + arr[2]));
		
	}
	
	public void loadDataFromCSVFile(String path) throws IOException {
		//Read data from CSV file
		BufferedReader br = new BufferedReader( 
				new FileReader("/Users/nshaazizov/Desktop/SalesJan2009.csv") );
	
		
		String line = br.readLine();
		
		while( ( line = br.readLine() ) != null ) {
			addARecord(line);
		}
	}

}
