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

@EntityCategories
@Table(name="categories")
public class Categories implements Serializable {

private static final long serialVersionUID = 1L;

	private Integer categoryid;
	private null categoryname;
	private null description;
	private byte[] picture;

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public null getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(null categoryname) {
		this.categoryname = categoryname;
	}

	public null getDescription() {
		return description;
	}

	public void setDescription(null description) {
		this.description = description;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

}