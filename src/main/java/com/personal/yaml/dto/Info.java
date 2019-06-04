package com.personal.yaml.dto;

import java.util.Objects;

/**
 * Example DTO to be transformed reading an YAML_RESOURCES file.
 *
 * Mandatory to have getters and setters, also an empty constructor
 *
 * @author Carlos Pancioni
 */
public class Info {

	private Data data;
	public String date;
	private Boolean valid;

	/**
	 * Explicity constructor without args, requirement of snake YAML_RESOURCES tech
	 */
	public Info(){

	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Info info = (Info) o;
		return Objects.equals(data, info.data) &&
				Objects.equals(date, info.date) &&
				Objects.equals(valid, info.valid);
	}

	@Override
	public int hashCode() {

		return Objects.hash(data, date, valid);
	}

	@Override
	public String toString() {
		return "Info{" +
				"data=" + data +
				", date=" + date +
				", valid=" + valid +
				'}';
	}
}
