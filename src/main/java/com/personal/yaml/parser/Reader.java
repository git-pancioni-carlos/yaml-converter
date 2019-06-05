package com.personal.yaml.parser;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.representer.Representer;

import java.io.FileNotFoundException;
import java.io.InputStream;

public abstract class Reader {

	private static final String YAML_RESOURCES = "src/main/resources/in_map.yaml";
	protected Yaml yaml;

	public Reader() {

	}

	protected abstract Object load() throws FileNotFoundException;

	public abstract Object read() throws FileNotFoundException;

	public abstract void findByKey(String findByKey) throws FileNotFoundException;

	public abstract InputStream getFile() throws FileNotFoundException;

	/**
	 * Loads a representation of a java bean for snake yaml
	 *
	 * @return An snake yaml Java Bean representation
	 */
	protected Representer loadRepresenter() {
		Representer representer = new Representer();
		representer.getPropertyUtils().setSkipMissingProperties(false);
		return representer;
	}
}
