package starting.model;

import org.junit.Test;

import starting.view.TrianglePuzzleApp;
import starting.view.TrianglePuzzleDrawer;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class ModelTestCase extends TestModel { 

	@Test
    public void testInstanceOf() {
		TrianglePuzzle puzzle = new TrianglePuzzle();
		assertTrue(puzzle instanceof TrianglePuzzle);
    }
	
	@Test
	public void testInitialState() {
		m.checkgameOver();
		assertFalse(m.getGameOver());
		m.setScore(10);
		assertEquals(10, m.getScore());
		assertEquals(0, m.getNumMoves());
	}
	
	@Test
	public void testResetState() {
		m.resetPuzzle();
		assertEquals(0, m.numMoves);
		assertEquals(0, m.score);
		assertFalse(m.gameOver);
	}
	
	@Test
	public void testSwapEdge() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(0).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(0));
		m.puzzle.nodes.get(1).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(1));
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testSwapEdgeTriangle() {
		m.puzzle.nodes.get(0).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(0));
		m.puzzle.nodes.get(1).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(1));
		m.puzzle.nodes.get(2).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(2));
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testSwapEdgeT1() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(1).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(1));
		m.puzzle.nodes.get(2).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(2));
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	
	
	@Test
	public void testSwapEdgeT1Ne() {
		m.resetPuzzle();
		m.puzzle.checkGameResult = false;
		m.puzzle.tcheck1 = true;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(1).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(1));
		m.puzzle.nodes.get(2).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(2));
		m.puzzle.nodes.get(4).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(4));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testSwapEdgeT2NE() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = true;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.puzzle.nodes.get(4).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(4));
		m.puzzle.nodes.get(6).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(6));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testSwapEdgeT3NE() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = true;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.puzzle.nodes.get(4).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(4));
		m.puzzle.nodes.get(5).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(5));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testSwapEdgeT4NE() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = true;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.puzzle.nodes.get(4).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(4));
		m.puzzle.nodes.get(7).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(7));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testSwapEdgeT5NE() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = true;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.puzzle.nodes.get(4).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(4));
		m.puzzle.nodes.get(7).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(7));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testSwapEdgeT6NE() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = true;
		m.puzzle.nodes.get(2).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(2));
		m.puzzle.nodes.get(5).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(5));
		m.puzzle.nodes.get(9).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(9));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testApp() {
		TrianglePuzzleApp tpa = new TrianglePuzzleApp(m);
		tpa.setVisible(true);
	}
	
	@Test
	public void testSwapEdge2() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.puzzle.nodes.get(4).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(4));
		m.puzzle.nodes.get(7).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(7));
		m.swapEdge();
		m.puzzle.nodes.get(1).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(1));
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.puzzle.nodes.get(7).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(7));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testSwapEdge4() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.puzzle.nodes.get(7).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(7));
		m.puzzle.nodes.get(8).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(8));
		m.swapEdge();
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.puzzle.nodes.get(4).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(4));
		m.puzzle.nodes.get(6).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(6));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}

	@Test
	public void testSwapEdge5() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(4).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(4));
		m.puzzle.nodes.get(5).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(5));
		m.puzzle.nodes.get(9).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(9));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
		m.puzzle.nodes.get(7).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(7));
		m.puzzle.nodes.get(8).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(8));
		m.puzzle.nodes.get(5).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(5));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
	@Test
	public void testSwapEdge6() {
		m.puzzle.checkGameOver();
		m.puzzle.tcheck1 = false;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.nodes.get(1).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(1));
		m.puzzle.nodes.get(2).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(2));
		m.puzzle.nodes.get(5).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(5));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
		m.puzzle.nodes.get(3).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(3));
		m.puzzle.nodes.get(4).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(4));
		m.puzzle.nodes.get(2).setState(true);
		m.selectedNodes(m.puzzle.nodes.get(2));
		m.swapEdge();
		m.clearStatusNodes();
		m.setNumMoves(1);
		m.computeScore(1);
	}
	
		@Test
		public void testSwapEdge7() {
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
		m.puzzle.checkGameOver();
		m.computeScore(1);		
	}
		
		@Test
		public void testSwapEdge8() {
		TrianglePuzzle p = m.getPuzzle();
		ArrayList<Edge> edgs = p.getEdges();
		edgs.get(0).setColor(Color.RED);
		edgs.get(1).setColor(Color.RED);
		edgs.get(2).setColor(Color.GREEN);
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
		m.puzzle.tcheck1 = true;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.checkGameOver();
		m.computeScore(1);
		}
		
		@Test
		public void testSwapEdge9() {
		TrianglePuzzle p = m.getPuzzle();
		ArrayList<Edge> edgs = p.getEdges();
		edgs.get(0).setColor(Color.GREEN);
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
		m.puzzle.tcheck1 = true;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.checkGameOver();
		m.computeScore(1);
		}
		
		@Test
		public void testSwapEdge10() {
		TrianglePuzzle p = m.getPuzzle();
		ArrayList<Edge> edgs = p.getEdges();
		edgs.get(0).setColor(Color.RED);
		edgs.get(1).setColor(Color.GREEN);
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
		m.puzzle.tcheck1 = true;
		m.puzzle.tcheck2 = false;
		m.puzzle.tcheck3 = false;
		m.puzzle.tcheck4 = false;
		m.puzzle.tcheck5 = false;
		m.puzzle.tcheck6 = false;
		m.puzzle.checkGameOver();
		m.computeScore(1);
		}
}