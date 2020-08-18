package entity;

import javax.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import java.util.Date;
import javax.persistence.Id;

@EntityShippers
@Table(name="shippers")
public class Shippers implements Serializable {

private static final long serialVersionUID = 1L;

	private Integer shipperid;
	private null companyname;
	private null phone;

	public Integer getShipperid() {
		return shipperid;
	}

	public void setShipperid(Integer shipperid) {
		this.shipperid = shipperid;
	}

	public null getCompanyname() {
		return companyname;
	}

	public void setCompanyname(null companyname) {
		this.companyname = companyname;
	}

	public null getPhone() {
		return phone;
	}

	public void setPhone(null phone) {
		this.phone = phone;
	}

}