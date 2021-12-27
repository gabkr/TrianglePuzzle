package starting.controller;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class SolveTrianglePuzzleController {

	TrianglePuzzleApp app;
	Model model;
	
	public SolveTrianglePuzzleController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		
		model.checkgameOver();
		System.out.print(model.getGameOver());
		if (model.getGameOver()) {
			app.getSolvePuzzleLabel().setText("" + model.getDisplay());
			System.out.print("Congratulations!!, You have solved the puzzle");
		}
		
		app.repaint();
	}
}
