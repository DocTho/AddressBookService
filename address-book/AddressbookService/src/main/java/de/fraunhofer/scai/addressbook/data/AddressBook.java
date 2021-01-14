package de.fraunhofer.scai.addressbook.data;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table( name = "address-book")
@Data
public class AddressBook {

	private Long id;
	
	private String name;
	
	private Set<AddressBookEntry> entries;
	
}
