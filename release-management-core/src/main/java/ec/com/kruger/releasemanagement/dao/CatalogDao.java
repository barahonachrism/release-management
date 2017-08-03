package ec.com.kruger.releasemanagement.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ec.com.kruger.releasemanagement.dto.Catalog;

@Repository
public class CatalogDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Catalog> findAll(){
		return sessionFactory.getCurrentSession().createCriteria(Catalog.class).list();
	}
}
