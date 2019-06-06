package com.personal.runnable;

import com.personal.exception.YamlValidatorException;
import com.personal.yaml.converter.Convert;

import java.io.IOException;

import static com.personal.utils.EntryPointValidator.validate;

public class CopyFile {

	/**
	 *
	 * @param args
	 * - path for in file
	 * - path for out file
	 * - in file name
	 * - out file name
	 */
	public static void main(String[] args){
		final String inPath = args[0];
		final String outPath = args[1];
		final String inFileName = args[2];
		final String outFileName = args[3];

		System.out.println("Arguments entered:");

		System.out.println("file path to be read: " + inPath);
		System.out.println("file path to be write: " + outPath);
		System.out.println("file name being read: " + inFileName);
		System.out.println("file name being wrote: " + outFileName);

		try {
			validate(inPath, outPath, inFileName, outFileName);
		} catch (YamlValidatorException e) {
			System.err.println("Entry point for copy file returned an exception: " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("All files found and entry point validation occurred successfully."
				+ "Proceeding with conversion and copying of the file");

		final Convert convert = new Convert();

		try {
			convert.file(inPath, outPath);
			System.out.println("File converted successfully.");
		} catch (IOException e) {
			System.err.println("Conversion/copying of file returned an exception: " + e.getMessage());
			e.printStackTrace();
		}


		System.out.println("Copy of files finished without problems. Closing program");
	}
}
