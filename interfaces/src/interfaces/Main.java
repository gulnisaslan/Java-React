package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(),new DatabaseLogger()};
		Customer engin =new Customer(1,"Engin","Demiro�");
		 CustomerManager customerManager= new CustomerManager(loggers );
		
		 customerManager.add(engin);
	

 }
}
