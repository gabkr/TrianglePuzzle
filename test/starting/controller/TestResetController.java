package starting.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import starting.model.Node;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;

public class TestResetController extends AppTestCase {
	
	@Test
	public void testReset() {
		
		TrianglePuzzle p = m.getPuzzle();
		
		ArrayList<Node> nds = p.getNodes();
		
		m.setScore(0);
		nds.get(0).setState(true);
		nds.get(1).setState(true);
		nds.get(3).setState(true);
		m.selectedNodes(nds.get(0));
		m.selectedNodes(nds.get(1));
		m.selectedNodes(nds.get(3));
		
		m.swapEdge();
		
		ResetController rc = new ResetController(m, app);
		
		rc.process();
		
		app.repaint();
}
}
