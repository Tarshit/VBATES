package mypack;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Profile {

	JFrame frame;
	String usr;


	public Profile(String x) {
		initialize(x);
	}

	private void initialize(String y) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		frame.setBounds(0, 0, 1800, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(359, 181, 130, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel name = new JLabel("");
		name.setForeground(new Color(255, 255, 255));
		name.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		name.setBounds(543, 177, 348, 36);
		frame.getContentPane().add(name);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(362, 251, 61, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel age = new JLabel("");
		age.setForeground(new Color(255, 255, 255));
		age.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		age.setBounds(544, 239, 209, 66);
		frame.getContentPane().add(age);
		
		JLabel lblNewLabel_2 = new JLabel("Phone");
		lblNewLabel_2.setForeground(new Color(255, 69, 0));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(362, 328, 130, 42);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel phone = new JLabel("");
		phone.setForeground(new Color(255, 255, 255));
		phone.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		phone.setBounds(544, 325, 192, 48);
		frame.getContentPane().add(phone);
		
		JLabel lblNewLabel_3 = new JLabel("Address:");
		lblNewLabel_3.setForeground(new Color(255, 69, 0));
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(359, 393, 186, 48);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel address = new JLabel("");
		address.setForeground(new Color(255, 255, 255));
		address.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		address.setBounds(432, 444, 796, 59);
		frame.getContentPane().add(address);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setForeground(new Color(255, 69, 0));
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(362, 526, 130, 36);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel gender = new JLabel("");
		gender.setForeground(new Color(255, 255, 255));
		gender.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		gender.setBounds(582, 536, 154, 29);
		frame.getContentPane().add(gender);
		
		JLabel lblNewLabel_5 = new JLabel("User name");
		lblNewLabel_5.setForeground(new Color(255, 69, 0));
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(362, 591, 154, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel username = new JLabel("");
		username.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		username.setForeground(new Color(255, 255, 255));
		username.setBounds(582, 591, 171, 29);
		frame.getContentPane().add(username);
		
		JLabel password = new JLabel("");
		password.setBounds(168, 407, 61, 16);
		frame.getContentPane().add(password);
		
		
		try {
			System.out.println(y);
			Verifypassword v1 = new Verifypassword();
			ResultSet m=v1.verify(y);
			name.setText(m.getString("firstname")+" "+m.getString("lastname"));
			age.setText(m.getString("age"));
			phone.setText(m.getString("phoneNo"));
			address.setText(m.getString("doorNO")+", "+m.getString("street")+", "+m.getString("city")+", "+m.getString("zipcode")+", "+m.getString("state"));
			gender.setText(m.getString("gender"));
			username.setText(m.getString("username"));
			
			JButton btnNewButton = new JButton("BACK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Welcomegui window = new Welcomegui();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			});
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setOpaque(true);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBackground(new Color(255, 69, 0));
			btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
			btnNewButton.setBounds(511, 715, 192, 42);
			frame.getContentPane().add(btnNewButton);
			
			JLabel lblNewLabel_6 = new JLabel("PROFILE");
			lblNewLabel_6.setForeground(new Color(255, 69, 0));
			lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
			lblNewLabel_6.setBounds(458, 53, 203, 36);
			frame.getContentPane().add(lblNewLabel_6);
		}
		catch(Exception exc) {
			System.out.println(exc);
			
		}
		
	
	}
}
