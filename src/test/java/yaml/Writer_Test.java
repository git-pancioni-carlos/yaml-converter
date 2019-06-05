package yaml;

import com.personal.yaml.parser.Reader;
import com.personal.yaml.parser.Writer;
import com.personal.yaml.parser.reader.MapParser;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

public class Writer_Test {

	private Reader mapParser;
	private Writer writer;

	@Before
	public void setup(){
		mapParser = new MapParser();
		writer = new Writer();
	}

	@Test
	public void write() throws IOException {
		writer.write((Map<String, Object>) mapParser.read());
	}
}
