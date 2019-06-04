package com.personal.yaml.dto;

import java.util.Objects;

/**
 * Example DTO to be transformed reading an YAML_RESOURCES file.
 *
 * Mandatory to have getters and setters, also an empty constructor
 *
 * @author Carlos Pancioni
 */
public class Data {



	/**
	 * Explicity constructor without args, requirement of snake YAML_RESOURCES tech
	 */
	public Data(){

	}

	private String name;
	private String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Data data = (Data) o;
		return Objects.equals(name, data.name) &&
				Objects.equals(surname, data.surname);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name, surname);
	}

	@Override
	public String toString() {
		return "Data{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}
