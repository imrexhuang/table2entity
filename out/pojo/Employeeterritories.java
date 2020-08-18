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

@EntityEmployeeterritories
@Table(name="employeeterritories")
public class Employeeterritories implements Serializable {

private static final long serialVersionUID = 1L;

	private Integer employeeid;
	private null territoryid;

	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public null getTerritoryid() {
		return territoryid;
	}

	public void setTerritoryid(null territoryid) {
		this.territoryid = territoryid;
	}

}