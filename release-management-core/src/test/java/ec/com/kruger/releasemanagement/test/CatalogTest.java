package ec.com.kruger.releasemanagement.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

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
	
}
