package entity;

import javax.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.PrePersist;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.Id;

@EntityEmployees
@Table(name="employees")
public class Employees implements Serializable {

private static final long serialVersionUID = 1L;

	private Integer employeeid;
	private null lastname;
	private null firstname;
	private null title;
	private null titleofcourtesy;
	private Timestamp birthdate;
	private Timestamp hiredate;
	private null address;
	private null city;
	private null region;
	private null postalcode;
	private null country;
	private null homephone;
	private null extension;
	private byte[] photo;
	private null notes;
	private Integer reportsto;
	private null photopath;

	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public null getLastname() {
		return lastname;
	}

	public void setLastname(null lastname) {
		this.lastname = lastname;
	}

	public null getFirstname() {
		return firstname;
	}

	public void setFirstname(null firstname) {
		this.firstname = firstname;
	}

	public null getTitle() {
		return title;
	}

	public void setTitle(null title) {
		this.title = title;
	}

	public null getTitleofcourtesy() {
		return titleofcourtesy;
	}

	public void setTitleofcourtesy(null titleofcourtesy) {
		this.titleofcourtesy = titleofcourtesy;
	}

	public Timestamp getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Timestamp birthdate) {
		this.birthdate = birthdate;
	}

	public Timestamp getHiredate() {
		return hiredate;
	}

	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}

	public null getAddress() {
		return address;
	}

	public void setAddress(null address) {
		this.address = address;
	}

	public null getCity() {
		return city;
	}

	public void setCity(null city) {
		this.city = city;
	}

	public null getRegion() {
		return region;
	}

	public void setRegion(null region) {
		this.region = region;
	}

	public null getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(null postalcode) {
		this.postalcode = postalcode;
	}

	public null getCountry() {
		return country;
	}

	public void setCountry(null country) {
		this.country = country;
	}

	public null getHomephone() {
		return homephone;
	}

	public void setHomephone(null homephone) {
		this.homephone = homephone;
	}

	public null getExtension() {
		return extension;
	}

	public void setExtension(null extension) {
		this.extension = extension;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public null getNotes() {
		return notes;
	}

	public void setNotes(null notes) {
		this.notes = notes;
	}

	public Integer getReportsto() {
		return reportsto;
	}

	public void setReportsto(Integer reportsto) {
		this.reportsto = reportsto;
	}

	public null getPhotopath() {
		return photopath;
	}

	public void setPhotopath(null photopath) {
		this.photopath = photopath;
	}

}