package com.sr.emstore.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sr.emstore.po.ProductPO;

@Repository
public class ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	public List<ProductPO> getProducts(){
		Session session = sessionFactory.openSession();
		Criteria ctx = session.createCriteria(ProductPO.class);
		ctx.add(Restrictions.eq("productState", "Active"));
		return (List<ProductPO>)ctx.list();
	}
	
	public ProductPO getProductById(int id) {
		Session session = sessionFactory.openSession();
		ProductPO productPO = (ProductPO) session.get(ProductPO.class,id);
		return productPO;
	}
	
	public int saveProduct(ProductPO productPO) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("DAO Layer");
		session.save(productPO);
		tx.commit();
		return productPO.getProductId();
	}
	
	public void deleteProduct(ProductPO productPO) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(productPO);
		tx.commit();
	}
}
