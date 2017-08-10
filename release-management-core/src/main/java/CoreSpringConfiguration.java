

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ImportResource({"classpath:/transactionBeans.xml"})
@ComponentScan(basePackages={ "ec.com.kruger.releasemanagement" })
public class CoreSpringConfiguration {

	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/RELEASEMANAGEMENT");
		dataSource.setUsername("root");
		dataSource.setPassword("Password01");

		return dataSource;
	}
	
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
    	Properties props = new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		props.put("hibernate.show_sql", "true");
		
        final LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] { "ec.com.kruger.releasemanagement.dto" });
        sessionFactory.setHibernateProperties(props);

        return sessionFactory;
    }

	@Bean
	public PlatformTransactionManager hibernateTransactionManager() {
		final HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

}
