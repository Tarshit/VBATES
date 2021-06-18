package mypack;

import java.awt.EventQueue;
import java.awt.*;
import java.sql.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import marytts.modules.synthesis.Voice;

import javax.swing.JEditorPane;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

public class Displayinfo {

	JFrame frame;


	public Displayinfo(ResultSet x) {
		initialize(x);
	}

	private void initialize(ResultSet y) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBackground(new Color(0, 255, 0));
		frame.setBounds(0, 0, 1800, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Book Ticket");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Banking window = new Banking();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		btnNewButton.setBounds(257, 554, 388, 56);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("BUS_ID");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(97, 33, 95, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel busid = new JLabel("New label");
		busid.setBackground(new Color(0, 0, 0));
		busid.setForeground(new Color(255, 255, 255));
		busid.setBounds(103, 97, 61, 16);
		frame.getContentPane().add(busid);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(296, 33, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel from = new JLabel("New label");
		from.setBackground(new Color(0, 0, 0));
		from.setForeground(new Color(255, 255, 255));
		from.setBounds(296, 97, 61, 16);
		frame.getContentPane().add(from);
		
		JLabel lblNewLabel_4 = new JLabel("TO");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(437, 33, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel to = new JLabel("New label");
		to.setBackground(new Color(0, 0, 0));
		to.setForeground(new Color(255, 255, 255));
		to.setBounds(437, 97, 61, 16);
		frame.getContentPane().add(to);
		
		JLabel lblNewLabel_6 = new JLabel("AVALIABLE SEATS");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(567, 33, 190, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel avalible = new JLabel("New label");
		avalible.setBackground(new Color(0, 0, 0));
		avalible.setForeground(new Color(255, 255, 255));
		avalible.setBounds(584, 97, 61, 16);
		frame.getContentPane().add(avalible);
		
		JLabel lblNewLabel_8 = new JLabel("DEPARTURE");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(801, 29, 132, 25);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel departure = new JLabel("New label");
		departure.setBackground(new Color(0, 0, 0));
		departure.setForeground(new Color(255, 255, 255));
		departure.setBounds(804, 97, 61, 16);
		frame.getContentPane().add(departure);
		
		JLabel lblNewLabel_10 = new JLabel("FAIR");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(994, 29, 190, 25);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel fare = new JLabel("New label");
		fare.setForeground(new Color(255, 255, 255));
		fare.setBackground(new Color(0, 0, 0));
		fare.setBounds(997, 97, 61, 16);
		frame.getContentPane().add(fare);
		
		JLabel lblNewLabel_1 = new JLabel("PLATFORM");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(1161, 33, 103, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel platform = new JLabel("New label");
		platform.setForeground(new Color(255, 255, 255));
		platform.setBounds(1163, 97, 61, 16);
		frame.getContentPane().add(platform);
		
		JLabel lblNewLabel_3 = new JLabel("TIME");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(1313, 33, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel time = new JLabel("New label");
		time.setForeground(new Color(255, 255, 255));
		time.setBounds(1313, 97, 61, 16);
		frame.getContentPane().add(time);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(255, 69, 0));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(794, 554, 203, 56);
		frame.getContentPane().add(btnNewButton_1);
		
		
		try {
			y.next();
			busid.setText(y.getString("bus_id"));
			from.setText(y.getString("start"));
			to.setText(y.getString("end"));
			avalible.setText(y.getString("avaliable_seats"));
			departure.setText(y.getString("pickup_time"));
			fare.setText(y.getString("fair-per_km"));
			platform.setText(y.getString("platformNo"));
			time.setText(y.getString("pickup_time"));
			
			JButton btnNewButton_2 = new JButton("BACK");
			btnNewButton_2.addActionListener(new ActionListener() {
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
			btnNewButton_2.setOpaque(true);
			btnNewButton_2.setBorderPainted(false);
			btnNewButton_2.setBackground(new Color(255, 69, 0));
			btnNewButton_2.setForeground(new Color(255, 255, 255));
			btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			btnNewButton_2.setBounds(669, 710, 117, 41);
			frame.getContentPane().add(btnNewButton_2);
			TextToSpeech tts = new TextToSpeech();
			tts.setVoice("cmu-rms-hsmm");
			tts.speak("There is a bus scheduled from "+from.getText()+" to "+to.getText()+" at "+time.getText()+" you can book a ticket below", 2f, false, true);
			
			
		}
		catch(Exception exc) {
			TextToSpeech tts = new TextToSpeech();
			tts.setVoice("cmu-rms-hsmm");
			tts.speak("sorry there is no bus Scheduled", 2f, false, true);
			JOptionPane.showMessageDialog(null, "no bus schuled today");
			System.out.println(exc);
		}
	}
}
