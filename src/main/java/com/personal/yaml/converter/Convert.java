package com.personal.yaml.converter;

import com.personal.yaml.service.ReaderService;
import com.personal.yaml.service.WriterService;

import java.io.IOException;

public class Convert {

	private ReaderService readerService;
	private WriterService writerService;

	public Convert(){
		readerService = new ReaderService();
		writerService = new WriterService();
	}

	public void file() throws IOException {
		writerService.write(readerService.read());
	}

	public void file(final Object in, final Object out) throws IOException {
		//TODO
	}

	public void byValue(final String key, final String originalValue){

	}
}
