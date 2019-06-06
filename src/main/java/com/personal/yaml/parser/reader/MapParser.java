package com.personal.yaml.parser.reader;

import com.personal.exception.YamlTagKeyNotFoundException;
import com.personal.yaml.parser.Reader;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

public class MapParser extends Reader {

	public MapParser(){
		yaml = new Yaml();
	}

	@Override
	public Object findByKey(final String key, final String path)
			throws FileNotFoundException, YamlTagKeyNotFoundException {
		final Object value = load(path).get(key);

		if(Objects.isNull(value)){
			throw new YamlTagKeyNotFoundException("Value for key [" + key + "] not found.");
		}
		return value;
	}

	@Override
	public InputStream getFile(final String path) throws FileNotFoundException {
		return new FileInputStream(new File(path));
	}

	@Override
	protected Map<String, Object> load(final String path) throws FileNotFoundException {
		return yaml.load(getFile(path));
	}

	@Override
	public Map<String, Object> read(final String path) throws FileNotFoundException {
		return load(path);
	}
}
