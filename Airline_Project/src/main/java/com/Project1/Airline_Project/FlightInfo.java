package com.Project1.Airline_Project;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;


public class FlightInfo extends JFrame {
	 public FlightInfo() {
	        
	        getContentPane().setBackground(Color.WHITE);
	        setLayout(null);
	        
	        JTable table = new JTable();
	        
	        try {
	            Conn conn = new Conn();
	            
	            ResultSet rs = conn.s.executeQuery("select * from flight");
	            table.setModel(DbUtils.resultSetToTableModel(rs));
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	        
	        JScrollPane jsp = new JScrollPane(table);
	        jsp.setBounds(0, 0, 800, 500);
	        add(jsp);
	        
	        setSize(800, 500);
	        setLocation(400, 200);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new FlightInfo();
	    }

}
