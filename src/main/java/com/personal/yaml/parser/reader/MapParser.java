package com.personal.yaml.parser.reader;

import com.personal.yaml.parser.Reader;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import static com.personal.yaml.constants.Resources.IN_MAP_YAML;

public class MapParser extends Reader {

	public MapParser(){
		yaml = new Yaml();
	}

	@Override
	public void findByKey(final String key) throws FileNotFoundException {
		final Boolean valid = (Boolean) load().get(key);
		System.out.println(valid);

	}

	@Override
	public InputStream getFile() throws FileNotFoundException {
		return new FileInputStream(new File(IN_MAP_YAML));
	}

	@Override
	protected Map<String, Object> load() throws FileNotFoundException {
		return yaml.load(getFile());
	}

	@Override
	public void read() throws FileNotFoundException {
		return;
	}
}
