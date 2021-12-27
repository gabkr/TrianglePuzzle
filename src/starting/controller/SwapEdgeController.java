package starting.controller;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class SwapEdgeController {

	TrianglePuzzleApp app;
	Model model;
	
	public SwapEdgeController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		System.out.println("You clicked Swap Edges!");
		model.swapEdge();
		model.clearStatusNodes();
		
		model.setNumMoves(1);
		model.computeScore(1);
		
		app.getScoresLabel().setText("" + model.getScore());
		app.getMovesLabel().setText("" + model.getNumMoves());
		
		app.repaint();
	}
}