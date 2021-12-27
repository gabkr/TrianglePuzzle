package starting.model;

import java.awt.Color;

import org.junit.Test;
import junit.framework.TestCase;

public class TestEdge extends TestCase{
	
	@Test
	public void testEdgeConstruction() {
		Edge edge = new Edge(1, 2, 100, 200, 150, 250, Color.GREEN);
		assertEquals (100, edge.getEdgeposx1());
		assertEquals (200, edge.getEdgeposy1());
		assertEquals (150, edge.getEdgeposx2());
		assertEquals (250, edge.getEdgeposy2());
		assertEquals (Color.GREEN, edge.getEdgecolor());
	}
	
	@Test
	public void testEdgeSetup() {
		Edge edge = new Edge(1, 2, 100, 200, 150, 250, Color.GREEN);
		edge.setEdgeNodes(300, 350, 400, 450);
		assertEquals (300, edge.getEdgeposx1());
		assertEquals (350, edge.getEdgeposy1());
		assertEquals (400, edge.getEdgeposx2());
		assertEquals (450, edge.getEdgeposy2());
	}

	@Test
	public void testColor() {
		Edge edge = new Edge(1, 2, 100, 200, 150, 250, Color.GREEN);
		edge.setColor(Color.RED);
		assertEquals (Color.RED, edge.getState());
	}
}
