package dvdapp;



import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class dvdadmingui extends JFrame{

	 private static final long serialVersionUID = 1L;
	 
	 private static DvdQueries dvdQueries;
	
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("DVD Rental App"); // Main window
		
		dvdQueries = new DvdQueries();
		JFrame movieinfo = new JFrame ("About movie"); // About movie window
		JFrame filmlist = new JFrame ("Film list"); // Film list window
		JFrame pricelist = new JFrame ("Price list"); // Price list window
		
		// Frames for DB interaction
		
		JFrame addmoviefr = new JFrame ("Add new movie"); // Add movie window
		JFrame delmoviefr = new JFrame ("Delete movie"); // Delete movie window
		JFrame updmoviefr = new JFrame ("Update movie info"); // Update movie info window
	
		myFrame.getContentPane().setLayout(null);
		myFrame.getContentPane().setBackground(Color.ORANGE);
		
		 DvdQueries dvdQueries = null;


		// Main window settings
		
		myFrame.setBounds(0,0,500,500);
		myFrame.setLocationRelativeTo(null);  
		
		// "About Movie" window settings 
		
		movieinfo.setBounds(0,0,350,350);
		
		// "Film list" window settings
		
		filmlist.setBounds(0,0, 350,350);
		
		// "Price list" window settings
		
		pricelist.setBounds(0,0, 350,350);
		
		// "Add movie" window settings
		
		addmoviefr.setBounds(0,0, 350,350);
		addmoviefr.getContentPane().setLayout(null);
		addmoviefr.getContentPane().setBackground(Color.ORANGE);
		
		// "Delete Movie" window settings
		
		delmoviefr.setBounds(0,0, 350,350);
		delmoviefr.getContentPane().setLayout(null);
		delmoviefr.getContentPane().setBackground(Color.ORANGE);
		
		// "Update movie info" window settings
		
		updmoviefr.setBounds(0,0, 350,350);
		updmoviefr.getContentPane().setLayout(null);
		updmoviefr.getContentPane().setBackground(Color.ORANGE);
		
		// User input field 
		
		JTextField film = new JTextField();
		film.setBounds(155,60,150,25);
		myFrame.getContentPane().add(film);
		
		// Label with text : "What movie do you want to watch?"
		
		JLabel qlabel = new JLabel ("What movie do you want to watch?");
		qlabel.setBounds(130,30,300,20);
		myFrame.getContentPane().add(qlabel);
		
		// Button Check
		
		JButton check = new JButton("Check");
		check.setBounds(125,100, 100,50);
		myFrame.add(check);
		
		// Button Order
		
		JButton order = new JButton("Order");
		order.setBounds(235,100, 100,50);
		myFrame.add(order);
		
		// Menu
		
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Movies");
		JMenu menu2 = new JMenu("About");
		JMenu menu3 = new JMenu("Prices");
		
		// "About movie" button in the About-menu 
		JMenuItem aboutm = new JMenuItem("About movie");
		menu2.add(aboutm);
		
		// Movie list button in the film-menu
		JMenuItem mlist = new JMenuItem("Film list");
		menu.add(mlist);
		
		// "Add movie" button in the film-menu
		JMenuItem addmovie = new JMenuItem("Add movie");
		menu.add(addmovie);
		
		// "Delete movie" button in the film-menu
		JMenuItem delmovie = new JMenuItem("Delete movie");
		menu.add(delmovie);
		
		// "Update movie info" button in the film-menu
		JMenuItem updmovie = new JMenuItem("Update movie info");
		menu.add(updmovie);
		
		// Price list button in the film-menu
		JMenuItem plist = new JMenuItem("Price list");
		menu3.add(plist);
		
		
		// Menu bar 
		
		menubar.add(menu);
		menubar.add(menu2);
		menubar.add(menu3);
		myFrame.setJMenuBar(menubar);
		
		// Additional frames GUI 
		
		// "Add movie frame": Should be name, director, genre and year fields (input) + button
		myFrame.getContentPane().add(qlabel);
		
		JLabel namelabel = new JLabel ("Movie name: ");
		JLabel directorlabel = new JLabel ("Director name: ");
		JLabel genrelabel = new JLabel ("Movie genre: ");
		JLabel ylabel = new JLabel ("Movie year: ");
		
		namelabel.setBounds(40, 30, 300,20);
		directorlabel.setBounds(40, 55, 300, 20);
		genrelabel.setBounds(40, 80, 300, 20);
		ylabel.setBounds(40, 105, 300, 20);
		
		addmoviefr.getContentPane().add(namelabel);
		addmoviefr.getContentPane().add(directorlabel);
		addmoviefr.getContentPane().add(genrelabel);
		addmoviefr.getContentPane().add(ylabel);
		
		JTextField mname = new JTextField();
		JTextField mdir = new JTextField();
		JTextField mgenre = new JTextField();
		JTextField myear = new JTextField();
		
		mname.setBounds(130,30,150,25);
		mdir.setBounds(130,55,150,25);
		mgenre.setBounds(130,80,150,25);
		myear.setBounds(130,105,150,25);
		
		addmoviefr.getContentPane().add(mname);
		addmoviefr.getContentPane().add(mdir);
		addmoviefr.getContentPane().add(mgenre);
		addmoviefr.getContentPane().add(myear);
		
		JButton addmov = new JButton("Add Movie");
		addmov.setBounds(150,140, 100,50);
		addmoviefr.add(addmov);
		
		addmov.addActionListener(new ActionListener() 
		{
			
			 public void actionPerformed(ActionEvent arg0)
			{
				
				
				dvdQueries .addMovie(mname.getText(), mdir.getText(), mgenre.getText(), Integer.parseInt(myear.getText()));
			}
		});
		// Update movie
		JLabel namelabel1 = new JLabel ("Movie name: ");
		JLabel directorlabel1 = new JLabel ("Director name: ");
		JLabel genrelabel1 = new JLabel ("Movie genre: ");
		JLabel ylabel1 = new JLabel ("Movie year: ");
		
		namelabel1.setBounds(40, 30, 300,20);
		directorlabel1.setBounds(40, 55, 300, 20);
		genrelabel1.setBounds(40, 80, 300, 20);
		ylabel1.setBounds(40, 105, 300, 20);
		
		updmoviefr.getContentPane().add(namelabel1);
		updmoviefr.getContentPane().add(directorlabel1);
		updmoviefr.getContentPane().add(genrelabel1);
		updmoviefr.getContentPane().add(ylabel1);
		
		JTextField mname1 = new JTextField();
		JTextField mdir1 = new JTextField();
		JTextField mgenre1 = new JTextField();
		JTextField myear1 = new JTextField();
		
		mname1.setBounds(130,30,150,25);
		mdir1.setBounds(130,55,150,25);
		mgenre1.setBounds(130,80,150,25);
		myear1.setBounds(130,105,150,25);
		
		updmoviefr.getContentPane().add(mname1);
		updmoviefr.getContentPane().add(mdir1);
		updmoviefr.getContentPane().add(mgenre1);
		updmoviefr.getContentPane().add(myear1);
		
		JButton updmov = new JButton("Update Movie info");
		updmov.setBounds(120,140, 160,50);
		updmoviefr.add(updmov);
		
		// Delete movie
		JLabel deletemovie = new JLabel ("Movie name: ");
		
		deletemovie.setBounds(40, 30, 300,20);
		
		delmoviefr.getContentPane().add(deletemovie);
		
		JTextField moname = new JTextField();
		moname.setBounds(130,30,150,25);
		delmoviefr.getContentPane().add(moname);
		
		JButton delmov = new JButton("Delete movie");
		delmov.setBounds(120,140, 160,50);
		delmoviefr.add(delmov);
	
		
		// Click on menus functions
		
		// About movie
		aboutm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
				
				movieinfo.setVisible(true);
			}
		});
		
		// Price list
		plist.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				pricelist.setVisible(true);
			}
		});

		// Film list
		mlist.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				filmlist.setVisible(true);
			}
		});
		
		// Add movie
		addmovie.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
				
				addmoviefr.setVisible(true);
			}
		});
		
		// Delete movie
		delmovie.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				delmoviefr.setVisible(true);
			}
		});
		
		// Update movie info
		updmovie.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				updmoviefr.setVisible(true);
			}
		});
		myFrame.setVisible(true);
	}
}
