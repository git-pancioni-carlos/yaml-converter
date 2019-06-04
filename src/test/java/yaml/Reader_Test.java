package yaml;

import com.personal.yaml.parser.Reader;
import com.personal.yaml.parser.reader.InfoParser;
import com.personal.yaml.parser.reader.MapParser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.FileNotFoundException;

@RunWith(BlockJUnit4ClassRunner.class)
public class Reader_Test {

	private Reader mapParser;
	private Reader infoParser;
	private String findByKey;

	@Before
	public void setup(){
		mapParser = new MapParser();
		infoParser = new InfoParser();
		findByKey = new String("valid");
	}

	@Test
	public void read() throws FileNotFoundException {
		infoParser.read();
	}

	@Test
	public void findByKey() throws FileNotFoundException {
		mapParser.findByKey(findByKey);
	}
}
