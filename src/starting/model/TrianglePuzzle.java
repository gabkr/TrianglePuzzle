package starting.model;

import java.awt.Color;
import java.util.ArrayList;

public class TrianglePuzzle{
	
	ArrayList<Node> nodes = new ArrayList<>();
	
	ArrayList<Node> originalNodes = new ArrayList<>();
	
	ArrayList<Node> selectedNodes = new ArrayList<>();
	
	ArrayList<Edge> edges = new ArrayList<>();
	
	ArrayList<Edge> originalEdges = new ArrayList<>();
		
	ArrayList<Color> edgeColorsState = new ArrayList<>();
	ArrayList<Color> initialColorsState = new ArrayList<>();
	
	ArrayList<Color> t1 = new ArrayList<>();
	ArrayList<Color> t2 = new ArrayList<>();
	ArrayList<Color> t3 = new ArrayList<>();
	ArrayList<Color> t4 = new ArrayList<>();
	ArrayList<Color> t5 = new ArrayList<>();
	ArrayList<Color> t6 = new ArrayList<>();
	
	boolean tcheck1 = false;
	boolean tcheck2 = false;
	boolean tcheck3 = false;
	boolean tcheck4 = false;
	boolean tcheck5 = false;
	boolean tcheck6 = false;
	
	ArrayList<Edge> selectedEdges = new ArrayList<>();
	
	int score = 0;
	Edge returnEdge;
	Color temp;
	boolean checkGameResult = false;
	
	ArrayList<Color> winningCombination = new ArrayList<>();
	
	public void addNode(Node n) {
		n.setStartX(n.startX);
		n.setStartY(n.startY);
				
		nodes.add(n);
		originalNodes.add(n.copy());
	}

	public void addEdge(Edge e) {
		e.setEdgeNodes(e.pos1[0], e.pos1[1], e.pos2[0], e.pos2[1]);
		e.setColor(e.color);
				
		edges.add(e);
		originalEdges.add(e.copy());
	}
	
	public ArrayList<Node> getNodes() {return nodes;}
	
	public ArrayList<Edge> getEdges() {return edges;}
	
	public void reset() {
		
		for (Node n : nodes) {
			n.setState(false);
		}
		initialColorsState.add(Color.RED);
		initialColorsState.add(Color.RED);
		initialColorsState.add(Color.GREEN);
		initialColorsState.add(Color.RED);
		initialColorsState.add(Color.BLUE);
		initialColorsState.add(Color.GREEN);
		initialColorsState.add(Color.BLUE);
		initialColorsState.add(Color.RED);
		initialColorsState.add(Color.GREEN);
		initialColorsState.add(Color.RED);
		initialColorsState.add(Color.BLUE);
		initialColorsState.add(Color.GREEN);
		initialColorsState.add(Color.BLUE);
		initialColorsState.add(Color.BLUE);
		initialColorsState.add(Color.GREEN);
		initialColorsState.add(Color.BLUE);
		initialColorsState.add(Color.RED);
		initialColorsState.add(Color.GREEN);
		
		edges.clear();
		for (Edge e: originalEdges) {
			edges.add(e);}
		for (int i=0; i<edges.size(); i++) {
			edges.get(i).setColor(initialColorsState.get(i));
		}
		tcheck1 = false;
		tcheck2 = false;
		tcheck3 = false;
		tcheck4 = false;
		tcheck5 = false;
		tcheck6 = false;
		checkGameResult = false;
		}
	
	public void clearSelectedNodes() {
		for (Node n : nodes) {
			n.setState(false);}
		selectedNodes.clear();
	}
	
	public ArrayList<Node> setselectedStateNodes(Node n){
		selectedNodes.add(n);
		return selectedNodes;
		}
	
	public ArrayList<Node> clearLastSelectedNode(Node n){
			selectedNodes.remove(n);
		return selectedNodes;
		}

	public void setSwapEdgeColors() {
		for(int i = 0; i < selectedNodes.size()-1; i++){
			for (int j=i+1; j< selectedNodes.size();j++) {
			Edge e = getEdge(selectedNodes.get(i), selectedNodes.get(j));
			if (e != null) {
			selectedEdges.add(e);}}
		}
		System.out.print(selectedEdges);
		temp = selectedEdges.get(0).color;
		if (selectedEdges.size() == 2) {
			selectedEdges.get(0).color = selectedEdges.get(1).color;
			selectedEdges.get(1).color = temp;}
		else {
			selectedEdges.get(0).color = selectedEdges.get(1).color;
			selectedEdges.get(1).color = selectedEdges.get(2).color;
			selectedEdges.get(2).color = temp;
		}
		selectedEdges.clear();
}
	
