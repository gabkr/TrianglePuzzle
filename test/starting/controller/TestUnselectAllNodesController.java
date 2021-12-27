package starting.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import starting.model.TrianglePuzzle;

public class TestUnselectAllNodesController extends AppTestCase {
	
	@Test
	public void testUnselect() {
		UnselectAllNodesController usc = new UnselectAllNodesController(m, app);
		usc.process();
	}
}
