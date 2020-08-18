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

@EntityCustomerdemographics
@Table(name="customerdemographics")
public class Customerdemographics implements Serializable {

private static final long serialVersionUID = 1L;

	private null customertypeid;
	private null customerdesc;

	public null getCustomertypeid() {
		return customertypeid;
	}

	public void setCustomertypeid(null customertypeid) {
		this.customertypeid = customertypeid;
	}

	public null getCustomerdesc() {
		return customerdesc;
	}

	public void setCustomerdesc(null customerdesc) {
		this.customerdesc = customerdesc;
	}

}