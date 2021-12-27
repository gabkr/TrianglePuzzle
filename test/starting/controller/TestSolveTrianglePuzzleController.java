package starting.controller;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.Test;

import starting.model.Edge;
import starting.model.TrianglePuzzle;

public class TestSolveTrianglePuzzleController extends AppTestCase {
	
	@Test
	public void testSolve() {
		SolveTrianglePuzzleController spc = new SolveTrianglePuzzleController(m, app);
		TrianglePuzzle p = m.getPuzzle();
		ArrayList<Edge> edgs = p.getEdges();
		edgs.get(0).setColor(Color.RED);
		edgs.get(1).setColor(Color.RED);
		edgs.get(2).setColor(Color.RED);
		edgs.get(3).setColor(Color.BLUE);
		edgs.get(4).setColor(Color.BLUE);
		edgs.get(5).setColor(Color.BLUE);
		edgs.get(6).setColor(Color.GREEN);
		edgs.get(7).setColor(Color.GREEN);
		edgs.get(8).setColor(Color.GREEN);
		edgs.get(9).setColor(Color.GREEN);
		edgs.get(10).setColor(Color.GREEN);
		edgs.get(11).setColor(Color.GREEN);
		edgs.get(12).setColor(Color.RED);
		edgs.get(13).setColor(Color.RED);
		edgs.get(14).setColor(Color.RED);
		edgs.get(15).setColor(Color.BLUE);
		edgs.get(16).setColor(Color.BLUE);
		edgs.get(17).setColor(Color.BLUE);
		spc.process();
	}
}