	public Edge getEdge(Node n1, Node n2) {
		for (Edge e : edges) {
			if ((e.id1[0] == n1.id && e.id2[0] == n2.id) || (e.id2[0] == n1.id && e.id1[0] == n2.id)) {
				returnEdge = e;
				break;}
			else{
				returnEdge= null;
			}
		}
	return returnEdge;
	}
	
	public int computeScore() {
		edgeColorsState.clear();
		for (Edge e : edges) {
			edgeColorsState.add(e.getEdgecolor());
			}
		score = 0;
		if (checkGameResult == false) {
		
			if (tcheck1 == false) {
				
				if (edgeColorsState.get(0) == edgeColorsState.get(1) && edgeColorsState.get(1) == edgeColorsState.get(2)) {
					score = score+10;
					tcheck1 = true;}
			}
			else if(tcheck1 == true) {
				if (edgeColorsState.get(0) != edgeColorsState.get(1) || edgeColorsState.get(1) != edgeColorsState.get(2)) {
					score = score-10;
					tcheck1 = false;}
			}
			
			if (tcheck2 == false) {
				if (edgeColorsState.get(3) == edgeColorsState.get(4) && edgeColorsState.get(4) == edgeColorsState.get(5)) {
					score = score+10;
					tcheck2 = true;}}
			else if(tcheck2 == true) {
				if (edgeColorsState.get(3) != edgeColorsState.get(4) || edgeColorsState.get(4) != edgeColorsState.get(5)) {
					score = score-10;
					tcheck2 = false;}
				}
			
			if (tcheck3 == false) {
				if (edgeColorsState.get(6) == edgeColorsState.get(7) && edgeColorsState.get(7) == edgeColorsState.get(8)) {
					score = score+10;
					tcheck3 = true;}}
			else if(tcheck3 == true) {
				if (edgeColorsState.get(6) != edgeColorsState.get(7) || edgeColorsState.get(7) != edgeColorsState.get(8)) {
					score = score-10;
					tcheck3 = false;}
			}
			
			if (tcheck4 == false) {
				if (edgeColorsState.get(9) == edgeColorsState.get(10) && edgeColorsState.get(10) == edgeColorsState.get(11)) {
					score = score+10;
					tcheck4 = true;}}
			else if(tcheck4 == true) {
				if (edgeColorsState.get(9) != edgeColorsState.get(10) || edgeColorsState.get(10) != edgeColorsState.get(11)) {
					score = score-10;
					tcheck4 = false;}	
				}
			
			if (tcheck5 == false) {
				if (edgeColorsState.get(12) == edgeColorsState.get(13) && edgeColorsState.get(13) == edgeColorsState.get(14)) {
					score = score+10;
					tcheck5 = true;}}
			else if(tcheck5 == true){
				if (edgeColorsState.get(12) != edgeColorsState.get(13) || edgeColorsState.get(13) != edgeColorsState.get(14)) {
					score = score-10;
					tcheck5 = false;}
			}
			
			if (tcheck6 == false) {
				if (edgeColorsState.get(15) == edgeColorsState.get(16) && edgeColorsState.get(16) == edgeColorsState.get(17)) {
					score = score+10;
					tcheck6 = true;}}
			else if(tcheck6 == true) {
				if (edgeColorsState.get(15) != edgeColorsState.get(16) || edgeColorsState.get(16) != edgeColorsState.get(17)) {
					score = score-10;
					tcheck6 = false;}
				}
			}
		
		return score;
	}
	
	public boolean checkGameOver() {
		
		winningCombination.add(Color.RED);
		winningCombination.add(Color.RED);
		winningCombination.add(Color.RED);
		winningCombination.add(Color.BLUE);
		winningCombination.add(Color.BLUE);
		winningCombination.add(Color.BLUE);
		winningCombination.add(Color.GREEN);
		winningCombination.add(Color.GREEN);
		winningCombination.add(Color.GREEN);
		winningCombination.add(Color.GREEN);
		winningCombination.add(Color.GREEN);
		winningCombination.add(Color.GREEN);
		winningCombination.add(Color.RED);
		winningCombination.add(Color.RED);
		winningCombination.add(Color.RED);
		winningCombination.add(Color.BLUE);
		winningCombination.add(Color.BLUE);
		winningCombination.add(Color.BLUE);
	
		for (Edge e : edges) {
			edgeColorsState.add(e.getEdgecolor());
			}
		
		for (int i=0; i<edgeColorsState.size(); i++) {
			if (edgeColorsState.get(i) != winningCombination.get(i)) {
				checkGameResult = false;
				break;}
			checkGameResult = true;	
		}
		
		return checkGameResult;
	}
}