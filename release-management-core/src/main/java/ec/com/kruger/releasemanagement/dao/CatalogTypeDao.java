package ec.com.kruger.releasemanagement.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ec.com.kruger.releasemanagement.dto.CatalogType;

@Repository
public class CatalogTypeDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void create(CatalogType catalogType) {
		sessionFactory.getCurrentSession().save(catalogType);
	}

	public CatalogType findAllCatalogTypes() {
//		HibernateQuery<CatalogType> query = new HibernateQuery<>(sessionFactory.getCurrentSession());
//		QCatalogType catalogType = QCatalogType.catalogType;
//		QCatalog catalog = QCatalog.catalog;
//		query.from(catalogType)
//				.leftJoin(catalogType.catalogs, catalog).where(catalogType.id.eq(1));
//		

//		List<CatalogType> transform = query.transform(GroupBy.groupBy(catalogType).list(
//				Projections.bean(CatalogType.class,
//						     catalogType.description, GroupBy.list(Projections.bean(Catalog.class, catalog.description)).as("catalogs")		
//				        )
//				));
//		return query.fetch().iterator().next();
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(CatalogType.class);
		criteria.createCriteria("catalogs",JoinType.LEFT_OUTER_JOIN);
		criteria.add(Restrictions.eq("id",1));
		
		return (CatalogType) criteria.uniqueResult();
	}
}
