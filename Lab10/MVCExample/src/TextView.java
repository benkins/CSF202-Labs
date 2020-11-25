import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * The view for a text view of the model.
 */
public class TextView extends JFrame implements Observer {
	private BirdCounter birdCounter;
	
	private JLabel bluetitsCountLabel;
	private JLabel pigeonsCountLabel;
	private JLabel robinsCountLabel;
	private JLabel sparrowsCountLabel;
	private JLabel ducksCountLabel;

	/**
	 * Create the text view.
	 * @param textController We need the controller so we can register the callbacks on various button clicks.
	 */
	public TextView(Controller controller) {
		this.birdCounter = controller.getBirdCounter();
		this.birdCounter.addObserver(this);
		
		this.setTitle("Bird Counter - Text View");
		this.setPreferredSize(new Dimension(300, 150));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(0,3));
		
		JLabel bluetitsLabel = new JLabel("Bluetit");
		this.add(bluetitsLabel);
		bluetitsCountLabel = new JLabel(Integer.toString(birdCounter.getBluetits()));
		this.add(bluetitsCountLabel);
		JButton bluetitsButton = new JButton("Inc");
		bluetitsButton.setActionCommand("INC_BLUETITS");
		bluetitsButton.addActionListener(controller);
		this.add(bluetitsButton);
		
		JLabel pigeonsLabel = new JLabel("Pigeons");
		this.add(pigeonsLabel);
		pigeonsCountLabel = new JLabel(Integer.toString(birdCounter.getPigeons()));
		this.add(pigeonsCountLabel);
		JButton pigeonsButton = new JButton("Inc");
		pigeonsButton.setActionCommand("INC_PIGEONS");
		pigeonsButton.addActionListener(controller);
		this.add(pigeonsButton);
		
		JLabel robinsLabel = new JLabel("Robin");
		this.add(robinsLabel);
		robinsCountLabel = new JLabel(Integer.toString(birdCounter.getRobins()));
		this.add(robinsCountLabel);
		JButton robinsButton = new JButton("Inc");
		robinsButton.setActionCommand("INC_ROBINS");
		robinsButton.addActionListener(controller);
		this.add(robinsButton);
		
		JLabel sparrowsLabel = new JLabel("Sparrows");
		this.add(sparrowsLabel);
		sparrowsCountLabel = new JLabel(Integer.toString(birdCounter.getSparrows()));
		this.add(sparrowsCountLabel);
		JButton sparrowsButton = new JButton("Inc");
		sparrowsButton.setActionCommand("INC_SPARROWS");
		sparrowsButton.addActionListener(controller);
		this.add(sparrowsButton);

		JLabel duckLabel = new JLabel("ducks");
		this.add(duckLabel);
		ducksCountLabel = new JLabel(Integer.toString(birdCounter.getDucks()));
		this.add(sparrowsCountLabel);
		JButton ducksButton = new JButton("Inc");
		ducksButton.setActionCommand("INC_DUCKS");
		ducksButton.addActionListener(controller);
		this.add(ducksButton);
		
		this.pack();
		this.setVisible(true);
	}

	/**
	 * This method will get called when the bird counter changes (observer pattern).
	  @param o The BirdCounter model that changed. As we only observe one BirdCounter we know that our instance variable birdCounter caused this.
	  @param arg Not used.
	 */
	public void update(Observable o, Object arg) {
		bluetitsCountLabel.setText(Integer.toString(birdCounter.getBluetits()));
		pigeonsCountLabel.setText(Integer.toString(birdCounter.getPigeons()));
		robinsCountLabel.setText(Integer.toString(birdCounter.getRobins()));
		sparrowsCountLabel.setText(Integer.toString(birdCounter.getSparrows()));
		ducksCountLabel.setText(Integer.toString(birdCounter.getDucks()));

	}
}
