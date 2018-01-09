package co.ceiba.testdatabuilder;

import co.ceiba.domain.Person;

public class PersonTestDataBuilder {
	
	private String name;
	private String lastname;
	
	public PersonTestDataBuilder() {
		this.name = "Ceiba";
		this.lastname = "Software House";
	}
	
	public PersonTestDataBuilder withName (String name ) {
		this.name = name;
		return this;
	}
	public PersonTestDataBuilder withLastName (String lastname ) {
		this.lastname = lastname;
		return this;
	}
	public Person build() {
		return new Person (this.name,this.lastname);
	}

}
