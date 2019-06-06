package com.personal.yaml.parser;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Writer {

	private Yaml yaml;

	public Writer(){
		yaml = new Yaml(dumperOptions());
	}

	public void write(final Map<String, Object> data, final String path) throws IOException {
		yaml.dump(data, new FileWriter(path));
	}

	private DumperOptions dumperOptions(){
		final DumperOptions d = new DumperOptions();
		d.setIndent(4);
		d.setPrettyFlow(Boolean.TRUE);
		return d;
	}
}
