package starting;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;
import starting.model.TrianglePuzzle;
import starting.model.Node;

import java.awt.Color;

import starting.model.Edge;


public class Main {
	public static void main(String[] args) {
		
		Model m = new Model();
		
		TrianglePuzzleApp tpa = new TrianglePuzzleApp(m);
		tpa.setVisible(true);
	}
}
