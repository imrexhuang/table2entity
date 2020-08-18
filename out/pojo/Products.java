package entity;

import javax.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.PrePersist;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.Id;

@EntityProducts
@Table(name="products")
public class Products implements Serializable {

private static final long serialVersionUID = 1L;

	private Integer productid;
	private null productname;
	private Integer supplierid;
	private Integer categoryid;
	private null quantityperunit;
	private BigDecimal unitprice;
	private Integer unitsinstock;
	private Integer unitsonorder;
	private Integer reorderlevel;
	private Boolean discontinued;

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public null getProductname() {
		return productname;
	}

	public void setProductname(null productname) {
		this.productname = productname;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public null getQuantityperunit() {
		return quantityperunit;
	}

	public void setQuantityperunit(null quantityperunit) {
		this.quantityperunit = quantityperunit;
	}

	public BigDecimal getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}

	public Integer getUnitsinstock() {
		return unitsinstock;
	}

	public void setUnitsinstock(Integer unitsinstock) {
		this.unitsinstock = unitsinstock;
	}

	public Integer getUnitsonorder() {
		return unitsonorder;
	}

	public void setUnitsonorder(Integer unitsonorder) {
		this.unitsonorder = unitsonorder;
	}

	public Integer getReorderlevel() {
		return reorderlevel;
	}

	public void setReorderlevel(Integer reorderlevel) {
		this.reorderlevel = reorderlevel;
	}

	public Boolean getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}

}