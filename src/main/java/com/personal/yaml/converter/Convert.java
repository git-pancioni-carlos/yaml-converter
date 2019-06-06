package com.personal.yaml.converter;

import com.personal.exception.YamlTagKeyNotFoundException;
import com.personal.yaml.service.ReaderService;
import com.personal.yaml.service.WriterService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Convert {

	private ReaderService readerService;
	private WriterService writerService;

	public Convert() {
		readerService = new ReaderService();
		writerService = new WriterService();
	}

	public void file(final String in, final String out) throws IOException {
		writerService.write(readerService.read(in), out);
	}

	public void byValue(final String in, final String out, final List<String> keys)
			throws FileNotFoundException, YamlTagKeyNotFoundException {
		final Map<String, Object> outMap = readerService.read(out);

		for (String key : keys) {
			final Object value = readerService.getValue(key, in);
			final Object outTag = outMap.get(key);

			if (Objects.isNull(outTag)) {
				outMap.put(key, value);
				return;
			}

			if (outTag.equals(value)) {
				System.out.println("Same value for key [" + key + "] found. Skipping request.");
				return;
			}

			outMap.remove(key, value);
			outMap.put(key, value);
		}
	}
}
