package starting.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import starting.model.Node;
import starting.model.TrianglePuzzle;

public class TestSwapEdgeController extends AppTestCase {
	
	@Test
	public void testSwap() {		
		SwapEdgeController sec = new SwapEdgeController(m, app);
		
		TrianglePuzzle ple = m.getPuzzle();
		ArrayList<Node> nds = ple.getNodes();
		
		nds.get(0).setState(true);
		nds.get(1).setState(true);
		nds.get(3).setState(true);
		
		m.selectedNodes(nds.get(0));
		m.selectedNodes(nds.get(1));
		m.selectedNodes(nds.get(3));
		
		sec.process();
	}
}