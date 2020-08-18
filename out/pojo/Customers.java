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

@EntityCustomers
@Table(name="customers")
public class Customers implements Serializable {

private static final long serialVersionUID = 1L;

	private null customerid;
	private null companyname;
	private null contactname;
	private null contacttitle;
	private null address;
	private null city;
	private null region;
	private null postalcode;
	private null country;
	private null phone;
	private null fax;

	public null getCustomerid() {
		return customerid;
	}

	public void setCustomerid(null customerid) {
		this.customerid = customerid;
	}

	public null getCompanyname() {
		return companyname;
	}

	public void setCompanyname(null companyname) {
		this.companyname = companyname;
	}

	public null getContactname() {
		return contactname;
	}

	public void setContactname(null contactname) {
		this.contactname = contactname;
	}

	public null getContacttitle() {
		return contacttitle;
	}

	public void setContacttitle(null contacttitle) {
		this.contacttitle = contacttitle;
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

	public null getPhone() {
		return phone;
	}

	public void setPhone(null phone) {
		this.phone = phone;
	}

	public null getFax() {
		return fax;
	}

	public void setFax(null fax) {
		this.fax = fax;
	}

}