package starting.controller;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JPanel;


import starting.model.TrianglePuzzle;
import starting.model.Model;
import starting.model.Node;
import starting.view.TrianglePuzzleApp;

public class MouseHandler extends MouseAdapter {

	TrianglePuzzleApp app;
	Model model;
	
	public MouseHandler(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	@Override
    public void mousePressed(MouseEvent me) {
			
		TrianglePuzzle puzzle = model.getPuzzle();
		
		if (model.getGameOver() == false) {
			Point p = me.getPoint();
			for (Node n : puzzle.getNodes()) {
				Rectangle r = n.getNodeLocation(n.getStartX(), n.getStartY(),15,15);
				if (r.contains(p)) {
					if (n.getState() == false) {
						n.setState(true);
						model.selectedNodes(n);
						System.out.print(n.getId());
					}
					else {
						n.setState(false);
						model.clearSelectedNode(n);
					}
			}
		}
		}
		app.repaint();
	}
}
