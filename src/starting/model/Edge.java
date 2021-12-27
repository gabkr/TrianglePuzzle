package starting.model;
import java.awt.Color;

public class Edge {
	int id1[] = new int[1];
	int id2[] = new int[1];
	int pos1[] = new int[2];
	int pos2[] = new int[2];
	Color color;
    
	public Edge(int id1, int id2, int posx1, int posy1, int posx2, int posy2, Color color) {
		this.id1[0] = id1;
		this.id2[0] = id2;
		this.pos1[0] = posx1;
		this.pos1[1] = posy1;
		this.pos2[0] = posx2;
		this.pos2[1] = posy2;
		this.color = color;
	}
	
	public void setEdgeNodes(int posx1, int posy1, int posx2, int posy2) { 
		this.pos1[0] = posx1; 
		this.pos1[1] = posy1; 
		this.pos2[0] = posx2;
		this.pos2[1] = posy2;
		}
	
	public int getEdgeposx1() { return pos1[0]; }
	public int getEdgeposy1() { return pos1[1]; }
	
	public int getEdgeposx2() { return pos2[0]; }
	public int getEdgeposy2() { return pos2[1]; }
	
	public Color getEdgecolor() { return color; }
	
	public void setColor(Color color) { this.color = color; }
	public Color getState() { return color; }
	
	public Edge copy() {
		Edge e = new Edge(id1[0], id2[0], pos1[0], pos1[1], pos2[0], pos2[1], color);
		e.setEdgeNodes(pos1[0], pos1[1], pos2[0], pos2[1]);

		e.setColor(color);
		return e;
	}

}