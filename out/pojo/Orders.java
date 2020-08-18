package entity;

import javax.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.PrePersist;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.Id;

@EntityOrders
@Table(name="orders")
public class Orders implements Serializable {

private static final long serialVersionUID = 1L;

	private Integer orderid;
	private null customerid;
	private Integer employeeid;
	private Timestamp orderdate;
	private Timestamp requireddate;
	private Timestamp shippeddate;
	private Integer shipvia;
	private BigDecimal freight;
	private null shipname;
	private null shipaddress;
	private null shipcity;
	private null shipregion;
	private null shippostalcode;
	private null shipcountry;

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public null getCustomerid() {
		return customerid;
	}

	public void setCustomerid(null customerid) {
		this.customerid = customerid;
	}

	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public Timestamp getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}

	public Timestamp getRequireddate() {
		return requireddate;
	}

	public void setRequireddate(Timestamp requireddate) {
		this.requireddate = requireddate;
	}

	public Timestamp getShippeddate() {
		return shippeddate;
	}

	public void setShippeddate(Timestamp shippeddate) {
		this.shippeddate = shippeddate;
	}

	public Integer getShipvia() {
		return shipvia;
	}

	public void setShipvia(Integer shipvia) {
		this.shipvia = shipvia;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public null getShipname() {
		return shipname;
	}

	public void setShipname(null shipname) {
		this.shipname = shipname;
	}

	public null getShipaddress() {
		return shipaddress;
	}

	public void setShipaddress(null shipaddress) {
		this.shipaddress = shipaddress;
	}

	public null getShipcity() {
		return shipcity;
	}

	public void setShipcity(null shipcity) {
		this.shipcity = shipcity;
	}

	public null getShipregion() {
		return shipregion;
	}

	public void setShipregion(null shipregion) {
		this.shipregion = shipregion;
	}

	public null getShippostalcode() {
		return shippostalcode;
	}

	public void setShippostalcode(null shippostalcode) {
		this.shippostalcode = shippostalcode;
	}

	public null getShipcountry() {
		return shipcountry;
	}

	public void setShipcountry(null shipcountry) {
		this.shipcountry = shipcountry;
	}

}