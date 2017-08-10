package ec.com.kruger.releasemanagement.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.hibernate.HibernateQuery;

import ec.com.kruger.releasemanagement.dto.Catalog;
import ec.com.kruger.releasemanagement.dto.QCatalog;

@Repository
public class CatalogDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Catalog> findAll(){
		List<Catalog>  catalogList = sessionFactory.getCurrentSession().createCriteria(Catalog.class).list();
		return catalogList;
	}
	
	public List<Catalog> findCatalogByType(Integer typeId){
//		Criteria criteriaCatalog = sessionFactory.getCurrentSession().createCriteria(Catalog.class);
//		criteriaCatalog.add(Restrictions.eq("typeId", typeId));
//		return criteriaCatalog.list();
		HibernateQuery query = new HibernateQuery<>(sessionFactory.getCurrentSession());
		QCatalog catalog = QCatalog.catalog;
		query.select(Projections.bean(Catalog.class,catalog.code,catalog.description)).from(catalog).where(catalog.typeId.eq(typeId));
		return query.fetch();
	}
	
	public void create(Catalog catalog) {
		sessionFactory.getCurrentSession().save(catalog);
		
	}
}
