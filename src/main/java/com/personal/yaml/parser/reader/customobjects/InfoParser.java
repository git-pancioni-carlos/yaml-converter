package com.personal.yaml.parser.reader.customobjects;

import com.personal.yaml.dto.Info;
import com.personal.yaml.parser.reader.ObjectsParser;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InfoParser extends ObjectsParser {

	public InfoParser(){
		yaml = new Yaml(new Constructor(Info.class));
	}

	@Override
	protected Info load(final String path) throws FileNotFoundException {
		return yaml.loadAs(getFile(path), Info.class);
	}

	@Override
	public Info read(final String path) throws FileNotFoundException {
		System.out.println("Object: " + load(path).toString());
		return load(path);
	}

	@Override
	public Object findByKey(String findByKey, final String path) {
		System.out.println("Nothing to see here, pal :)");
		return null;
	}

	@Override
	public InputStream getFile(final String path) throws FileNotFoundException {
		return new FileInputStream(new File(path));
	}
}
