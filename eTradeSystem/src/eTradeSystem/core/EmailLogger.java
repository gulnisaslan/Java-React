package eTradeSystem.core;

import java.time.LocalDate;
import java.time.LocalTime;

import eTradeSystem.entities.concretes.Product;
import eTradeSystem.entities.concretes.User;

public class EmailLogger implements LoggerService {

	@Override
	public void logForSendAuthLink(User user) {
		System.out.println("Say�n  " + user.getFirstName() + " " +user.getLastName() +
				" do�rulama ba�lant�n�z g�nderildi, bu ba�lant�ya t�klay�p i�lemini tamamlay�n�z.");
	}

	@Override
	public void logForRegister(User user) {
		System.out.println("Say�n " + user.getFirstName()+" "+user.getLastName()+" "+
	LocalDate.now()+LocalTime.now() + " tarihinde sisteme kaydoldunuz.");
		
	}

	@Override
	public void logForLogink(User user) {
		System.out.println("Say�n " + user.getFirstName()+" "+user.getLastName()+" "+
				LocalDate.now()+LocalTime.now() + " tarihinde sisteme giri� yapt�n�z.");
		
	}

	@Override
	public void logForSale(User user ,Product product) {
		System.out.println("Say�n " + user.getFirstName()+" "+user.getLastName()+" "+
				LocalDate.now()+LocalTime.now() + " tarihinde " +product.getProductName() +" �r�n sat�n ald�n�z.");
		
	}

}
