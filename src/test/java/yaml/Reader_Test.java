package yaml;

import com.personal.yaml.dto.Info;
import com.personal.yaml.parser.Reader;
import com.personal.yaml.parser.reader.MapParser;
import com.personal.yaml.parser.reader.customobjects.InfoParser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

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
		final Info info = (Info) infoParser.read();

		assertNotNull("Test #Info object cannot be null", info);
		assertNotNull("Test #Info.Data object cannot be null", info.getData());
		assertEquals(info.getValid(), Boolean.TRUE);
		assertEquals(info.getData().getName(), "Name-example");
	}

	@Test
	public void findByKey() throws FileNotFoundException {
		mapParser.findByKey(findByKey);
	}
}
