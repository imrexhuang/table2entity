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

@EntityTerritories
@Table(name="territories")
public class Territories implements Serializable {

private static final long serialVersionUID = 1L;

	private null territoryid;
	private null territorydescription;
	private Integer regionid;

	public null getTerritoryid() {
		return territoryid;
	}

	public void setTerritoryid(null territoryid) {
		this.territoryid = territoryid;
	}

	public null getTerritorydescription() {
		return territorydescription;
	}

	public void setTerritorydescription(null territorydescription) {
		this.territorydescription = territorydescription;
	}

	public Integer getRegionid() {
		return regionid;
	}

	public void setRegionid(Integer regionid) {
		this.regionid = regionid;
	}

}