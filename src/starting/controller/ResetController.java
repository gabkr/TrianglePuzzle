package starting.controller;

import java.awt.Point;
import java.awt.Rectangle;

import starting.model.Model;
import starting.model.Node;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;

public class ResetController {

	TrianglePuzzleApp app;
	Model model;
	
	public ResetController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		System.out.println("You clicked Reset!");
		model.resetPuzzle();
		model.clearStatusNodes();
		model.resetTempScore();
		System.out.print(model.getScore());
		
		app.getScoresLabel().setText("" + model.getScore());
		app.getMovesLabel().setText("" + model.getNumMoves());
		app.getSolvePuzzleLabel().setText("");
		
		app.repaint();
	}
	}
