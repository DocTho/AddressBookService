package de.fraunhofer.scai.addressbook.data;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table( name = "address-book-entry")
@Data
public class AddressBookEntry {

	@Id
	private Long id;

	@Basic
	private String name;
	@Basic
	private String vorname;
	
	@Basic
	private String street;
	@Basic
	private String postcode;
	@Basic
	private String city;
	@Basic
	private String country;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn
	private Set<PhoneNumber> phones;
}
