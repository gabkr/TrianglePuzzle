package starting.controller;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class UnselectAllNodesController {

	TrianglePuzzleApp app;
	Model model;
	
	public UnselectAllNodesController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		System.out.println("You clicked UnselectAllNodes!");
		model.clearStatusNodes();
		
		app.repaint();
	}
}
