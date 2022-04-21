package eTradeSystem.dataAccess.concretes.hibernate;

import java.util.List;

import eTradeSystem.dataAccess.abstracts.ProductDao;
import eTradeSystem.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println(product.getProductName()+" adl� �r�n eklendi.");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getProductName()+" adl� �r�n silindi.");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getProductName()+" adl� �r�n g�ncellendi.");
	}

	@Override
	public void getId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
