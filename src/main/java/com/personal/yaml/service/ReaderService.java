package com.personal.yaml.service;

import com.personal.exception.YamlTagKeyNotFoundException;
import com.personal.yaml.parser.reader.MapParser;

import java.io.FileNotFoundException;
import java.util.Map;

public class ReaderService {

	private MapParser mapParser;

	public ReaderService(){
		mapParser = new MapParser();
	}

	public Map<String, Object> read(final String path) throws FileNotFoundException {
		return mapParser.read(path);
	}

	public Object getValue(final String key, final String path)
			throws FileNotFoundException, YamlTagKeyNotFoundException {
		return mapParser.findByKey(key, path);
	}

}
