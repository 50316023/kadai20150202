package finalproject;


	import finalproject.Finalproject_view; 

	import java.awt.BorderLayout; 
	import java.awt.Frame; 
	import java.awt.event.ActionListener; 
	import java.awt.event.WindowListener; 
	import java.sql.ResultSet; 
	import java.sql.SQLException; 

	import org.jfree.chart.ChartFactory; 
	import org.jfree.chart.ChartPanel; 
	import org.jfree.chart.JFreeChart; 
	import org.jfree.chart.plot.PlotOrientation; 
	import org.jfree.data.category.DefaultCategoryDataset; 


	public class Finalproject_main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int id, score,c=1;
			String name;
			ResultSet rs;
			MySQL mysql = new MySQL();
			rs = mysql.selectAll();
			

	        Finalproject_view graph = new Finalproject_view(); 
	               	graph.setBounds(5,5,655,455); 
	          		graph.setVisible(true); 
	                		 
	                 	    try { 
	                 			while(rs.next()){ 
	                 			    id = rs.getInt("id"); 
	                 			    score = rs.getInt("score"); 
	                 			    graph.Addtest(score,id,c); 
	                 				} 
	                 		} catch (SQLException e) { 
	                 			// TODO Auto-generated catch block 
	                 		 
	                 			e.printStackTrace(); 
	                 		} 


	             

		}

	}

