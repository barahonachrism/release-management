package ec.com.kruger.releasemanagement.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="CatalogType")
@Entity
public class CatalogType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	@Column(name="CODE")
	private String code;
	@Column(name="DESCRIPTION")
	private String description;
	@OneToMany(mappedBy="type")
	private List<Catalog> catalogs;
	@OneToMany(mappedBy="type")
	private List<Catalog> catalogs1;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Catalog> getCatalogs() {
		return catalogs;
	}
	public void setCatalogs(List<Catalog> catalogs) {
		this.catalogs = catalogs;
	}
	

}
