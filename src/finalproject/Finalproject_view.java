package finalproject;

	
import java.awt.BorderLayout; 
	 import java.awt.Frame; 
	 import java.awt.event.ActionEvent; 
	 import java.awt.event.ActionListener; 
	 import java.awt.event.WindowEvent; 
	 import java.awt.event.WindowListener; 
	 import java.sql.ResultSet; 
	 import java.sql.SQLException; 
	 
	 
	 import org.jfree.chart.ChartFactory; 
	 import org.jfree.chart.ChartPanel; 
	 import org.jfree.chart.JFreeChart; 
	 import org.jfree.chart.plot.PlotOrientation; 
	 import org.jfree.data.category.DefaultCategoryDataset; 
	 
	 
	 public class Finalproject_view extends Frame implements ActionListener,WindowListener { 
	 	 
	 	DefaultCategoryDataset data = new DefaultCategoryDataset(); 
	 	 
	 	public Finalproject_view(){ 
	 		addWindowListener(this); 
	 		setTitle("test"); 
	 		 
	 		JFreeChart chart =  
	 					ChartFactory.createLineChart("test", 
	 	                                   "times", 
	 	                                   "score", 
	 	                                   data, 
	 	                                   PlotOrientation.VERTICAL, 
	 	                                   true, 
	 	                                   false, 
	 	                                   false); 
	 
	
	 		ChartPanel cpanel = new ChartPanel(chart); 
	 		add(cpanel, BorderLayout.CENTER); 
	 
	 
	 	} 
	 
	 
	 	@Override 
	 	public void windowActivated(WindowEvent arg0) { 
	 		// TODO Auto-generated method stub 
	 		 
	 	} 
	 
	
	 	@Override 
	 	public void windowClosed(WindowEvent e) { 
	 		// TODO Auto-generated method stub 
	 		 
	 	} 
	 
	
	 	@Override 
	 	public void windowClosing(WindowEvent e) { 
	 		// TODO Auto-generated method stub 
	 		System.exit(0); 
	 	} 
	 
	 
	 	@Override 
	 	public void windowDeactivated(WindowEvent e) { 
	 		// TODO Auto-generated method stub 
	 		 
	 	} 
	 
	
	 	@Override 
	 	public void windowDeiconified(WindowEvent e) { 
	 		// TODO Auto-generated method stub 
	 		 
	 	} 
	 
	 
	 	@Override 
	 	public void windowIconified(WindowEvent e) { 
	 		// TODO Auto-generated method stub 
	 		 
	 	} 
	 
	 
	 	@Override 
	 	public void windowOpened(WindowEvent e) { 
	 		// TODO Auto-generated method stub 
	 		 
	 	} 
	 
	 
	 	@Override 
	 	public void actionPerformed(ActionEvent e) { 
	 		// TODO Auto-generated method stub 
	 		 
	 	} 
	 
	 
	 	public void Addtest(int score, int id,int c) { 
	 		// TODO Auto-generated method stub 
	 		String a=String.valueOf(id); 
	 		data.addValue(score,"test",a);  
	 		 
	 	} 
} 





