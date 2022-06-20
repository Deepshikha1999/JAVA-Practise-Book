package com.ibm.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="bycarrier", query="from Flight where carrier=:car"),
	@NamedQuery(name="byroute", query="from Flight where source=:src and destiny=:dest")
})
public class Flight {

	@Id
	@Column(length=20)
	private String code;
	@Column(length=30)
	private  String carrier;
	@Column(length=30)
	private String source;
	@Column(length=30)
	private String destiny;

	public Flight() {
		super();
	}
	
	public Flight(String code, String carrier, String source, String destiny) {
		super();
		this.code = code;
		this.carrier = carrier;
		this.source = source;
		this.destiny = destiny;
	}



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestiny() {
		return destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

	@Override
	public String toString() {
		return "Flight [code=" + code + ", carrier=" + carrier + ", source=" + source + ", destiny=" + destiny + "]";
	}
}
