package starting.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import starting.model.Node;
import junit.framework.TestCase;


public class TestNode extends TestCase {
 
	@Test
	public void testNodeConstruction() {
		Node node = new Node(1, false, 100, 200);
		assertEquals (1, node.getId());
		assertEquals (100, node.getStartX());
		assertEquals (200, node.getStartY());
		assertFalse (node.getState());
	}
	
	@Test
	public void testNodeState() {
		Node node = new Node(1, false, 100, 200);
		node.setState(true);
		assertTrue (node.getState());
		node.setNodeId(2);
		assertEquals (2, node.getId());
		node.setStartX(300);
		node.setStartY(400);
		assertEquals(300, node.getStartX());
		assertEquals(400, node.getStartY());
	}
}
