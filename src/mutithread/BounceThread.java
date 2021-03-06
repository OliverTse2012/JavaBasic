package mutithread;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BounceThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame = new BounceFrame2();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}

class BallRunnable implements Runnable {

	private Ball ball;
	private Component compoent;
	public static final int STEPS = 1000;
	public static final int DELAY = 3;
	
	public BallRunnable(Ball aBall, Component aCompoent) {
		// TODO Auto-generated constructor stub
		ball = aBall;
		compoent = aCompoent;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 1; i <=STEPS; i++) {
				ball.move(compoent.getBounds());
				compoent.repaint();
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException e) {
			
		}
	}
}

class BounceFrame2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BallComponent comp;
	public static final int STEPS = 1000;
	public static final int DELAY = 3;
	
	public BounceFrame2() {
		setTitle("Bounce");
		comp = new BallComponent();
		add(comp, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		
		addButton(buttonPanel, "Start", new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addBall();
			}
		});
		
		addButton(buttonPanel, "Close", new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}
	
	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}
	
	public void addBall() {
//		try {
//			Ball ball = new Ball();
//			comp.add(ball);
//			
//			for (int i = 1; i <= STEPS; i++) {
//				ball.move(comp.getBounds());
//				comp.paint(comp.getGraphics());
//				Thread.sleep(DELAY);
//			}
//		} catch (InterruptedException e){
//			e.printStackTrace();
//		}
		
		Ball b = new Ball();
		comp.add(b);
		Runnable r = new BallRunnable(b, comp);
		Thread t = new Thread(r);
		t.start();
	}
}
