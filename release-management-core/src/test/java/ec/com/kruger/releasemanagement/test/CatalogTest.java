package ec.com.kruger.releasemanagement.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import ec.com.kruger.releasemanagement.dto.Catalog;
import ec.com.kruger.releasemanagement.dto.CatalogType;
import ec.com.kruger.releasemanagement.service.CatalogService;
import ec.com.kruger.releasemanagement.spring.CoreSpringConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CoreSpringConfiguration.class }, loader = AnnotationConfigContextLoader.class)
public class CatalogTest {
	@Autowired
	private CatalogService catalogService;
	
	@Test
	public void testFindAllCatalogs() {
		catalogService.findAllCatalogs();
	}
	
	@Test
	public void testFindAllCatalogsByType() {
		List<Catalog> catalogList = catalogService.findCatalogByType(1);
		for (Catalog catalog : catalogList) {
			System.out.println(catalog.getDescription());
		}
	}
	
	@Test
	public void testCreateCatalogType() {
		CatalogType catalogType = new CatalogType();
		catalogType.setCode("1");
		catalogType.setDescription("Ambiente");
		catalogService.transCreateCatalogType(catalogType);
	}
	
	@Test
	public void testCreateCatalog() {
		Catalog catalog = new Catalog();
		catalog.setDescription("Produccion");
		catalog.setCode("PRO");
		catalog.setTypeId(1);
		catalogService.transCreateCatalog(catalog);
	}
	
	@Test
	public void testFindAllCatalogTypes() {
		CatalogType catalogType = catalogService.findAllCatalogTypes();
		System.out.println(catalogType.getDescription());
		for (Catalog catalog : catalogType.getCatalogs()) {
			System.out.println("\t"+catalog.getDescription());
		}
	}
	
}
