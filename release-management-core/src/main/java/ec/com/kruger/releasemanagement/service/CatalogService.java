package ec.com.kruger.releasemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.kruger.releasemanagement.dao.CatalogDao;
import ec.com.kruger.releasemanagement.dao.CatalogTypeDao;
import ec.com.kruger.releasemanagement.dto.Catalog;
import ec.com.kruger.releasemanagement.dto.CatalogType;

@Service
public class CatalogService {
	
	@Autowired
	private CatalogDao catalogDao;
	
	@Autowired
	private CatalogTypeDao catalogTypeDao;
	
	public List<Catalog> findAllCatalogs(){
		return catalogDao.findAll();
	}
	
	public void transCreateCatalog(Catalog catalog) {
		catalogDao.create(catalog);
	}
	
	public void transCreateCatalogType(CatalogType catalogType) {
		catalogTypeDao.create(catalogType);
	}
	
	public List<Catalog> findCatalogByType(Integer typeId){
		return catalogDao.findCatalogByType(typeId);
	}
	
	public CatalogType findAllCatalogTypes() {
		return catalogTypeDao.findAllCatalogTypes();
	}

}
