package starting.model;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Node {
	int id;
	boolean state = false;
	final int height = 15;
	final int width = 15;
	int startX;
	int startY;
	
	public Node(int id, boolean state, int startX, int startY) {
		this.id = id;
		this.state = state;
		this.startX = startX;
		this.startY = startY;
	}
	
	public void setNodeId(int id) { this.id = id; }
	
	public int getId() { return id; }
	
	public void setState(boolean state) { this.state = state; }
	
	public boolean getState() { return state; }
	
	public void setStartX(int x) { startX = x; }
	
	public int getStartX() { return startX; }
	
	public void setStartY(int y) { startY = y; }
	
	public int getStartY() { return startY; }

	public Node copy() {
		Node n = new Node(id, state, startX, startY);
		n.setStartX(startX);
		n.setStartY(startY);
		n.setState(state);
		return n;
	}
	public Rectangle getNodeLocation(int startX, int startY, int width, int height) {
		Rectangle rect = new Rectangle(startX, startY, width, height);
		return rect;
	}
}

