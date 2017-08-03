package ec.com.kruger.releasemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.com.kruger.releasemanagement.dao.CatalogDao;
import ec.com.kruger.releasemanagement.dto.Catalog;

@Transactional(readOnly=true)
@Service
public class CatalogService {
	
	@Autowired
	private CatalogDao catalogDao;
	
	public List<Catalog> findAllCatalogs(){
		return catalogDao.findAll();
	}
	
	@Transactional(readOnly=false)
	public void createCatalog(Catalog catalog) {
		
	}

}
