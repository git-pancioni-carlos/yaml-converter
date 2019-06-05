package com.personal.yaml.service;

import com.personal.yaml.parser.Writer;

import java.io.IOException;
import java.util.Map;

public class WriterService {

	private Writer writer;

	public WriterService(){
		writer = new Writer();
	}

	public void write(final Map<String, Object> in) throws IOException {
		writer.write(in);
	}
}
