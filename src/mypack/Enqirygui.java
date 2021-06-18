package mypack;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import marytts.modules.synthesis.Voice;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;

public class Enqirygui {

	JFrame frame;
	private JTextField from;
	private JTextField to;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enqirygui window = new Enqirygui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Enqirygui() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(0, 0, 1800, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		from = new JTextField();
		from.setBounds(559, 160, 266, 54);
		frame.getContentPane().add(from);
		from.setColumns(10);
		
		to = new JTextField();
		to.setBounds(559, 338, 266, 54);
		frame.getContentPane().add(to);
		to.setColumns(10);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("FROM");
		lblNewJgoodiesLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		lblNewJgoodiesLabel.setForeground(new Color(255, 69, 0));
		lblNewJgoodiesLabel.setBounds(338, 147, 142, 81);
		frame.getContentPane().add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("TO");
		lblNewJgoodiesLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		lblNewJgoodiesLabel_1.setForeground(new Color(255, 69, 0));
		lblNewJgoodiesLabel_1.setBounds(346, 347, 120, 45);
		frame.getContentPane().add(lblNewJgoodiesLabel_1);
		
		TextToSpeech tts = new TextToSpeech();
		tts.setVoice("cmu-rms-hsmm");
		tts.speak("ENTER your current location and destination", 2f, false, true);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.setOpaque(true);
		btnNewButton.setBounds(567, 570, 258, 71);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Search s1 = new Search();
					ResultSet Rs = s1.search(from.getText(), to.getText());
					EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Displayinfo window = new Displayinfo(Rs);
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
					
				}
				catch(Exception exc) {
					
					
				}
				
			}
		});
		frame.getContentPane().add(btnNewButton);
	}
}
