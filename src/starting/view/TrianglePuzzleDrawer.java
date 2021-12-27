package starting.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

import starting.model.Node;
import starting.model.Edge;
import starting.model.Model;
import starting.model.TrianglePuzzle;

public class TrianglePuzzleDrawer extends JPanel {

	Model model;
	
	/**
	 * Create the panel.
	 */
	public TrianglePuzzleDrawer(Model model) {
		this.model = model;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// protects you when looking inside WindowBuilder
		if (model == null) { return; }
		
		// do the math and figure out WHERE to draw all the boxes (nodes) lines (edges)
		
		// DRAW ENTIRE PUZZLE HERE...
		//g.drawString("test", 100, 100);
		//g.drawRect(100, 10, 15, 15); 
		//g.drawRect(100, 10, 15, 15);
		//g.drawRect(125, 50, 15, 15); 
		//g.drawRect(75, 50, 15, 15);
		//g.drawRect(50, 90, 15, 15); 
		//g.drawRect(100, 90, 15, 15); 
		//g.drawRect(150, 90, 15, 15);
		//g.drawRect(25, 130, 15, 15); 
		//g.drawRect(75, 130, 15, 15); 
		//g.drawRect(125, 130, 15, 15); 
		//g.drawRect(175, 130, 15, 15);
		//g.drawLine(115, 25, 125, 50);
		//g.drawLine(100, 25, 90, 50);
		//g.drawLine(90, 57, 125, 57);
		//g.drawLine(75, 65, 65, 90);
		//g.drawLine(90, 65, 100, 90);
		
		
		TrianglePuzzle puzzle = model.getPuzzle();
		for (Node n : puzzle.getNodes()) {
			if (n.getState() == false) {
				g.drawRect(n.getStartX(), n.getStartY(), 15, 15);
	            }	
			else {
				g.fillRect(n.getStartX(), n.getStartY(), 15, 15);
				}
			}
		for (Edge e : puzzle.getEdges()) {
			
			g.setColor(e.getEdgecolor());
			g.drawLine(e.getEdgeposx1(), e.getEdgeposy1(), e.getEdgeposx2(), e.getEdgeposy2());
		}	
	}

	}

