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

@EntityCustomercustomerdemo
@Table(name="customercustomerdemo")
public class Customercustomerdemo implements Serializable {

private static final long serialVersionUID = 1L;

	private null customerid;
	private null customertypeid;

	public null getCustomerid() {
		return customerid;
	}

	public void setCustomerid(null customerid) {
		this.customerid = customerid;
	}

	public null getCustomertypeid() {
		return customertypeid;
	}

	public void setCustomertypeid(null customertypeid) {
		this.customertypeid = customertypeid;
	}

}