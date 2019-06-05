package com.personal.yaml.service;

import com.personal.yaml.parser.reader.MapParser;

import java.io.FileNotFoundException;
import java.util.Map;

public class ReaderService {

	private MapParser mapParser;

	public ReaderService(){
		mapParser = new MapParser();
	}

	public Map<String, Object> read() throws FileNotFoundException {
		return mapParser.read();
	}

}
