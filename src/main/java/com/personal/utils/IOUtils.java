package com.personal.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IOUtils {

	public InputStream getFile(final String path) throws FileNotFoundException {
		return new FileInputStream(path);
	}
}
