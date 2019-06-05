package com.personal.yaml.parser.reader.customobjects;

import com.personal.yaml.dto.Info;
import com.personal.yaml.parser.reader.ObjectsParser;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static com.personal.yaml.constants.Resources.IN_OBJECT_INFO_YAML;

public class InfoParser extends ObjectsParser {

	public InfoParser(){
		yaml = new Yaml(new Constructor(Info.class));
	}

	@Override
	protected Info load() throws FileNotFoundException {
		return yaml.loadAs(getFile(), Info.class);
	}

	@Override
	public Info read() throws FileNotFoundException {
		System.out.println("Object: " + load().toString());
		return load();
	}

	@Override
	public void findByKey(String findByKey) {
		return;
	}

	@Override
	public InputStream getFile() throws FileNotFoundException {
		return new FileInputStream(new File(IN_OBJECT_INFO_YAML));
	}
}
