package yaml;

import com.personal.runnable.CopyProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class Main_Copy_Properties_Test {

	@Test
	public void copy_properties(){
		final String[] args = {
				"src/main/resources/in.yaml",
				"src/main/resources/out.yaml",
				"non_existing_property",
				"existing_property_diff_value",
				"existing_property_same_value"
		};

		CopyProperties.main(args);
	}
}
