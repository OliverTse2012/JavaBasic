package logging;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class LoggingImageViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (System.getProperty("java.util.logging.config.class") == null 
				&& System.getProperty("java.util.logging.config.file") == null) {	
			try {
				Logger.getLogger("com.horstmann.corejava").setLevel(Level.ALL);
				final int LOG_ROTATION_COUNT = 10;
				Handler handle = new FileHandler("%h/Logging ImagViewer.log", 0, LOG_ROTATION_COUNT);
				Logger.getLogger("com.horstmann.corejava").addHandler(handle);
			} catch (IOException e) {
				Logger.getLogger("com.horstmann.corejava").log(Level.SEVERE, "Can't create log file handle", e);
			} 
		}
		
		EventQueue.invokeLater(new Runnable() {

			@Override
				public void run() {
				// TODO Auto-generated method stub
				Handler windowHandler = new WindowHandler();
				windowHandler.setLevel(Level.ALL);
				Logger.getLogger("com.horstmann.corejava").addHandler(windowHandler);
				
				JFrame frame = new ImageViewerFrame();
				frame.setTitle("loggingImageViewer");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Logger.getLogger("com.horsetmann.corejava").fine("showing frame");
				frame.setVisible(true);
			}
		});
	}
}

	





