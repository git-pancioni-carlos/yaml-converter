package com.personal.yaml.parser.reader;

import com.personal.yaml.dto.Info;
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
	public void read() throws FileNotFoundException {
		System.out.println("Object: " + load().toString());
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
