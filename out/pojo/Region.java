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

@EntityRegion
@Table(name="region")
public class Region implements Serializable {

private static final long serialVersionUID = 1L;

	private Integer regionid;
	private null regiondescription;

	public Integer getRegionid() {
		return regionid;
	}

	public void setRegionid(Integer regionid) {
		this.regionid = regionid;
	}

	public null getRegiondescription() {
		return regiondescription;
	}

	public void setRegiondescription(null regiondescription) {
		this.regiondescription = regiondescription;
	}

}