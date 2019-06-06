package com.personal.runnable;

import com.personal.exception.YamlTagKeyNotFoundException;
import com.personal.exception.YamlValidatorException;
import com.personal.yaml.converter.Convert;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static com.personal.utils.EntryPointValidator.validate;

public class CopyProperties {

	/**
	 * @param args - path for in file
	 *             - path for out file
	 *             - key 1 ... n
	 */
	public static void main(String[] args) {

		final String inPath = args[0];
		final String outPath = args[1];

		System.out.println("Arguments entered:");

		System.out.println("file path to be read: " + inPath);
		System.out.println("file path to be write: " + outPath);

		final List<String> keys = new ArrayList<>();

		for (int i = 2; i <= args.length - 1; i++) {
			System.out.println("properties to have value copied: " + args[i]);
			keys.add(args[i]);
		}

		try {
			validate(inPath, outPath, keys);
		} catch (YamlValidatorException e) {
			System.err.println("Entry point for copy properties returned an exception: " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("All files found and no nullable property. Entry point validation occurred successfully."
				+ "Proceeding with conversion and copying of the properties");

		final Convert convert = new Convert();

		try {
			convert.byValue(inPath, outPath, keys);
			System.out.println("Properties converted successfully.");
		} catch (FileNotFoundException e) {
			System.err.println("Conversion/copying of properties returned an exception: " + e.getMessage());
			e.printStackTrace();
		} catch (YamlTagKeyNotFoundException e) {
			System.err.println("Tag on yaml to be copied not found and returned an exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
