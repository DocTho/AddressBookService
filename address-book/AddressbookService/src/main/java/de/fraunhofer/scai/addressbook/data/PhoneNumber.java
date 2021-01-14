package de.fraunhofer.scai.addressbook.data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "address-phone-number")
@Data
public class PhoneNumber {

	@Id
	private Long id;

	@Basic
	private String number;
	
	@Basic
	private String tag;
	
	@ManyToOne
	private AddressBookEntry abEntry;
	
}
