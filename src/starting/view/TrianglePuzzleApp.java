package starting.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import starting.controller.MouseHandler;
import starting.controller.ResetController;
import starting.controller.UnselectAllNodesController;
import starting.controller.SwapEdgeController;
import starting.controller.SolveTrianglePuzzleController;
import starting.model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

public class TrianglePuzzleApp extends JFrame {

	private JPanel contentPane;
	Model model;
	TrianglePuzzleDrawer panel;
	JLabel playerScoreLabel;
	JLabel playerMovesLabel;
	JLabel lblSolvePuzzle;
	
	public TrianglePuzzleDrawer getPanel() { return panel; }
	public JLabel getScoresLabel() { return playerScoreLabel; }
	public JLabel getMovesLabel() { return playerMovesLabel; }
	public JLabel getSolvePuzzleLabel() { return lblSolvePuzzle;}

	/**
	 * Create the frame.
	 */
	public TrianglePuzzleApp(Model model) {
		this.model = model;
		setTitle("Triangle Puzzle Application -- CS509");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel = new TrianglePuzzleDrawer(model);
		
		// connects mouse events...
		panel.addMouseListener(new MouseHandler(model, this));
		
		JButton btnSwap = new JButton("Swap Edges");
		btnSwap.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SwapEdgeController(model, TrianglePuzzleApp.this).process();
				new SolveTrianglePuzzleController(model, TrianglePuzzleApp.this).process();
			}
		});
		
		JButton btnUnselectAll = new JButton("Unselect All");
		btnUnselectAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new UnselectAllNodesController(model, TrianglePuzzleApp.this).process();
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ResetController(model, TrianglePuzzleApp.this).process();
			}
		});
		
		JLabel lblMoves = new JLabel("Moves:");
		
		JLabel lblScore = new JLabel("Score:");

		playerMovesLabel = new JLabel("" + model.getNumMoves());
		
		playerScoreLabel = new JLabel("" + model.getScore());
		
		lblSolvePuzzle = new JLabel("");
					
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnUnselectAll, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnSwap, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblMoves)
									.addGap(18)
									.addComponent(playerMovesLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblScore)
									.addGap(18)
									.addComponent(playerScoreLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(lblSolvePuzzle, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMoves)
								.addComponent(playerMovesLabel))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblScore)
								.addComponent(playerScoreLabel))
							.addGap(51)
							.addComponent(lblSolvePuzzle, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnUnselectAll)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSwap)
								.addComponent(btnReset))))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
