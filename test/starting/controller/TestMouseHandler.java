package starting.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import generic.MouseEventTestCase;
import starting.model.Node;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleDrawer;

public class TestMouseHandler extends AppTestCase {

	@Test
	public void testMouseHandler() {
		TrianglePuzzleDrawer panel = app.getPanel();
		MouseEventTestCase me = new MouseEventTestCase();
		MouseHandler mh = new MouseHandler(m, app);
		mh.mousePressed(me.createPressed(panel, 105, 18));
		
	}
	
	@Test
	public void testMouseHandler2() {
		TrianglePuzzleDrawer panel = app.getPanel();
		MouseEventTestCase me = new MouseEventTestCase();
		TrianglePuzzle ple = m.getPuzzle();
		ArrayList<Node> nds = ple.getNodes();
		
		nds.get(0).setState(true);
		
		MouseHandler mh = new MouseHandler(m, app);
		mh.mousePressed(me.createPressed(panel, 105, 18));
		
	}
}
