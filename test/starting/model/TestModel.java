package starting.model;

import java.awt.Color;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import starting.view.TrianglePuzzleApp;


public class TestModel extends TestCase {
	
	protected Model m;
	protected TrianglePuzzleApp app;
	
	@Before
	public void setUp() {
	
	m = new Model();
		
	TrianglePuzzle puzzle = new TrianglePuzzle();
	
	Node node0 = new Node(0, false, 100, 10);
	Node node1 = new Node(1, false, 75, 50);
	Node node2 = new Node(2, false, 125, 50);
	Node node3 = new Node(3, false, 50, 90);
	Node node4 = new Node(4, false, 100, 90);
	Node node5 = new Node(5, false, 150, 90);
	Node node6 = new Node(6, false, 25, 130);
	Node node7 = new Node(7, false, 75, 130);
	Node node8 = new Node(8, false, 125, 130);
	Node node9 = new Node(9, false, 175, 130);
	
	puzzle.addNode(node0);
	puzzle.addNode(node1);
	puzzle.addNode(node2);
	puzzle.addNode(node3);
	puzzle.addNode(node4);
	puzzle.addNode(node5);
	puzzle.addNode(node6);
	puzzle.addNode(node7);
	puzzle.addNode(node8);
	puzzle.addNode(node9);
	puzzle.nodes.get(0).setState(false);
	puzzle.nodes.get(1).setState(false);
	puzzle.nodes.get(2).setState(false);
	puzzle.nodes.get(3).setState(false);
	puzzle.nodes.get(4).setState(false);
	puzzle.nodes.get(5).setState(false);
	puzzle.nodes.get(6).setState(false);
	puzzle.nodes.get(7).setState(false);
	puzzle.nodes.get(8).setState(false);
	puzzle.nodes.get(9).setState(false);
	
	Edge edge01 = new Edge(node0.getId(), node1.getId(), node0.getStartX(), node0.getStartY(), node1.getStartX(), node1.getStartY(), Color.RED);
	Edge edge02 = new Edge(node0.getId(), node2.getId(), node0.getStartX(), node0.getStartY(), node2.getStartX(), node2.getStartY(), Color.RED);
	Edge edge12 = new Edge(node1.getId(), node2.getId(), node1.getStartX(), node1.getStartY()+10, node2.getStartX(), node2.getStartY()+10, Color.GREEN);
	Edge edge13 = new Edge(node1.getId(), node3.getId(), node1.getStartX(), node1.getStartY(), node3.getStartX(), node3.getStartY(), Color.RED);
	Edge edge14 = new Edge(node1.getId(), node4.getId(), node1.getStartX(), node1.getStartY(), node4.getStartX(), node4.getStartY(), Color.BLUE);
	Edge edge34 = new Edge(node3.getId(), node4.getId(), node3.getStartX(), node3.getStartY()+10, node4.getStartX(), node4.getStartY()+10, Color.GREEN);
	Edge edge24 = new Edge(node2.getId(), node4.getId(), node2.getStartX(), node2.getStartY(), node4.getStartX(), node4.getStartY(), Color.BLUE);
	Edge edge25 = new Edge(node2.getId(), node5.getId(), node2.getStartX(), node2.getStartY(), node5.getStartX(), node5.getStartY(), Color.RED);
	Edge edge45 = new Edge(node4.getId(), node5.getId(), node4.getStartX(), node4.getStartY()+10, node5.getStartX(), node5.getStartY()+10, Color.GREEN);
	Edge edge36 = new Edge(node3.getId(), node6.getId(), node3.getStartX(), node3.getStartY(), node6.getStartX(), node6.getStartY(), Color.RED);
	Edge edge37 = new Edge(node3.getId(), node7.getId(), node3.getStartX(), node3.getStartY(), node7.getStartX(), node7.getStartY(), Color.BLUE);
	Edge edge67 = new Edge(node6.getId(), node7.getId(), node6.getStartX(), node6.getStartY()+10, node7.getStartX(), node7.getStartY()+10, Color.GREEN);
	Edge edge47 = new Edge(node4.getId(), node7.getId(), node4.getStartX(), node4.getStartY(), node7.getStartX(), node7.getStartY(), Color.BLUE);
	Edge edge48 = new Edge(node4.getId(), node8.getId(), node4.getStartX(), node4.getStartY(), node8.getStartX(), node8.getStartY(), Color.BLUE);
	Edge edge78 = new Edge(node7.getId(), node8.getId(), node7.getStartX(), node7.getStartY()+10, node8.getStartX(), node8.getStartY()+10, Color.GREEN);
	Edge edge58 = new Edge(node5.getId(), node8.getId(), node5.getStartX(), node5.getStartY(), node8.getStartX(), node8.getStartY(), Color.BLUE);
	Edge edge59 = new Edge(node5.getId(), node9.getId(), node5.getStartX(), node5.getStartY(), node9.getStartX(), node9.getStartY(), Color.RED);
	Edge edge89 = new Edge(node8.getId(), node9.getId(), node8.getStartX(), node8.getStartY()+10, node9.getStartX(), node9.getStartY()+10, Color.GREEN);
	
	puzzle.addEdge(edge01);
	puzzle.addEdge(edge02);
	puzzle.addEdge(edge12);
	puzzle.addEdge(edge13);
	puzzle.addEdge(edge14);
	puzzle.addEdge(edge34);
	puzzle.addEdge(edge24);
	puzzle.addEdge(edge25);
	puzzle.addEdge(edge45);
	puzzle.addEdge(edge36);
	puzzle.addEdge(edge37);
	puzzle.addEdge(edge67);
	puzzle.addEdge(edge47);
	puzzle.addEdge(edge48);
	puzzle.addEdge(edge78);
	puzzle.addEdge(edge58);
	puzzle.addEdge(edge59);
	puzzle.addEdge(edge89);
	
	m.setPuzzle(puzzle); 
	app = new TrianglePuzzleApp(m);
	app.setVisible(true);
	}
	
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(500);
		app.setVisible(false);
	}
	}