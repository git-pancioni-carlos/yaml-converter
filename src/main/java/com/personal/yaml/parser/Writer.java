package com.personal.yaml.parser;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import static com.personal.yaml.constants.Resources.OUT_EMPTY_FILE;

public class Writer {

	private Yaml yaml;

	public Writer(){
		yaml = new Yaml(dumperOptions());
	}

	public void write(final Map<String, Object> data) throws IOException {
		yaml.dump(data, new FileWriter(OUT_EMPTY_FILE));
	}

	private DumperOptions dumperOptions(){
		final DumperOptions d = new DumperOptions();
		d.setIndent(4);
		d.setPrettyFlow(Boolean.TRUE);
		return d;
	}
}
