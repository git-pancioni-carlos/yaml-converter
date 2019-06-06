package com.personal.utils;

import com.personal.exception.YamlValidatorException;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class EntryPointValidator {

	public static void validate(final String in, final String out, final String inFileName, final String outFileName)
			throws YamlValidatorException {
		if(Objects.isNull(in)){
			throw new YamlValidatorException("File path to be read [args[0]] is null.");
		}

		if(Objects.isNull(out)){
			throw new YamlValidatorException("File path to be write [args[1]] is null.");
		}

		if(Objects.isNull(inFileName)){
			throw new YamlValidatorException("File name to be read [args[2]] is null.");
		}

		if(Objects.isNull(outFileName)){
			throw new YamlValidatorException("File name to be write [args[3]] is null.");
		}
	}

	public static void validate(final String in, final String out, final List<String> keys)
			throws YamlValidatorException {
		if(Objects.isNull(in)){
			throw new YamlValidatorException("File path to be read [args[0]] is null.");
		}

		if(Objects.isNull(out)){
			throw new YamlValidatorException("File path to be write [args[1]] is null.");
		}

		for (String s: keys) {
			if(Objects.isNull(s)){
				throw new YamlValidatorException("Some of key args passed is null.");
			}
		}
	}
}
