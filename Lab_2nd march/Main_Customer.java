package Lab_2nd_March;

	class Main_Customer {
		public static void main(String[] args) {
			Customer data=new Customer();	// setting object for customer 1			
			Customer data1=new Customer();	// setting object for customer 2
// setting value in object 1
			data.setAccountName("Mukul");
			data.setAccountNumber(123456789);
			data.setAccountBalance(25000);
// getting value in object 1
			System.out.println("Customer 1 details :");
			System.out.println("Customer Account number: "+data.getAccountNumber()+"  Customer name: "+data.getAccountName());
			System.out.println("Account balance: Rs."+data.getAccountBalance());
			data.withDrawAmount();
			
			System.out.println();
// setting value in object 2
			data1.setAccountName("Arvind");
			data1.setAccountNumber(987654321);
			data1.setAccountBalance(35000);
// getting value from object 2
			System.out.println("Customer 2 details :");
			System.out.println("Customer Account number: "+data1.getAccountNumber()+"  Customer name: "+data1.getAccountName());
			System.out.println("Account balance: Rs."+data1.getAccountBalance());
			data1.withDrawAmount();
			System.out.println("");
		}
	}
